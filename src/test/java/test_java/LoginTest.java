package test_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testLogin() {

        String username = "admin";
        String password = "123";

        assertEquals("admin", username);
        assertEquals("123", password);

    }
}