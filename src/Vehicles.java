public class Vehicles {
    private long id;
    private int age_vehicles;
    private int wheels_count;
    private String steering;
    private double pollution;

    public Vehicles(long id, int age_vehicles, int wheels_count, String steering, double pollution) {
        this.id = id;
        this.age_vehicles = age_vehicles;
        this.wheels_count = wheels_count;
        this.steering = steering;
        this.pollution = pollution;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getAge_vehicles() {
        return age_vehicles;
    }
    public void setAge_vehicles(int age_vehicles) {
        this.age_vehicles = age_vehicles;
    }

    public int getWheels_count() {
        return wheels_count;
    }
    public void setWheels_count(int wheels_count) {
        this.wheels_count = wheels_count;
    }

    public String getSteering() {
        return steering;
    }
    public void setSteering(String steering) {
        this.steering = steering;
    }

    public double getPollution() {
        return pollution;
    }
    public void setPollution(double pollution) {
        this.pollution = pollution;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", age_vehicles=" + age_vehicles +
                ", wheels_count=" + wheels_count +
                ", steering='" + steering + '\'' +
                ", pollution=" + pollution +
                '}';
    }


    public double exhaust()
    {
        return 60*pollution;
    }
}
