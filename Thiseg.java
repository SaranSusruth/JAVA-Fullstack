class vehicle
{
    private String name;
    private int speed;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(int speed)
    {
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


public class Thiseg 
{
    public static void main(String[] a)
    {
       vehicle obj = new vehicle();
       obj.setName("Nexon "); 
       obj.setSpeed(170);
       System.out.println("Name:" + obj.getName() +"\n" + "speed:" + obj.getSpeed());
    }
    
}
