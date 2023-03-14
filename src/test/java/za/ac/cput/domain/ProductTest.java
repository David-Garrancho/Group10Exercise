package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {



    Product p = new Product("T123", "Toilet", "Bathroom Essentials");
    Product p2 = new Product("T142", "Shower", "Hygiene Essentials");
    Product p3 = new Product("T123", "Toilet", "Bathroom Essentials");

    @Test
    @Disabled("Disabled by David")
    void testDisabled() {
        assertEquals(p, p2);
    }

    @Test
    @Timeout(5)
    void testTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        assertNotEquals(p, p2);
    }

    @Test
    void testFail() {
        fail("This is supposed to fail");
    }

    @Test
    void testEqaulity() {
        p = p2;
        assertEquals(p, p2);
    }

    @Test
    void testFailEqaulity() {
        assertEquals(p, p2);
    }

    @Test
    void testIdentity() {
        assertSame(p, p);  // Passes, str1 and str1 are the same object
        assertNotSame(p, p2);  // Passes, str1 and str3 are not the same object
    }
}