class Pen
{
    public void write()
    {
        System.out.println("Writing with pen");
    }
}

class Pencil
{
    public void write()
    {
        System.out.println("Writing with pencil")
    }
}


class Writer
{
    public void write(Pencil pencil)
    {
        pencil.write();
    }
}


public class InterfaceEgII 
{
    public static void main(String[] a)
    {
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Writer susruth = new Writer();

        susruth.write(pencil);
    }
}
