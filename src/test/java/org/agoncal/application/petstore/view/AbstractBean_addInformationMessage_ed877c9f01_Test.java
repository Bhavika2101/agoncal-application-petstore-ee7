// Test generated by RoostGPT for test java-scenario-test using AI Type Open AI and AI Model gpt-4

/*
Test Scenario 1: Validate that the function adds an information message to the FacesContext when given a valid string message and arguments.

Test Scenario 2: Validate that the function adds an information message to the FacesContext when given a valid string message and no arguments.

Test Scenario 3: Validate that the function adds an information message to the FacesContext when given a valid string message and multiple arguments.

Test Scenario 4: Validate that the function adds an information message to the FacesContext when given a valid string message and null arguments.

Test Scenario 5: Validate that the function adds an information message to the FacesContext when given a string message with placeholders and corresponding arguments.

Test Scenario 6: Validate that the function adds an information message to the FacesContext when given a string message with placeholders but no corresponding arguments.

Test Scenario 7: Validate that the function adds an information message to the FacesContext when given a string message with placeholders and more arguments than placeholders.

Test Scenario 8: Validate that the message added to the FacesContext is correctly formatted according to the provided string message and arguments.

Test Scenario 9: Validate that the severity of the message added to the FacesContext is set to "SEVERITY_INFO".

Test Scenario 10: Validate that the function correctly handles special characters in the string message or arguments.

Test Scenario 11: Validate that the function correctly handles empty string message.

Test Scenario 12: Validate that the function correctly handles null string message. 

Test Scenario 13: Validate that the function correctly handles string message with only white spaces. 

Test Scenario 14: Validate that the function correctly handles string message in different languages (i.e. supports internationalization).
*/
package org.agoncal.application.petstore.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AbstractBean_addInformationMessage_ed877c9f01_Test {

    private AbstractBean testBean;

    @Mock
    private FacesContext facesContextMock;

    @Before
    public void setup() {
        testBean = new AbstractBean();
        FacesContext.setCurrentInstance(facesContextMock);
    }

    @Test
    public void testAddInformationMessage_ValidMessageAndArgs() {
        String message = "test message {0}";
        Object[] args = new Object[]{"arg1"};

        testBean.addInformationMessage(message, args);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "test message arg1", null));
    }

    @Test
    public void testAddInformationMessage_ValidMessageNoArgs() {
        String message = "test message";

        testBean.addInformationMessage(message);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "test message", null));
    }

    @Test
    public void testAddInformationMessage_NullMessage() {
        String message = null;

        testBean.addInformationMessage(message);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, null, null));
    }

    @Test
    public void testAddInformationMessage_EmptyMessage() {
        String message = "";

        testBean.addInformationMessage(message);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "", null));
    }

    @Test
    public void testAddInformationMessage_MessageWithWhiteSpace() {
        String message = " ";

        testBean.addInformationMessage(message);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, " ", null));
    }

    @Test
    public void testAddInformationMessage_MessageWithSpecialCharacters() {
        String message = "!@#$%^&*()";

        testBean.addInformationMessage(message);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "!@#$%^&*()", null));
    }

    @Test
    public void testAddInformationMessage_MessageWithMultipleArgs() {
        String message = "test message {0} {1}";
        Object[] args = new Object[]{"arg1", "arg2"};

        testBean.addInformationMessage(message, args);
        verify(facesContextMock, times(1)).addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "test message arg1 arg2", null));
    }
}