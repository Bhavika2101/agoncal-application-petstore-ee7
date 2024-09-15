// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
1. Scenario: Validate when the 'name' field is empty.
    - Description: The function should return an empty string if the 'name' field is empty.

2. Scenario: Validate when the 'name' field is Null.
    - Description: The function should handle Null values gracefully. It should not throw a Null Pointer Exception.

3. Scenario: Validate when the 'name' field contains a single word.
    - Description: The function should return the same single word as is. 

4. Scenario: Validate when the 'name' field contains multiple words separated by spaces.
    - Description: The function should return all words with the appropriate spaces.

5. Scenario: Validate when the 'name' field contains special characters.
    - Description: The function should return the string with all special characters intact.

6. Scenario: Validate when the 'name' field contains numeric characters.
    - Description: The function should return the string with all numeric characters intact.

7. Scenario: Validate when the 'name' field contains a mix of alphanumeric characters.
    - Description: The function should return the string with all alphanumeric characters intact.

8. Scenario: Validate for the maximum length of the 'name' field.
    - Description: The function should be able to handle and return strings up to the maximum length defined by the @Size annotation.

9. Scenario: Validate when the 'name' field contains non-printable characters.
    - Description: The function should handle non-printable characters and return them as part of the string.

10. Scenario: Validate when the 'name' field contains Unicode characters.
    - Description: The function should handle Unicode characters and return them as part of the string. 

11. Scenario: Validate when the 'name' field contains escape sequences.
    - Description: The function should handle escape sequences and return them as part of the string. 

12. Scenario: Validate the function with concurrent access.
    - Description: The function should handle concurrent access, and return accurate results.
*/
package org.agoncal.application.petstore.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Category_toString_ceffa8036e_Test {

    @Test
    public void testToString() {
        Category category = new Category();
        category.setName("Pets");
        assertEquals("Pets", category.toString());
    }

    @Test
    public void testToStringWithNull() {
        Category category = new Category();
        category.setName(null);
        assertNull(category.toString());
    }
}
