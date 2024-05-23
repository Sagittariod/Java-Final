import java.util.Scanner;
import java.util.ArrayList;

public class MultipleChoice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        String[] trueAnswers = {"a", "c", "a"};
        ArrayList<String> userAnswers = new ArrayList<>();
        String[] questions = {"This is the most common species of primates.", "This primate is the largest of them all.", "This species is a great ape with the scientific name 'Pongo'."};
        String[] potentialChoices = {"a) Humans, b) Neanderthals, c) Spider Monkeys, d) Lemurs", "a) Baboons, b) Orangutans, c) Gorillas, d) Mandrills", "a) Orangutans, b) Strepsirrhini, c) Lemurs, d) Chimpanzees"};
        String[] generateHint = {"This species is most likely the one currently taking this quiz.", "The scientific name of this species is also the name they are typically and informally called.", "This species is known for its orange appearance."};
        
        int score = 0;
        

        System.out.println("Welcome to the quiz. When responding to a question, type the letter corresponding to your answer choice. Type 'Hint' to generate a hint for the current question. Your final score will be displayed after answering every question. Type anything to continue to the quiz.");
        scan.next();
        

        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            System.out.println(potentialChoices[i]);
            String tempAnswer = scan.next();
            userAnswers.add(tempAnswer);
            
            while (userAnswers.get(i).equalsIgnoreCase("Hint"))
            {
                System.out.println(generateHint[i]);
                System.out.println("Please enter your answer again:");
                tempAnswer = scan.next();
                userAnswers.set(i, tempAnswer); // Update the user's answer in the list
            }
            
            if(userAnswers.get(i).equalsIgnoreCase(trueAnswers[i]))
            {
                score++;
            }
        }

        System.out.println("Final Score: " + score + " out of " + questions.length);
        System.out.println("Enter any combination of characters to exit.");
        scan.next();
    }

}