class A
{
    int a;

    public void show()
    {
        System.out.println("A's show method");

    }

    class B
    {
       public void display()
       {
              System.out.println("B's display method which is inside A's class");
       } 
    }
    static class C
    {
        public void print()
        {
            System.out.println("C's print method which is inside a static nested class inside A's class");
        }
    }
    
}

class Nested
{
    public static void main(String[] a)
    {
        A objA= new A();
        objA.show();
        A.B objB = objA.new B();
        objB.display();
        A.C objC = new A.C();
        objC.print();
    }
}