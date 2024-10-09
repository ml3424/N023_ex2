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
}
