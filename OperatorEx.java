public class OperatorEx {
    public static void main(String[] args){
     
         // write code here
         int a = 20;
         int b = 10;
         
         System.out.println("Addition: " + (a+b));
         System.out.println("Subtraction: " + (a-b));
         System.out.println("Multiplication: " + (a*b));
         System.out.println("Division: " + (a/b));
         
         boolean result = a>b; 
         System.out.println("Is a greater than b? " + result);
         
         result = a>b && b>0;
         System.out.println("Is a > b and b > 0? " + result);
         
    }
}
