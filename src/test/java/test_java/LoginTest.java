package test_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    // Simulasi function login
    boolean login(String username, String password) {
        return username.equals("admin") && password.equals("123");
    }

    // Scenario sukses
    @Test
    void testLoginSuccess() {
        assertTrue(login("admin", "123"));
    }

    // Scenario gagal - username salah
    @Test
    void testLoginFailWrongUsername() {
        assertFalse(login("user", "123"));
    }

    // Scenario gagal - password salah
    @Test
    void testLoginFailWrongPassword() {
        assertFalse(login("admin", "wrongpass"));
    }

    // Scenario gagal - username & password salah
    @Test
    void testLoginFailBothWrong() {
        assertFalse(login("user", "wrongpass"));
    }
}