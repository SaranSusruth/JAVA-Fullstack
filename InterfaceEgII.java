interface Tool
{
    public void write();
}


class Pen implements Tool
{
    public void write()
    {
        System.out.println("Writing with pen");
    }
}

class Pencil implements Tool 
{
    public void write()
    {
        System.out.println("Writing with pencil");
    }
}


class Writer
{
    public void write(Tool pen)
    {
        pen.write();
    }
}


public class InterfaceEgII 
{
    public static void main(String[] a)
    {
        Tool pen = new Pen();

        Tool pencil = new Pencil();

        Writer susruth = new Writer();

        susruth.write(pen);
    }
}
