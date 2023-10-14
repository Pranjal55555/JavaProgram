import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String str) {
        // Create a HashMap to count the occurrences of each character
        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate over the characters in the string
        for (char c : str.toCharArray()) {
            // Update the count of the current character in the HashMap
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate over the characters in the string again
        for (char c : str.toCharArray()) {
            // Check if the count of the current character is equal to 1
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return '\0' or any appropriate value
        return '\0';
    }

    public static void main(String[] args) {
        String inputStr = "agettkgaeee";
        char result = findFirstNonRepeatingChar(inputStr);
        System.out.println(result);  // Output: k

        inputStr = "abcdef";
        result = findFirstNonRepeatingChar(inputStr);
        System.out.println(result);  // Output: a

        inputStr = "hello world hi hey";
        result = findFirstNonRepeatingChar(inputStr);
        System.out.println(result);  // Output: w
    }
}

