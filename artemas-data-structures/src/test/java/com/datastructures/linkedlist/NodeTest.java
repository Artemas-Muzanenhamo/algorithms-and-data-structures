package com.datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NodeTest {

    private Node node;

    @BeforeEach
    void setup() {
        node = new Node();
    }

    @Test
    @DisplayName("Should return a set value from a Node")
    void returnValueFromNode() {
        node.setNodeValue(7);

        int nodeValue = node.getNodeValue();

        assertThat(nodeValue).isNotNull();
        assertThat(nodeValue).isEqualTo(7);

    }
}