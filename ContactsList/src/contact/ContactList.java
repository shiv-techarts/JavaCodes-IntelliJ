package contact;


import contact.Contact;

/**
 * Created by shiv on 1/12/16.
 */
public class ContactList {
    private Contact head; //Contact Head Reference
    //private Contact tail; //Contact Tail Reference

    private static int _size; // Maintain the size of List

    // Constructor
    public ContactList() {
        this.head = null;
        //this.tail = null;
        this._size = 0;
    }

    private void addToHead(String tempName) {
        Contact tempNode = new Contact(tempName);

        if (head == null) {
            head = tempNode;
        } else {
            tempNode.setNext(head);
            head = tempNode;
        }
    }

    public void insert(String tempName) {
        // Case 1: if to be inserted at head

        if (head == null) {
            addToHead(tempName);
        } else {
            Contact newName = new Contact(tempName);
            Contact curr = head;
            Contact trail = null;

            while (curr != null) {
                if (tempName.compareTo(curr.getName()) <= 0) {
                    break;
                } else {
                    trail = curr;
                    curr = curr.getNext();
                }
            }

            // Case 2: There may be only 1 element i.e itself head
            if (curr == head) {
                newName.setNext(head);
                head = newName;
            } else { // Case 3: There are enough number of Elements
                trail.setNext(newName);
                newName.setNext(curr);
            }
        }

        _size++;
    }

    public void delete(String tempName) {
        // Case 1: if List is Empty
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Contact curr = head;
            Contact trail = null;

            while (curr != null) {
                if (tempName.compareTo(curr.getName()) == 0) {
                    break;
                } else {
                    trail = curr;
                    curr = curr.getNext();
                }
            }

            // Case 2: Element Not found
            if (curr == null) {
                System.out.println("Element Not Found");
            } else {
                if (curr == head) { // Case 3: Element is at head
                    head = head.getNext();
                } else { // Creating the connection
                    trail.setNext(curr.getNext());
                }
            }
        }

        _size--;
    }

    public void printList() {
        Contact temp = head;

        while (temp != null) {
            System.out.println(temp.getName());
            temp = temp.getNext();
        }
    }

    public int get_size() {
        return _size;
    }

    public boolean isEmpty() {
        return (_size == 0 ? true : false);
    }

}
