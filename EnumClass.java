enum Cars
{
    Nexon(5000),Tiago(3000),Tigor(2000),Safari(7000);

    private int price;
    Cars(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
}
	
public class EnumClass 
{
    public static void main(String[] args) 
    {
       for (Cars cars : Cars.values())
       {
        System.out.println(cars + " : " + cars.getPrice());
       }
   	
   
    }
}
