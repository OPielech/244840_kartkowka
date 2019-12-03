public class Car extends Vehicle implements SpeedModel {
    private final double liczbaPasazerow;

    public Car(double masa, double konieMechaniczne, double czas, BrakingModel brakingModel, double liczbaPasazerow) {
        super(masa, konieMechaniczne, czas, brakingModel);
        this.liczbaPasazerow = liczbaPasazerow;
    }

    public double getLiczbaPasazerow() {
        return liczbaPasazerow;
    }


    @Override
    public String toString() {
        return "Car{" +
                "liczbaPasazerow=" + liczbaPasazerow +
                '}';
    }

    @Override
    public double getSpeedMph() {
        return Math.pow(getMasa() / getKonieMechaniczne(), 1 / 3) * 5.825;
    }
}//end of Car
