public class ArrayEx
{
    public static void main(String[] args)
    {
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int a[] = { 45, 22, 89, 16, 90, 33 };

        // TODO: Initialize min and max with the first element
        int min = a[0];
        int max = a[0];

        // TODO: Use an enhanced for loop to find min and max
        for (int num : a)
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

        // TODO: Print the smallest and largest numbers
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
