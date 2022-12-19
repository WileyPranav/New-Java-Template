package com.wileyedge.java_oop_2_7;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class MainTest {

    @Test
    void TestMain() throws IOException {
        PrintStream originalOut = System.out; // to have a way to undo the binding with your `ByteArrayOutputStream`
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        // action
        Main.main(null);
        // assertion
        Assert.assertEquals("Hello, World!\r\n", bos.toString());
        // undo the binding in System
        System.setOut(originalOut);
    }
}