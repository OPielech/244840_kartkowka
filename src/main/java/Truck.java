public class Truck extends Vehicle implements SpeedModel {
    private final double masaLadunku;

    public Truck(double masa, double konieMechaniczne, double czas, BrakingModel brakingModel, double masaLadunku) {
        super(masa, konieMechaniczne, czas, brakingModel);
        this.masaLadunku = masaLadunku;
    }

    public double getMasaLadunku() {
        return masaLadunku;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "masaLadunku=" + masaLadunku +
                '}';
    }

    @Override
    public double getSpeedMph() {
        return Math.pow((getMasa() + getMasaLadunku()) / getKonieMechaniczne(), 1.0/3.0) * 5.825;
    }
}//end of Truck
