public class Tractor extends Heavy{
    private String trailers_types;

    public Tractor(long id, int age_vehicles, int wheels_count, String steering, double pollution, int trailers, String trailers_types) {
        super(id, age_vehicles, wheels_count, steering, pollution, trailers);
        this.trailers_types = trailers_types;
    }

    public String getTrailers_types() {
        return trailers_types;
    }
    public void setTrailers_types(String trailers_types) {
        this.trailers_types = trailers_types;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "trailers_types='" + trailers_types + '\'' +
                '}';
    }
}
