import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Seteg 
{
    public static void main(String[] a)
    {
        Set<Integer> nums = new HashSet<>();

        nums.add(45);
        nums.add(6);
        nums.add(34);
        nums.add(19);
        nums.add(6);

        System.out.println(nums);

        for (int n : nums)
        {
            System.out.println(n);
        }

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next());
            System.out.print(",");
        }
    }
}
