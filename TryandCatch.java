public class TryandCatch {
    public static void main(String[] args) {
    	
    	int i=0;
    	int j=0;
    	int nums[]=new int[5];
    	
    	try
    	{
    		j=18/i;
    		System.out.println(nums[1]);
    		System.out.println(nums[5]);
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Cannot divide by zero");
    	}
    	catch(ArrayIndexOutOfBoundsException f)
    	{
    		System.out.println("Stay in your limit.");
    	}
    	// catch(Exception e)
    	// {
  
    	// 	System.out.println("Something went wrong."+e);
    	// }
    	System.out.println("j = "+j);
    	System.out.println("Bye");
    }
}
