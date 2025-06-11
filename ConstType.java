class car
    {
        private String name;
        private int speed;

        public car()
        {
            name = "Nexon";
            speed = 170;
        }

        public car(String name, int speed)
        {
            this.name = name;
            this.speed = speed;
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


 public class ConstType 
     {
          public static void main(String[] a)
            {
                car obj = new car();
                car obj1 = new car("venue", 140);
                System.out.println("Name:" + obj.getName() + "\n" + "speed: "+ obj.getSpeed()); 
                System.out.println("----------");           
                System.out.println("Name:" + obj1.getName() + "\n" + "speed: "+ obj1.getSpeed());
            }
     } 
