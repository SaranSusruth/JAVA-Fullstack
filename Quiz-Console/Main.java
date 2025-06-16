public class Main
{
    public static void main(String[] a)
    {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.getScore();
        System.out.println("Thank you for playing the quiz!");
    }

}
