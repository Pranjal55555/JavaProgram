import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BitcoinRate {

    public static void main(String[] args) {
        try {
            // Make a GET request to the API
            String apiEndpoint = "https://api.coindesk.com/v1/bpi/currentprice.json";
            String jsonResponse = makeGETRequest(apiEndpoint);

            // Parse the JSON response to get the rate value
            String rateString = parseRateFromJson(jsonResponse);

            // Remove the decimal part and commas from the rate
            rateString = rateString.split("\\.")[0].replace(",", "");

            // Convert the rate to words
            String rateInWords = convertToWords(rateString);

            // Print the rate in words
            System.out.println(rateInWords);
        } catch (IOException e) {
            System.out.println("Failed to retrieve the Bitcoin rate.");
        }
    }

    private static String makeGETRequest(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString();
    }

    private static String parseRateFromJson(String jsonResponse) {
        // You can use a JSON parsing library here (e.g., Gson or Jackson) to extract the rate value from the JSON response.
        // For simplicity, let's assume the JSON response contains the rate as a string in the format "rate":"22,616.3987"
        int startIndex = jsonResponse.indexOf("\"rate\":\"") + "\"rate\":\"".length();
        int endIndex = jsonResponse.indexOf("\"", startIndex);
        return jsonResponse.substring(startIndex, endIndex);
    }

    private static String convertToWords(String rateString) {
        // Implement the conversion logic to words here
        // ...
        // For simplicity, you can use the logic provided in the Python version of the program.
        return "Not Implemented"; // Replace this with the actual conversion result
    }
}
