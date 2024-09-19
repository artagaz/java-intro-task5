package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void palindrom() {
        assertTrue(Main.palindrom("123321"));
    }
}