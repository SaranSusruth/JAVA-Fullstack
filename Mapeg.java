import java.util.Map;
import java.util.HashMap;

public class Mapeg
{
    public static void main(String[] a)
    {
        Map<String,Integer> stud = new HashMap<String,Integer>();

        stud.put("Nikhil",21);
        stud.put("Susruth",18);
        stud.put("Bhavani",23);
        stud.put("Sai",24);

        System.out.println(stud);

         System.out.println(stud.get("Sai"));
    }
    
}
