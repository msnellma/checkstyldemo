import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.HelloWorld;

public class TestHelloWorld {

    private HelloWorld hello;

    @BeforeEach
    void setup() {
        hello = new HelloWorld();
    }

    @Test
    void testSayHello_shouldReturnHelloWorld() {
        String result = hello.sayHelloWorld();
        assertEquals("Hello world!", result, "Method did not say Hello World! :(");
    }

}
