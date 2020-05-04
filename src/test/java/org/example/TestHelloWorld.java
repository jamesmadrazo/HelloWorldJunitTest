package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {

    @Test
    public void checkThatHelloWorldEqualsHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello World!", helloWorld.word());
    }

    @Test
    public void checkThatWorldHelloDoesNotEqualHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertNotEquals("World Hello!", helloWorld.word());
    }

    @Test
    public void checkThatHelloWorldIsCaseSensitive(){
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertFalse("hELLO wORLD!", false);
    }
}
