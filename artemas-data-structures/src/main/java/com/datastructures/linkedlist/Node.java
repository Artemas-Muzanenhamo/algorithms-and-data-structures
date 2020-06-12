package com.datastructures.linkedlist;

import java.util.ArrayList;
import java.util.List;

class Node {
    private Integer nodeValue;
    private Node next;

    Node() { }

    Node(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }

    static List<Node> printNodes(Node node) {
        List<Node> nodes = new ArrayList<>();

        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        return nodes;
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

    @Override
    public String toString() {
        return "Node{" +
                "nodeValue=" + nodeValue +
                ", next=" + next +
                '}';
    }
}
