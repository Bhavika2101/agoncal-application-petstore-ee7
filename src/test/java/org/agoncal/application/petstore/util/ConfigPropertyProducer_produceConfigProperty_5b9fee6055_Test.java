// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
1. **Scenario:** Check if the function correctly fetches the property value corresponding to the key from the properties file.
- **Given:** A valid key that exists in the properties file.
- **When:** The function is invoked with the valid key.
- **Then:** The function should return the corresponding property value from the properties file.

2. **Scenario:** Check if the function returns null when an invalid key is provided.
- **Given:** An invalid key that does not exist in the properties file.
- **When:** The function is invoked with the invalid key.
- **Then:** The function should return null.

3. **Scenario:** Check if the function handles the situation where the key is null.
- **Given:** A null key.
- **When:** The function is invoked with null as the key.
- **Then:** The function should return null or throw an appropriate exception.

4. **Scenario:** Check if the function handles the situation where the properties file is not found.
- **Given:** The properties file does not exist.
- **When:** The function is invoked.
- **Then:** The function should throw an appropriate exception (IOException).

5. **Scenario:** Check if the function handles the situation where the properties file is empty.
- **Given:** An empty properties file.
- **When:** The function is invoked.
- **Then:** The function should return null for any key or throw an appropriate exception.

6. **Scenario:** Check if the function handles the situation where the properties file has duplicate keys.
- **Given:** A properties file with duplicate keys.
- **When:** The function is invoked with the duplicate key.
- **Then:** The function should return the value of the first occurrence of the key.

7. **Scenario:** Check if the function handles special characters in the key.
- **Given:** A key with special characters that exists in the properties file.
- **When:** The function is invoked with the special character key.
- **Then:** The function should return the corresponding property value from the properties file.

8. **Scenario:** Check if the function handles the situation where the properties file is in a different format (not .properties).
- **Given:** A file in a different format.
- **When:** The function is invoked.
- **Then:** The function should throw an appropriate exception (IOException).
*/
package org.agoncal.application.petstore.util;

import javax.enterprise.inject.spi.InjectionPoint;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.lang.annotation.Annotation;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class ConfigPropertyProducer_produceConfigProperty_5b9fee6055_Test {

    @Mock
    private InjectionPoint ip;

    @Mock
    private ConfigProperty configProperty;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProduceConfigProperty_ValidKey() {
        String key = "validKey";
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class)).thenReturn(configProperty);
        when(configProperty.value()).thenReturn(key);
        ConfigPropertyProducer.props.setProperty(key, "validValue");

        String result = ConfigPropertyProducer.produceConfigProperty(ip);

        assertEquals("validValue", result);
    }

    @Test
    public void testProduceConfigProperty_InvalidKey() {
        String key = "invalidKey";
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class)).thenReturn(configProperty);
        when(configProperty.value()).thenReturn(key);

        String result = ConfigPropertyProducer.produceConfigProperty(ip);

        assertEquals(null, result);
    }
}
