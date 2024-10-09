public class LittleTruck extends Truck{
    int working_hours;

    public LittleTruck(long id, int age_vehicles, int wheels_count, String steering, double pollution, int trailers, double weight, int working_hours) {
        super(id, age_vehicles, wheels_count, steering, pollution, trailers, weight);
        this.working_hours = working_hours;
    }

    public int getWorking_hours() {
        return working_hours;
    }
    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    @Override
    public String toString() {
        return "LittleTruck{" +
                "working_hours=" + working_hours +
                '}';
    }
}
