package com.shiv.binarytree;

/**
 * Created by shiv on 31/12/16.
 */
import com.shiv.binarytree.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public BinaryTree() {
        this.size = 0;
        this.root = null;
    }

    public int getSize() {
        return size;
    }

    private Node<T> addElement(Node<T> curr, T data) {
        if (curr == null) {
            return new Node<>(data);
        } else {
            if (data.compareTo(curr.getData()) < 0) {
                curr.setLeft(addElement(curr.getLeft(), data));
            } else {
                curr.setRight(addElement(curr.getRight(), data));
            }
        }

        return curr;
    }

    public void add(T data) {
        if(root == null) {
            root = new Node<>(data);
        } else {
            addElement(root, data);
        }
        size++;
    }

    private void printPreOrder(Node<T> curr) {
        if(curr == null) {
            return;
        } else {
            System.out.println(curr.getData());
            printPreOrder(curr.getLeft());
            printPreOrder(curr.getRight());
        }
    }

    private void printInOrder(Node<T> curr) {
        if(curr == null) {
            return;
        } else {
            printInOrder(curr.getLeft());
            System.out.println(curr.getData());
            printInOrder(curr.getRight());
        }
    }

    private void printPostOrder(Node<T> curr) {
        if(curr == null) {
            return;
        } else {
            printPostOrder(curr.getLeft());
            printPostOrder(curr.getRight());
            System.out.println(curr.getData());
        }
    }

    public void printTree() {
        printInOrder(root);
    }

    public void printTree(int value) {
        switch (value) {
            case 1: printPreOrder(root);
                break;
            case 2: printInOrder(root);
                break;
            case 3: printPostOrder(root);
                break;
            default: printInOrder(root);
                break;
        }
    }

    private Node<T> findInTree(Node<T> curr, T data) {
        if(curr == null) {
            return null;
        } else if(data.compareTo(curr.getData()) == 0) {
            return curr;
        } else if(data.compareTo(curr.getData()) < 0) {
            return findInTree(curr.getLeft(), data);
        } else {
            return findInTree(curr.getRight(), data);
        }
    }

    private Node<T> findWithParent(Node<T> parent, T data) {
        Node<T> curr = root;
        //parent = null;

        while(curr != null) {
            int comparisionResult = data.compareTo(curr.getData());

            if(comparisionResult < 0) {
                parent = curr;
                curr = curr.getLeft();
            } else if(comparisionResult > 0){
                parent = curr;
                curr = curr.getRight();
            } else {
                break;
            }
        }

        return curr;
    }

    public boolean find(T data) {
        if(findInTree(root, data) == null) {
            System.out.println("Element Not Found");
            return false;
        } else {
            return true;
        }
    }

    public boolean remove(T data) {
        Node<T> curr, parent = null;

        curr = findWithParent(parent, data);

        if(curr == null) {
            return false;
        }

        // Case 1: If current has no right child, then currents left replaces the current
        if(curr.getRight() == null) {
            if(parent == null) {
                root = curr.getLeft();
            } else {
                int result = data.compareTo(curr.getData());
                if(result > 0) {
                    parent.setLeft(curr.getLeft());
                } else {
                    parent.setRight(curr.getLeft());
                }
            }
        }

        // Case 2: If currents right child has no left child, then currents right replaces current
        else if(curr.getRight().getLeft() == null) {
            curr.getRight().setLeft(curr.getLeft());

            if(parent == null) {
                root = curr.getRight();
            } else {
                int result = data.compareTo(curr.getData());
                if(result > 0) {
                    parent.setLeft(curr.getRight());
                } else {
                    parent.setRight(curr.getRight());
                }
            }
        }
        // Case 3: If currents right child has a left child has a left child, replace current with currents
        // right child's left-most child
        else {
            Node<T> leftMost = curr.getRight().getLeft();
            Node<T> leftMostParent = curr.getRight();

            while(leftMost.getLeft() != null) {
                leftMostParent = leftMost;
                leftMost = leftMost.getLeft();
            }

            leftMostParent.setLeft(leftMost.getRight());

            leftMost.setLeft(curr.getLeft());
            leftMost.setRight(curr.getRight());

            if(parent == null) {
                root = leftMost;
            } else {
                int result = data.compareTo(curr.getData());
                if(result > 0) {
                    parent.setLeft(leftMost);
                } else {
                    parent.setRight(leftMost);
                }
            }
        }
        size--;
        return true;
    }
}
