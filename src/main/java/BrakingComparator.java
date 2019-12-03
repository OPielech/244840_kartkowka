import java.util.Comparator;

public class BrakingComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        double predkosc1 = o1.getSpeedMph();
        double predkosc2 = o2.getSpeedMph();
        return Double.compare(o1.getBrakingModel().getStoppingDistance(predkosc1), o2.getBrakingModel().getStoppingDistance(predkosc2));
    }//end of compare
}//end of BrakingComparator
