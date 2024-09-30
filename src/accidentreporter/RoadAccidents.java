
package accidentreporter;

/**
 *Lunga Kwinana
 * @author ST10445079
 */

// Abstract RoadAccidents class
// Abstract Class
public abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getters for the variables
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }
}