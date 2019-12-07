package com.datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NodeTest {

    private Node node;

    @Test
    @DisplayName("Should return a set value from a Node")
    void returnValueFromNode() {
        node = new Node(7);

        int nodeValue = node.getNodeValue();

        assertThat(nodeValue).isNotNull();
        assertThat(nodeValue).isEqualTo(7);

    }

    @Test
    @DisplayName("Should return null when a Node is not set with any value")
    void returnNullAsDefaultValueForNodeWithoutAnyValue() {
        node = new Node();

        Integer nodeValue = node.getNodeValue();

        assertThat(nodeValue).isNull();
    }
}