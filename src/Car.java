public class Car extends Regular{
    String color;

    public Car(long id, int age_vehicles, int wheels_count, String steering, double pollution, int n_passengers, String color) {
        super(id, age_vehicles, wheels_count, steering, pollution, n_passengers);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
