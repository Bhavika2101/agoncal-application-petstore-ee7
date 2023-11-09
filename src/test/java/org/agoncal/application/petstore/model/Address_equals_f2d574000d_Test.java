// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
1. Scenario: Compare the same object
   Test Case: Pass the same object to the equals function and validate that the function returns true. 

2. Scenario: Compare two different objects with the same values
   Test Case: Pass two different objects with the same values for street1, city, and zipcode to the equals function and validate that the function returns true.

3. Scenario: Compare two objects with different values
   Test Case: Pass two different objects with different values for street1, city, or zipcode to the equals function and validate that the function returns false. 

4. Scenario: Compare a null object
   Test Case: Pass a null object to the equals function and validate that the function returns false.

5. Scenario: Compare an object of a different class
   Test Case: Pass an object of a different class to the equals function and validate that the function returns false. 

6. Scenario: Compare an object with null values in fields
   Test Case: Pass an object with null values in street1, city, or zipcode to the equals function and validate that the function returns false. 

7. Scenario: Compare two objects where one object has null values in fields and the other has actual values
   Test Case: Pass two objects where one has null values in street1, city, or zipcode and the other has actual values to the equals function and validate that the function returns false. 

8. Scenario: Compare two objects where both have null values in fields
   Test Case: Pass two objects where both have null values in street1, city, and zipcode to the equals function and validate that the function returns true.
*/
package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Address_equals_f2d574000d_Test {

    @Test
    public void testEquals() {
        Address address1 = new Address("Street1", "City1", "Zip1", new Country("isoCode1", "name1", "printableName1", "iso31", "numcode1"));
        Address address2 = new Address("Street1", "City1", "Zip1", new Country("isoCode1", "name1", "printableName1", "iso31", "numcode1"));

        assertTrue(address1.equals(address2));
        assertTrue(address2.equals(address1));
    }

    @Test
    public void testNotEquals() {
        Address address1 = new Address("Street1", "City1", "Zip1", new Country("isoCode1", "name1", "printableName1", "iso31", "numcode1"));
        Address address2 = new Address("Street2", "City2", "Zip2", new Country("isoCode2", "name2", "printableName2", "iso32", "numcode2"));

        assertFalse(address1.equals(address2));
        assertFalse(address2.equals(address1));
    }

    @Test
    public void testEqualsNull() {
        Address address1 = new Address("Street1", "City1", "Zip1", new Country("isoCode1", "name1", "printableName1", "iso31", "numcode1"));

        assertFalse(address1.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Address address1 = new Address("Street1", "City1", "Zip1", new Country("isoCode1", "name1", "printableName1", "iso31", "numcode1"));

        assertFalse(address1.equals(new Object()));
    }
}
