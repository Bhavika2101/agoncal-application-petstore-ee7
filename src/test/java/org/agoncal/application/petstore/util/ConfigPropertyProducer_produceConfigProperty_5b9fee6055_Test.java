// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
Scenario 1: Valid Key Input
- In this scenario, the produceConfigProperty function is given a valid InjectionPoint with a key that exists in the properties. The expected outcome is that the function returns the property value associated with the given key.

Scenario 2: Invalid Key Input
- In this scenario, the produceConfigProperty function is given an InjectionPoint with a key that does not exist in the properties. The expected outcome is that the function returns null, as there is no property value associated with the given key.

Scenario 3: Null InjectionPoint Input
- In this scenario, the produceConfigProperty function is given null as the InjectionPoint. The expected behavior is that the function throws a NullPointerException.

Scenario 4: InjectionPoint with Null Key
- In this scenario, the produceConfigProperty function is given an InjectionPoint where the key is null. The expected behavior is that the function throws a NullPointerException when trying to retrieve the property value.

Scenario 5: Empty Key Input
- In this scenario, the produceConfigProperty function is given an InjectionPoint with an empty string as the key. The expected outcome is that the function returns null, as there is no property value associated with an empty string.

Scenario 6: InjectionPoint with Non-String Key
- In this scenario, the produceConfigProperty function is given an InjectionPoint with a non-string key. The expected behavior is that the function throws a ClassCastException, as the key is expected to be a string.

Scenario 7: Key with Leading or Trailing Whitespace
- In this scenario, the produceConfigProperty function is given an InjectionPoint with a key that has leading or trailing whitespace. The expected outcome is that the function returns the property value associated with the trimmed key, assuming that the trimmed key exists in the properties.

Scenario 8: Key with Case Difference
- In this scenario, the produceConfigProperty function is given an InjectionPoint with a key that is the same as an existing key in the properties, but with a different case (e.g., "Key" versus "key"). The expected outcome is that the function returns null, as property keys are case-sensitive.
*/
package org.agoncal.application.petstore.util;

import javax.enterprise.inject.spi.InjectionPoint;
import org.junit.Before;
import org.junit.Test;
import java.util.Properties;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class ConfigPropertyProducer_produceConfigProperty_5b9fee6055_Test {

    private static Properties props;
    private ConfigPropertyProducer configPropertyProducer;

    @Before
    public void setup() {
        props = new Properties();
        props.setProperty("validKey", "validValue");
        configPropertyProducer = new ConfigPropertyProducer();
    }

    @Test
    public void testProduceConfigProperty_ValidKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn("validKey");
        String result = configPropertyProducer.produceConfigProperty(ip);
        assertEquals("validValue", result);
    }

    @Test
    public void testProduceConfigProperty_InvalidKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn("invalidKey");
        String result = configPropertyProducer.produceConfigProperty(ip);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testProduceConfigProperty_NullInjectionPoint() {
        configPropertyProducer.produceConfigProperty(null);
    }

    @Test(expected = NullPointerException.class)
    public void testProduceConfigProperty_NullKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn(null);
        configPropertyProducer.produceConfigProperty(ip);
    }

    @Test
    public void testProduceConfigProperty_EmptyKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn("");
        String result = configPropertyProducer.produceConfigProperty(ip);
        assertNull(result);
    }

    @Test(expected = ClassCastException.class)
    public void testProduceConfigProperty_NonStringKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn(new Object());
        configPropertyProducer.produceConfigProperty(ip);
    }

    @Test
    public void testProduceConfigProperty_TrimmedKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn(" validKey ");
        String result = configPropertyProducer.produceConfigProperty(ip);
        assertEquals("validValue", result);
    }

    @Test
    public void testProduceConfigProperty_CaseSensitiveKey() {
        InjectionPoint ip = mock(InjectionPoint.class);
        when(ip.getAnnotated().getAnnotation(ConfigProperty.class).value()).thenReturn("VALIDKEY");
        String result = configPropertyProducer.produceConfigProperty(ip);
        assertNull(result);
    }
}
