public class Regular extends Vehicles{
    private int n_passengers;

    public Regular(long id, int age_vehicles, int wheels_count, String steering, double pollution, int n_passengers) {
        super(id, age_vehicles, wheels_count, steering, pollution);
        this.n_passengers = n_passengers;
    }

    public int getN_passengers() {
        return n_passengers;
    }
    public void setN_passengers(int n_passengers) {
        this.n_passengers = n_passengers;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "n_passengers=" + n_passengers +
                '}';
    }


    @Override
    public double exhaust()
    {
        return super.exhaust() + 12;
    }

    public void noise()
    {
        System.out.println("a bit noisy");
    }

    public void hitchhikers()
    {
        System.out.println("4 others top");
    }
}
