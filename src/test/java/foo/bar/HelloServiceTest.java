package foo.bar;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloServiceTest {

    private HelloService helloService = new HelloService();

    @Test
    public void testHello() throws Exception {
        assertEquals("Hello, World!", helloService.hello("World"));
    }
}