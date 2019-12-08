package com.datastructures.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NodeTest {

    @Test
    @DisplayName("Should return a set value from a Node")
    void returnValueFromNode() {
        Node mainNode = new Node(7);

        int nodeValue = mainNode.getNodeValue();

        assertThat(nodeValue).isNotNull();
        assertThat(nodeValue).isEqualTo(7);

    }

    @Test
    @DisplayName("Should return null when a Node is not set with any value")
    void returnNullAsDefaultValueForNodeWithoutAnyValue() {
        Node node = new Node();

        Integer nodeValue = node.getNodeValue();

        assertThat(nodeValue).isNull();
    }

    @Test
    @DisplayName("Should get the next node reference")
    void returnNextNodeReference() {
        Node firstNode = new Node(7);
        Node secondNode = new Node(10);

        firstNode.addChild(secondNode);

        assertThat(firstNode.getNext()).isEqualTo(secondNode);
    }
}