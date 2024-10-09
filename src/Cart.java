public class Cart extends Light{
    double charge_time;

    public Cart(long id, int age_vehicles, int wheels_count, String steering, double pollution, boolean is_engine, double charge_time) {
        super(id, age_vehicles, wheels_count, steering, pollution, is_engine);
        this.charge_time = charge_time;
    }

    public double getCharge_time() {
        return charge_time;
    }
    public void setCharge_time(double charge_time) {
        this.charge_time = charge_time;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "charge_time=" + charge_time +
                '}';
    }


    @Override
    public double exhaust()
    {
        return 0;
    }

    public void hitchhikers()
    {
        System.out.println("1 person and 1 hello kitty top");
    }
}
