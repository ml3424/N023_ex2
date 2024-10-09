public class Light extends Vehicles{
    private boolean is_engine;

    public Light(long id, int age_vehicles, int wheels_count, String steering, double pollution, boolean is_engine) {
        super(id, age_vehicles, wheels_count, steering, pollution);
        this.is_engine = is_engine;
    }

    public boolean isIs_engine() {
        return is_engine;
    }
    public void setIs_engine(boolean is_engine) {
        this.is_engine = is_engine;
    }

    @Override
    public String toString() {
        return "Light{" +
                "is_engine=" + is_engine +
                '}';
    }
}
