// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
1. Scenario: Null Input Validation
   Test whether the `hashCode` function handles null inputs correctly. Pass `null` for both `orderDate` and `customer` and check whether the function returns a valid hash code.

2. Scenario: Same Input Repeatability
   Validate that the `hashCode` function returns the same hash code when called multiple times with the same `orderDate` and `customer`.

3. Scenario: Different Input Uniqueness
   Test whether the `hashCode` function returns different hash codes for different combinations of `orderDate` and `customer`.

4. Scenario: OrderDate Uniqueness
   Validate that the `hashCode` function returns different hash codes for the same `customer` but different `orderDate`.

5. Scenario: Customer Uniqueness
   Test whether the `hashCode` function returns different hash codes for the same `orderDate` but different `customer`.

6. Scenario: Date Input Validation
   Test whether the `hashCode` function handles different date formats correctly. Pass `orderDate` in different formats and check whether the function returns valid hash codes.

7. Scenario: Customer Data Validation
   Validate that the `hashCode` function handles different customer data correctly. Pass `customer` with various data (like different names, addresses, etc.) and check whether the function returns valid hash codes.

8. Scenario: Large Input Handling
   Test whether the `hashCode` function correctly handles large inputs. Pass a large `orderDate` and `customer` and check whether the function returns a valid hash code.

9. Scenario: Thread Safety
   Test whether the `hashCode` function is thread-safe. Call the function from multiple threads simultaneously and check whether it returns valid and consistent hash codes.

10. Scenario: Edge Case Handling
    Validate that the `hashCode` function handles edge cases correctly. Pass minimum and maximum possible values for `orderDate` and `customer` and check whether the function returns valid hash codes.
*/
package org.agoncal.application.petstore.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class PurchaseOrder_hashCode_5a2657087a_Test {

    private PurchaseOrder purchaseOrder1;
    private PurchaseOrder purchaseOrder2;

    @Before
    public void setUp() {
        purchaseOrder1 = new PurchaseOrder();
        purchaseOrder1.setOrderDate(new Date());
        purchaseOrder1.setCustomer(new Customer());

        purchaseOrder2 = new PurchaseOrder();
        purchaseOrder2.setOrderDate(new Date());
        purchaseOrder2.setCustomer(new Customer());
    }

    @Test
    public void testHashCode() {
        int expectedHashCode = Objects.hash(purchaseOrder1.getOrderDate(), purchaseOrder1.getCustomer());
        int actualHashCode = purchaseOrder1.hashCode();
        assertEquals(expectedHashCode, actualHashCode);
    }

    @Test
    public void testHashCodeForDifferentObjects() {
        int hashCode1 = purchaseOrder1.hashCode();
        int hashCode2 = purchaseOrder2.hashCode();
        assertEquals(hashCode1, hashCode2);
    }
}
