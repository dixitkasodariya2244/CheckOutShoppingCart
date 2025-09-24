import org.example.Checkout;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {
    //empty cart should cost £0.00
    @Test
    void emptyCartIsZero() {
        assertEquals(0.00, Checkout.total(List.of()));
    }
}
