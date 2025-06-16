 
import java.util.logging.Logger;

class Aa
    {
        protected static final Logger logger = Logger.getLogger(Aa.class.getName());
        public void show()
    {
            logger.info("A's show method");
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
                logger.info("Anonymous class's show method");
            }
        };
        objA.show(); // Calls the overridden method in the anonymous class
      }  
    }
