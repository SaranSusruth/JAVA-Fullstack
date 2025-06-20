import java.util.Map;
import java.util.HashMap;

public class Mapeg
{
    public static void main(String[] a)
    {
        Map<String,Integer> stud = new HashMap<String,Integer>();
        //adding elements
        stud.put("Nikhil",21);
        stud.put("Susruth",18);
        stud.put("Bhavani",23);
        stud.put("Sai",24);
        stud.put("Anand",24);
        //geting one value of a particular key
        System.out.println(stud.get("Sai"));
        //getting the all keys
        System.out.println(stud.keySet());

        //getting the key and its value
        for (String key : stud.keySet())
        {
            System.out.println(key + ":" + stud.get(key));
        }

    }
    
}
