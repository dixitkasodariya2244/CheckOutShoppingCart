import org.example.Checkout;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    //Offers - Buy One Get One Free on Apples
    @Test
    void bogofApples_offer() {
        assertEquals(0.60, Checkout.totalWithOffers(List.of("Apple", "Apple"))); // pay for 1
        assertEquals(1.20, Checkout.totalWithOffers(List.of("Apple", "Apple", "Apple"))); // pay for 2
        assertEquals(1.20, Checkout.totalWithOffers(List.of("Apple", "Apple", "Apple", "Apple"))); // pay for 2
    }

    //Offers - 3 for 2 on Oranges
    @Test
    void threeForTwoOranges_offer() {
        assertEquals(0.50, Checkout.totalWithOffers(List.of("Orange", "Orange", "Orange"))); // pay for 2
        assertEquals(0.75, Checkout.totalWithOffers(List.of("Orange", "Orange", "Orange", "Orange"))); // pay for 3
    }

    //Mixed offers applied together
    @Test
    void mixedOffers_combined() {
        // 3 apples -> pay for 2 = £1.20
        // 1 orange = £0.25
        // total = £1.45
        assertEquals(1.45, Checkout.totalWithOffers(List.of("Apple", "Apple", "Orange", "Apple")));
    }

    //null input should throw an exception
    @Test
    void nullListThrows() {
        assertThrows(IllegalArgumentException.class, () -> Checkout.total(null));
        assertThrows(IllegalArgumentException.class, () -> Checkout.totalWithOffers(null));
    }

    // unknown item should throw an exception
    @Test
    void unknownItemThrows() {
        assertThrows(IllegalArgumentException.class, () -> Checkout.total(List.of("Banana")));
    }

    //input should be case-insensitive and ignore whitespace
    @Test
    void caseAndWhitespaceInsensitive() {
        assertEquals(0.60, Checkout.total(List.of("  apple  "))); // spaces
        assertEquals(0.25, Checkout.total(List.of("ORANGE")));    // uppercases
    }

}
