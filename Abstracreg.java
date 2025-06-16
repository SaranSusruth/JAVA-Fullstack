// Abstract class with abstract method and concrete method
import java.util.logging.Logger;

abstract class Car
{
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        logger.info("Playing music in the car");
    }

}

// Abstract class extending another abstract class 

abstract class Nexon extends Car
{
    private static final Logger logger = Logger.getLogger(Nexon.class.getName());

    public void display()
    {
        logger.info("Nexon is a car");
    }
}

class UpdatedNexon extends Nexon
{
    private static final Logger logger = Logger.getLogger(UpdatedNexon.class.getName());

    public void fly()
    {
        logger.info("Updated Nexon is driving");
    }
    public void drive()
    {
        logger.info("Nexon is driving");
    }
}

class Abstracteg
{
    public static void main(String[] args)
    {
        UpdatedNexon myCar = new UpdatedNexon();
        myCar.drive(); // Output: Nexon is driving
        myCar.fly(); // Output: Updated Nexon is driving
        myCar.display(); // Output: Nexon is a car
        myCar.playMusic(); // Output: Playing music in the car
    }
}