public class Kibbutz {
    Vehicles[] kibbutz_vehicles;
    int n_vehicles;

    public Kibbutz() {
        this.kibbutz_vehicles = new Vehicles[500];
        this.n_vehicles = 0;
    }

    public Vehicles[] getKibbutz_vehicles() {
        return kibbutz_vehicles;
    }
    public void setKibbutz_vehicles(Vehicles[] kibbutz_vehicles) {
        this.kibbutz_vehicles = kibbutz_vehicles;
    }

    public int getN_vehicles() {
        return n_vehicles;
    }
    public void setN_vehicles(int n_vehicles) {
        this.n_vehicles = n_vehicles;
    }


    public void add_vehicles(Vehicles newV)
    {
        this.kibbutz_vehicles[n_vehicles-1] = newV;
        this.n_vehicles++;
    }

    public int steeringWheelCount()
    {
        int count = 0;
        for(Vehicles v : this.kibbutz_vehicles)
        {
            if(v.getSteering().equals("steering wheel"))
            {
                count++;
            }
        }
        return count;
    }

    public Vehicles[] vehicles_15_and_wheel()
    {
        Vehicles[] vehicles_15_and_wheel = new Vehicles[n_vehicles];
        int count_v_15_and_wheel = 0;

        for(Vehicles v : this.kibbutz_vehicles)
        {
            if(v.getSteering().equals("wheel") && v.getAge_vehicles() > 15)
            {
                vehicles_15_and_wheel[count_v_15_and_wheel] = v;
                count_v_15_and_wheel++;
            }
        }
        return vehicles_15_and_wheel;
    }
}
