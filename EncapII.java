class ManII
{
    private String name;
    private int age;

    public void setName(String n)
    {
        name = n;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public int getAge()
        {
            return age;

        }

    public String getName()
        {
            return name;
        }
}

class EncapII 
{
    public static void main(String[] args)
    {
        ManII obj = new ManII();
        obj.setName("susruth ");
        obj.setAge(21); 
        System.out.println("name: "+ obj.getName()+ "\n" + "age: " + obj.getAge());

    }
    
}
