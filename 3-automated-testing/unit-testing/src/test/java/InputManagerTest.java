import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class InputManagerTest {

    @Test
    void manageUserInput() throws IOException {
        BufferedReader reader = new BufferedReader(new StringReader("""
            test
            abba
            racecar
            exit
            """));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        InputManager inputManager = new InputManager(reader, printStream);

        inputManager.manageUserInput();

        String outputString = outputStream.toString();
        String expectedOutput = """
            Please enter a string:
            test is not a palindrome
            Please enter a string:
            abba is a palindrome
            Please enter a string:
            racecar is a palindrome
            Please enter a string:
            """;
        assertEquals(expectedOutput, outputString);
    }

    @Test
    void testSomethingElse() throws IOException {
        BufferedReader reader = new BufferedReader(new StringReader("""
            test
            abba
            racecar
            exit
            """));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        InputManager inputManager = new InputManager(reader, printStream);

        inputManager.manageUserInput();

        String outputString = outputStream.toString();
        String expectedOutput = """
            Please enter a string:
            test is not a palindrome
            Please enter a string:
            abba is a palindrome
            Please enter a string:
            racecar is a palindrome
            Please enter a string:
            """;
        assertEquals(expectedOutput, outputString);
    }
}