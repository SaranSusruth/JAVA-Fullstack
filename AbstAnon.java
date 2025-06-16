import java.util.logging.Logger;

abstract class A
{
    public abstract void show();
}

//class B extends A
//{
//    public void show()
//    {
//        System.out.println("in B show");
//    }
//}

public class AbstAnon
{
    private static final Logger logger = Logger.getLogger(AbstAnon.class.getName());

    public static void main(String[] args)
    {
        // A obj = new B();

        A obj = new A()
        {
            public void show()
            {
                logger.info("this is show method of anonymous method class with reference to abstract class"); // this is an anonymous class with reference to abstract class A
            }
        };
        obj.show();
    }
}
