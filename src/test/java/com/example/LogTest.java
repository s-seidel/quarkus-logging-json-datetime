package com.example;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class LogTest {
    @Test
    void testStartup() {
        System.out.println("Testing startup");
    }
}
