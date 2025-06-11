class Human
{
    private String name = "susruth";
    private int age = 21;

    public int getAge()
        {
            return age;

        }

        public String getName()
        {
            return name;
        }
}


class Encap 
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        System.out.println("name: "+ obj.getName() + "age: " + obj.getAge());

    }
    
}
