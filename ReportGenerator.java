import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The ReportGenerator class reads insurance policy data from a text file,
 * creates Policy and PolicyHolder objects, and generates a report.
 * It counts the number of smokers and non-smokers and displays policy details.
 */
public class ReportGenerator {

    /**
     * Main method to execute the program.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>(); // Stores all Policy objects
        int smokers = 0;       // Counts policies for smokers
        int nonSmokers = 0;    // Counts policies for non-smokers

        // Read policies from file
        try {
            File file = new File("PolicyInformation.txt");
            Scanner fileScanner = new Scanner(file);

            // Loop through file and read policy information
            while (fileScanner.hasNextLine()) {
                String policyNumber = fileScanner.nextLine();
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = Integer.parseInt(fileScanner.nextLine());
                String smokingStatus = fileScanner.nextLine();
                double height = Double.parseDouble(fileScanner.nextLine());
                double weight = Double.parseDouble(fileScanner.nextLine());

                // Create PolicyHolder and Policy objects
                PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, policyHolder);
                policies.add(policy);

                // Count smokers and non-smokers
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokers++;
                } else {
                    nonSmokers++;
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        // Display information for each policy
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();
        }

        // Display summary statistics
        System.out.println("The number of policies with a smoker is: " + smokers);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
        System.out.println("Number of Policy objects created: " + Policy.getNumberOfPolicies());
    }
}
