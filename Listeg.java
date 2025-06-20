import java.util.ArrayList;
import java.util.List;

public class Listeg
{
    public static void main (String[] a)
    {
        //creating
        List<Integer> nums = new ArrayList<>();
        //adding elements
        nums.add(59);
        nums.add(9);
        nums.add(16);
        nums.add(45);
        //printing all elements
        System.out.println(nums);

        //printing the size of list
        System.out.println(nums.size());

        //printing particular index of a element 
        System.out.println(nums.indexOf(45));

        //removing a number
        nums.remove(3);
        for (int n : nums)
        {
            System.out.println(n);
        }

        
    }
    
}
