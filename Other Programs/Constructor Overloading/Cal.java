
public class Cal {

    double calBMR(double weight) { // method to calculate Basic metabolic rate
        return 70 * (weight / 2.2) * 0.756;
    }

    double calPhysicalA(double weight, int minute, int intensity) { // method to calculate
        return 0.0385 * intensity * weight * minute;
    }

    double calDigest(double cal) {
        return cal / 10;
    }
}
