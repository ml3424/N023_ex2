public class Bicycle extends Light{
    boolean is_basket;

    public Bicycle(long id, int age_vehicles, int wheels_count, String steering, double pollution, boolean is_engine, boolean is_basket) {
        super(id, age_vehicles, wheels_count, steering, pollution, is_engine);
        this.is_basket = is_basket;
    }

    public boolean isIs_basket() {
        return is_basket;
    }
    public void setIs_basket(boolean is_basket) {
        this.is_basket = is_basket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "is_basket=" + is_basket +
                '}';
    }
}
