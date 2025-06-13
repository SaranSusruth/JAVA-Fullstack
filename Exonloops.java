public class Exonloops
{
    public static void main(String[] args)
    {
        int score = 75;
        char grade = 'B';

        // TODO: Check pass or fail
        if (score >= 50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }

        // TODO: Determine grade based on score
        if (score >= 90)
        {
            grade = 'A';
        }
        else if (score <= 89)
        {
            grade = 'B';
        }
        else if (score <= 74)
        {
            grade = 'C';
        }
        else if (score >= 60)
        {
            grade = 'D';
        }
        
        System.out.println("Grade: " + grade);
    }
}
