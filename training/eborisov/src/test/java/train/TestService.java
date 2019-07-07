package train;

import org.junit.*;

public class TestService {
    @Test
    public void testMsg() {
        final String message = new Service().getMsg();
        System.out.println(message);
        Assert.assertEquals("2 B || ! 2 B", message);
    }
}
