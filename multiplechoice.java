import java.util.Scanner;

public class MultipleChoice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String[] trueAnswers = {"a"};
        String[] userAnswers = {""};
        String[] questions = {"This is the most common species of primates."};
        String[] potentialChoices = {"a) Homo sapiens, b) Homo neanderthalensis, c) Ateles, d) Lemuroidea"};
        String[] generateHint = {"This species is most likely the one currently taking this quiz."};
        
        int score = 0;
        

        System.out.println("Welcome to the quiz. When responding to a question, type the letter corresponding to your answer choice. Type 'Hint' to generate a hint for the current question. Type anything to continue to the quiz.");
        scan.next();
        
        System.out.println(questions[0]);
        System.out.println(potentialChoices[0]);
        userAnswers[0] = scan.next();

        for(int i = 0; i < trueAnswers.length; i++)
        {
            
            if(userAnswers[i].equalsIgnoreCase("Hint"))
            {
                System.out.println(generateHint[i]);
                userAnswers[0] = scan.next();
            }
            
            else if(userAnswers[i].equalsIgnoreCase(trueAnswers[i]))
            {
                score++;
            }
            else
            {
                
            }
            
        }

        System.out.println("Final Score: " + score);
    }

}
