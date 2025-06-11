class vehicleII
    {
        private String name;
        private int speed;

        public vehicleII()
        {
            name = "Nexon";
            speed = 170;
        }

        public String getName()
        {
            return name;
        }

        public int getSpeed()
        {
            return speed;

        }

    }


public class consteg 
{
    public static void main(String[] a)
    {
        vehicleII obj = new vehicleII();
        System.out.println("Name: " + obj.getName() + "\n" + "speed: " + obj.getSpeed());

    }
}

