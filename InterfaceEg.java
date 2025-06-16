class Vehicles
{
    public void drive()
    {

    }
}

class Cars extends Vehicles
{
    public void drive()
    {
        System.out.println("car drive");
    }
}

class Bike extends Vehicles
{
    public void drive()
    {
        System.out.println("bike ride");
    }
}


class Driver 
{ 
   public void drive(Vehicles car)
   { 
        car.drive();
   }
}

class InterfaceEg
{
    public static void main(String[] a)
    {
        Vehicles car = new Cars();
        
        Vehicles bike = new Bike();

        Driver driver = new Driver();

        driver.drive(bike);

    }
}