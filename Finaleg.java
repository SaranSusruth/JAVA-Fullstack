
//final class Calc
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


class Calcu
{
	public void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalcu extends Calcu
    {
        public void show()
        {
	        System.out.println("By John");
        }
    }
       
public class  Finaleg
{

    public static void main(String[] args) 
    {
        
//    	final int num=8;
//    	num=9;
//    	System.out.println(num);
    	
//    	Calc obj= new Calc();
//    	obj.show();
//    	obj.add(4, 5);
    	
    	AdvCalcu obj= new AdvCalcu();
    	obj.show();
    	obj.add(4, 5);
    }
}

