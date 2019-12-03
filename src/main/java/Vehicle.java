public abstract class Vehicle {
    private final double masa;
    private final double konieMechaniczne;
    private final double czas;
    private BrakingModel brakingModel;

    public Vehicle(double masa, double konieMechaniczne, double czas, BrakingModel brakingModel) {
        this.masa = masa;
        this.konieMechaniczne = konieMechaniczne;
        this.czas = czas;
        this.brakingModel = brakingModel;
    }

    public BrakingModel getBrakingModel() {
        return brakingModel;
    }

    public void setBrakingModel(BrakingModel brakingModel) {
        this.brakingModel = brakingModel;
    }

    public double getMasa() {
        return masa;
    }

    public double getKonieMechaniczne() {
        return konieMechaniczne;
    }

    public double getCzas() {
        return czas;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "masa=" + masa +
                ", konieMechaniczne=" + konieMechaniczne +
                ", czas=" + czas +
                '}';
    }

    public abstract double getSpeedMph();
}//end of Vehicle
