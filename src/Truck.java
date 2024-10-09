public class Truck extends Heavy{
    private double weight;

    public Truck(long id, int age_vehicles, int wheels_count, String steering, double pollution, int trailers, double weight) {
        super(id, age_vehicles, wheels_count, steering, pollution, trailers);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}';
    }


    @Override
    public double exhaust()
    {
        return super.exhaust()*1.5;
    }
}
