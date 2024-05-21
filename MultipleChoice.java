import java.util.Scanner;

public class MultipleChoice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String[] trueAnswers = {"a","c"};
        String[] userAnswers = {""};
        String[] questions = {"This is the most common species of primates.", "Test Question 2"};
        String[] potentialChoices = {"a) Homo sapiens, b) Homo neanderthalensis, c) Ateles, d) Lemuroidea", "c)"};
        String[] generateHint = {"This species is most likely the one currently taking this quiz.", "What hint could I possibly give?"};
        
        int score = 0;
        

        System.out.println("Welcome to the quiz. When responding to a question, type the letter corresponding to your answer choice. Type 'Hint' to generate a hint for the current question. Your final score will be displayed after answering every question. Type anything to continue to the quiz.");
        scan.next();
        

        for(int i = 0; i < trueAnswers.length; i++)
        {
            System.out.println(questions[i]);
            System.out.println(potentialChoices[i]);
            userAnswers[i] = scan.next();
            
            if(userAnswers[i].equalsIgnoreCase("Hint"))
            {
                System.out.println(generateHint[i]);
                String tempAnswer = scan.next();
                userAnswers[i].add(tempAnswer);
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
