
package accidentreporter;

import java.util.Scanner;

/**
 *Lunga Kwinana
 * @author ST10445079
 */
// Interface definition
public class AccidentReporter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total number of accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        // Instantiate the RoadAccidentReport class and print the report
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();

        scanner.close();
    }
}

