package com.datastructures.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NodeTest {

    private Node node;

    @BeforeEach
    void setup() {
        node = new Node();
    }

    @Test
    @DisplayName("Should return a value from Node")
    void returnValueFromNode() {
        assertThat(node);
    }
}