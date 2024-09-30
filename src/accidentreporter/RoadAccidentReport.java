
package accidentreporter;

/**
 *Lunga Kwinana
 * @author ST10445079
 */
// RoadAccidentReport subclass extending RoadAccidents
public class RoadAccidentReport extends RoadAccidents {
    
    // Constructor
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Method to print the accident report
    public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("************************");
    }
}