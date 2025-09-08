import java.io.*;
import java.net.*;

public class CSVReader {
    public static void main(String[] args) {
        try {
            // 1 Open the CSV file from the network
            URL url = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            int ulkoTaloIndex = -1;   // Index of the 'UlkoTalo' column
            double sum = 0;            // Sum of the values
            int count = 0;             // Number of values

            // 2 Read the file line by line
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";"); // Split the line into columns

                // First line contains column headers
                if (ulkoTaloIndex == -1) {
                    for (int i = 0; i < columns.length; i++) {
                        if (columns[i].equals("UlkoTalo")) {
                            ulkoTaloIndex = i; // Save the column index
                            break;
                        }
                    }
                } else {
                    // 3 Only consider data for 01.01.2023
                    if (columns[0].startsWith("01.01.2023")) {
                        // Convert value from String to double (replace comma with dot)
                        double value = Double.parseDouble(columns[ulkoTaloIndex].replace(',', '.'));
                        sum += value;  // Add value to sum
                        count++;       // Increment counter
                    }
                }
            }

            reader.close(); // 4 Close the file

            // 5 Calculate and print the average
            if (count > 0) {
                double average = sum / count;
                System.out.println("Average UlkoTalo on 01.01.2023: " + average);
            } else {
                System.out.println("No data for 01.01.2023 found.");
            }

        } catch (IOException e) {
            System.err.println(e); // Print any error
        }
    }
}
