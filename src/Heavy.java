public class Heavy extends Vehicles{
    private int trailers; //נגררים

    public Heavy(long id, int age_vehicles, int wheels_count, String steering, double pollution, int trailers) {
        super(id, age_vehicles, wheels_count, steering, pollution);
        this.trailers = trailers;
    }

    public int getTrailers() {
        return trailers;
    }
    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "trailers=" + trailers +
                '}';
    }


    @Override
    public double exhaust()
    {
        return 24*60*(super.getPollution() + 500);
    }
}
