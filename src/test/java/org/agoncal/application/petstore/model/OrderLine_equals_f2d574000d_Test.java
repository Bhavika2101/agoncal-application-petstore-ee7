// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
1. Scenario: Comparing an OrderLine instance with itself should return true.
    - Given an OrderLine instance
    - When we compare the instance with itself
    - Then the equals function should return true

2. Scenario: Comparing an OrderLine instance with null should return false.
    - Given an OrderLine instance
    - When we compare the instance with null
    - Then the equals function should return false

3. Scenario: Comparing two different OrderLine instances with the same quantity and item should return true.
    - Given two OrderLine instances with the same quantity and item
    - When we compare both instances
    - Then the equals function should return true

4. Scenario: Comparing two different OrderLine instances with different quantities should return false.
    - Given two OrderLine instances with different quantities but the same item
    - When we compare both instances
    - Then the equals function should return false

5. Scenario: Comparing two different OrderLine instances with different items should return false.
    - Given two OrderLine instances with the same quantity but different items
    - When we compare both instances
    - Then the equals function should return false

6. Scenario: Comparing an OrderLine instance with an instance of a different class should return false.
    - Given an OrderLine instance and an instance of a different class
    - When we compare both instances
    - Then the equals function should return false

7. Scenario: Comparing an OrderLine instance with an OrderLine instance having null quantity should return false.
    - Given an OrderLine instance with a quantity and another OrderLine instance with null quantity
    - When we compare both instances
    - Then the equals function should return false

8. Scenario: Comparing an OrderLine instance with an OrderLine instance having null item should return false.
    - Given an OrderLine instance with an item and another OrderLine instance with null item
    - When we compare both instances
    - Then the equals function should return false
*/
package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderLine_equals_f2d574000d_Test {

    private OrderLine orderLine1;
    private OrderLine orderLine2;
    private Item item;

    @BeforeEach
    void setUp() {
        item = new Item();
        orderLine1 = new OrderLine(1, item);
        orderLine2 = new OrderLine(1, item);
    }

    @Test
    void testEquals_sameInstance() {
        assertTrue(orderLine1.equals(orderLine1));
    }

    @Test
    void testEquals_null() {
        assertFalse(orderLine1.equals(null));
    }

    @Test
    void testEquals_sameQuantityAndItem() {
        assertTrue(orderLine1.equals(orderLine2));
    }

    @Test
    void testEquals_differentQuantity() {
        orderLine2.setQuantity(2);
        assertFalse(orderLine1.equals(orderLine2));
    }

    @Test
    void testEquals_differentItem() {
        Item anotherItem = new Item();
        orderLine2.setItem(anotherItem);
        assertFalse(orderLine1.equals(orderLine2));
    }

    @Test
    void testEquals_differentClass() {
        assertFalse(orderLine1.equals(new Object()));
    }

    @Test
    void testEquals_nullQuantity() {
        orderLine2.setQuantity(null);
        assertFalse(orderLine1.equals(orderLine2));
    }

    @Test
    void testEquals_nullItem() {
        orderLine2.setItem(null);
        assertFalse(orderLine1.equals(orderLine2));
    }
}
