import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class BitcoinRateInWords {
    public static void main(String[] args) {
        String apiUrl = "https://api.coindesk.com/v1/bpi/currentprice.json";

        try {
            // Create a URL object with the API URL
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Check if the request was successful
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // Read the response from the API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse the response as JSON
                String json = response.toString();

                // Get the current rate of Bitcoin
                int startIndex = json.indexOf("\"rate\":\"") + "\"rate\":\"".length();
                int endIndex = json.indexOf("\"", startIndex);
                String rate = json.substring(startIndex, endIndex);

                // Remove commas from the rate string
                rate = rate.replace(",", "");

                // Convert the rate to a number
                double rateNumber = parseRate(rate);

                // Convert the rate number to words
                String rateInWords = convertNumberToWords((int) rateNumber);

                // Print the rate in words
                System.out.println("The current rate of Bitcoin is: " + rateInWords);
            } else {
                // Request was not successful, print the HTTP response code
                System.out.println("Error: " + connection.getResponseCode());
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Parse the rate string into a number
    private static double parseRate(String rate) {
        try {
            NumberFormat format = NumberFormat.getInstance(Locale.US);
            Number number = format.parse(rate);
            return number.doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    // Convert a number to words
    private static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String[] units = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
        }

        if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " + convertNumberToWords(number % 100) : "");
        }

        if (number < 1000000) {
            return convertNumberToWords(number / 1000) + " thousand" + ((number % 1000 != 0) ? " " + convertNumberToWords(number % 1000) : "");
        }

        return convertNumberToWords(number / 1000000) + " million" + ((number % 1000000 != 0) ? " " + convertNumberToWords(number % 1000000) : "");
    }
}
