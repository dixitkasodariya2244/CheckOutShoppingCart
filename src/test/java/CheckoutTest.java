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
    //a single Apple should cost £0.60
    @Test
    void singleAppleCosts60p() {
        assertEquals(0.60, Checkout.total(List.of("Apple")));
    }

    //a single Orange should cost £0.25
    @Test
    void singleOrangeCosts25p() {
        assertEquals(0.25, Checkout.total(List.of("Orange")));
    }


    //example from assignment -  [Apple, Apple, Orange, Apple] = 0.60 + 0.60 + 0.25 + 0.60 = £2.05
    @Test
    void mixedCartExample() {
        assertEquals(2.05, Checkout.total(List.of("Apple", "Apple", "Orange", "Apple")));
    }
}
