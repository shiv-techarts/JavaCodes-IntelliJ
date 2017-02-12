/**
 * Author: Shiv Pratap Singh
 * Created on: 31-Oct-2016
 * Project: LinkedList
 * File: Node.h
 *
 * Description: 
 *      
 */

#ifndef NODE_H_
#define NODE_H_

#include <iostream>

class Node {
public:
	//Data Members

	int data;
	Node* next;

	//Methods

	Node(int dataEntered);
	virtual ~Node();
};

#endif /* NODE_H_ */
