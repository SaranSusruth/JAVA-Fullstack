public class ExerciseII {
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        int i = 1;
        System.out.print("For loop:");
        for (i = 1; i <= 5; i++)
        {
            System.out.print(" " + i);
        }
        System.out.print(" \n");
        System.out.print("While loop:");
        i = 1;

        // TODO: Print numbers 1 to 5 using while loop
         
        while (i <= 5)
        {  
            System.out.print(" " + i);
            i++;
        }
         System.out.print(" \n");
         System.out.print("Do-While zoop:");
         i = 1;

        // TODO: Print numbers 1 to 5 using do-while loop
         do
        {   
            
            System.out.print(" " + i);
            i++;
        }
        while (i <= 5);
    
        
    }
}
