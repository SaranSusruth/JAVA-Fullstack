// Abstract class with abstract method and concrete method
abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Playing music in the car");
    }

}

// Abstract class extending another abstract class 

abstract class Nexon extends Car
{
    public void display()
    {
        System.out.println("Nexon is a car");
    }
}

class UpdatedNexon extends Nexon
{
    public void fly()
    {
        System.out.println("Updated Nexon is driving");
    }
    public void drive()
    {
        System.out.println("Nexon is driving");
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