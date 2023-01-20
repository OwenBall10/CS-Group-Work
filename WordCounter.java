import java.util.Scanner;

public class WordCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        int wordCount = 1;

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ' ')
            {
                wordCount++;
            }
        }
        System.out.println("Number of words: " + wordCount);
    }
}
