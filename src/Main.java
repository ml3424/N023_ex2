//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static double pollutionPerDay(Vehicles[] vehicles)
    {
        double sum_pollution = 0;
        for(Vehicles v : vehicles)
        {
            sum_pollution += v.exhaust()*24;
        }
        return sum_pollution;
    }

    public static void noiseCheck(Vehicles[] vehicles)
    {
        for(Vehicles v : vehicles)
        {
            if(v instanceof Regular)
            {
                ((Regular) v).noise();
            }
            else
            {
                System.out.println("this vehicle could be noisy");
            }
        }
    }

    public static void passengersCheck(Vehicles[] vehicles)
    {
        for(Vehicles v : vehicles)
        {
            if(v instanceof Car)
            {
                System.out.println("There is: " + ((Car) v).getN_passengers() + " passengers");
            }
            else if(v instanceof Bicycle)
            {
                System.out.println("1 more top");
            }

        }
    }

    public static long longestTimeCheck(Vehicles[] vehicles)
    {
        double longest_time = 0;
        long id_longest = -1;
        for(Vehicles v : vehicles)
        {
            if(v instanceof Cart)
            {
                if (((Cart) v).getCharge_time() > longest_time)
                {
                    longest_time = ((Cart) v).getCharge_time();
                    id_longest = v.getId();
                }
            }
        }
        System.out.println("The longst charging time is: " + longest_time + "it's id: " + id_longest);
        return id_longest;
    }
}