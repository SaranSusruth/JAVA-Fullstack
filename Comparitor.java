import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparitor 
{
    public static void main (String[] a)
    {
        List<Integer> list = new ArrayList<Integer>();
        Comparator<Integer> com = (i,j)->
            {
                if (i%10 > j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            };
 
        list.add(55);
        list.add(69);
        list.add(91);
        list.add(82);
        list.add(48);
        //unordered list
        System.out.println("Unordered list:" + list);

        Collections.sort(list);
        //ordered list
        System.out.println("ordered list:" + list);

        //custom ordering
        Collections.sort(list,com);
        System.out.println("custom list:" + list);

        //  STRING ORDERING
        List<String> name = new ArrayList<String>();
        Comparator<String> comI = new Comparator<String>() 
        {
            public int compare(String i,String j)
            {
                
                if(i.charAt(i.length()-1) > j.charAt(j.length()-1))
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            
        };


        name.add("Susruthz");
        name.add("Ananda");
        name.add("Nikhil");
        name.add("Bala sai venkat");
        name.add("yogy");
        name.add("kush");
        //unordered list
        System.out.println("unordered list:" + name);

        Collections.sort(name);

        //ordered list
        System.out.println("ordered list:" + name);

        //custom ordering
        Collections.sort(name, comI);
        System.out.println("custom ordered:" + name);
     }
}
