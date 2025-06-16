class Aa
    {
        public void show()
    {
            System.out.println("A's show method");
        }
    }

public class Anonymous 
    {
      public static void main(String[] a)
      {
        Aa objA = new Aa()
        {
            public void show ()
            {
                System.out.println("Anonymous class's show method");
            }
        };
        objA.show(); // Calls the overridden method in the anonymous class
      }  
    }
