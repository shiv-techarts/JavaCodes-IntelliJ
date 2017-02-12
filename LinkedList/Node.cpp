/**
 * Author: Shiv Pratap Singh
 * Created on: 31-Oct-2016
 * Project: LinkedList
 * File: Node.cpp
 *
 * Description: 
 *      
 */

#include "Node.h"

Node::Node(int dataEntered): data(dataEntered), next(nullptr) {
	std::cout << "ctor" << std::endl;
}

Node::~Node() {
	std::cout << "dtor" << std::endl;
}

