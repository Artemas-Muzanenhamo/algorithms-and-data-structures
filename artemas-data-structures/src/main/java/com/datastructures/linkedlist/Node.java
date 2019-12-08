package com.datastructures.linkedlist;

class Node {
    private Integer nodeValue;
    private Node next;

    Node() { }

    Node(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }

    Integer getNodeValue() {
        return nodeValue;
    }

    Node getNext() {
        return next;
    }

    void addChild(Node childNode) {
        this.next = childNode;
    }
}
