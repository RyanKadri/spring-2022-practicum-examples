import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class InputManager {

    private final BufferedReader input;
    private final PrintStream output;

    public InputManager(BufferedReader input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public void manageUserInput() throws IOException {
        while(true) {
            this.output.println("Please enter a string:");
            String input = this.input.readLine();
            if(input.equals("exit")) {
                return;
            }

            if(PalindromeApp.isPalindrome(input)) {
                this.output.println(input + " is a palindrome");
            } else {
                this.output.println(input + " is not a palindrome");
            }
        }
    }
}
