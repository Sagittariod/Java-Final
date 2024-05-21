import java.util.Scanner;

public class MultipleChoice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] trueAnswers ={"b"};
        String[] userAnswers ={""};
        int score = 0;

        System.out.println("Example question, the answer is the second");
        System.out.println("a) Not dis");
        System.out.println("b) dis");
        System.out.println("c) Not dis");
        
        userAnswers[0] = scan.next();

        System.out.println(userAnswers[0]);

        for(int i = 0; i < trueAnswers.length; i++)
        {
            if(userAnswers[i].equalsIgnoreCase(trueAnswers[i]));
            {
                score++;
            }
        }

        System.out.println("Final Score: " + score);
    }

}
