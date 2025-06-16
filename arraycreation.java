
import java.util.logging.Logger;

public class ArrayCreation {
	public static void main(String[] args) 
	{
		Logger logger = Logger.getLogger(ArrayCreation.class.getName());
		int[] nums=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
	
		
		for (int i=0;i<4;i++) {
			logger.info(String.valueOf(nums[i]));
		}
		
	}
}
