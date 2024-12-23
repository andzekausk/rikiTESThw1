package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.HelloWorld;

class HelloWorldTest {

	@Test
    public void testGreet() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.greet("John");
        assertEquals("Hello, John!", result, "Greet method should return 'Hello, {name}!'");
    }

}
