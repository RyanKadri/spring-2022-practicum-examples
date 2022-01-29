import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Palindrome Checker")
class PalindromeAppTest {

    @Test
    @DisplayName("ABBA should be a palindrome")
    public void abbaIsAPalindrome() {
        assertTrue(PalindromeApp.isPalindrome("abba"));
    }

    @Test
    public void oddLengthStringIsAPalindrome() {
        assertTrue(PalindromeApp.isPalindrome("racecar"));
    }

    @Test
    public void emptySpacesArePalindrome() {
        assertTrue(PalindromeApp.isPalindrome("  "));
    }
}