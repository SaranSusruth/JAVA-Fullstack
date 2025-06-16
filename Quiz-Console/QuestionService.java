import java.util.Scanner;

public class QuestionService
 {
     Question questions[] = new Question[5];
     String userAnswer[] = new String[5];

     QuestionService()
     {
        questions[0]= new Question(1,"what is size of int ","1","2","4","8", "3");
        questions[1]= new Question(2,"what is size of char ","1","2","4","8", "1");
        questions[2] = new Question(3,"what is size of float ","1","2","4","8", "3");
        questions[3] = new Question(4,"what is size of double ","1","2","4","8", "4");
        questions[4] = new Question(5,"what is size of long ","1","2","4","8", "4");
     }

     public void playQuiz()
     {
        int i = 0;
        for (Question q : questions)
        {
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            userAnswer[i] = sc.nextLine();
            i++;
         }
         System.out.println("Your answers are :");
         for ( String ans : userAnswer)
         {
            System.out.println(ans);
         }
     }

     public void getScore()
     {
        int score  = 0;
        for (int i = 0; i < questions.length; i++)
        {
            if (userAnswer[i].equals(questions[i].getAnswer()))
            {
                score++;
            }
        }
        System.out.println("Your score is : " + score + " out of " + questions.length);
     }
     

 }
