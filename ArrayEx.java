 
 public class ArrayEx
{
    public static void main(String[] args)
    {
       int[] a = { 45, 22, 89, 16, 90, 33 }; //  Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33

        int min = a[0]; //  Initialize min and max with the first element
        int max = a[0]; //  Initialize min and max with the first element


        for (int num : a)          //an enhanced for loop to find min and max
        {
            if (num < min)
            {
                min = num;
            }
            if (num > max)
            {
                max = num;
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
