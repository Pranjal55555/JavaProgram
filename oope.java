import java.util.Scanner;

public class oope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = stringChallenge(input);
        System.out.println(result);
        scanner.close();
    }

    public static String stringChallenge(String str) {
        // Perform run-length encoding
        StringBuilder encodedString = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(count).append(str.charAt(i - 1));
                count = 1;
            }
        }
        encodedString.append(count).append(str.charAt(str.length() - 1));

        // Concatenate with the ChallengeToken
        String challengeToken = "o8mb4uqw7f";
        String output = encodedString.toString() + challengeToken;

        // Replace every third character in the final output with 'X'
        StringBuilder finalOutput = new StringBuilder();
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            finalOutput.append(i % 3 == 2 ? 'X' : c);
        }

        return finalOutput.toString();
    }
}
