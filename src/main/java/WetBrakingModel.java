public class WetBrakingModel extends BrakingModel {
    @Override
    double getStoppingDistance(double v) {
        return 0.621371192 * (0.0079 * Math.pow(v, 2) + 0.4304 * v - 0.0893);
    }
}//end of WetBrakingModel
