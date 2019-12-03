public class DryBrakingModel extends BrakingModel {
    @Override
    double getStoppingDistance(double v) {
        return 0.621371192 * (0.0058 * Math.pow(v, 2) + 0.3851 * v + 1.2321);
    }
}
