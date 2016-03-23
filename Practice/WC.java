import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



// Asks user for a file name and prints the number of characters, words, and lines in that file.

public class WC
{
    public static void main(String[] args) throws FileNotFoundException
    {
        int chars = 0;
        int words = 0;
        int lines = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("File name: ");
        
        File inputFile = new File(s.next());
        Scanner inLine = new Scanner(inputFile);
        Scanner inWord = new Scanner(inputFile);
        inWord.useDelimiter("[^A-Za-z]+");
        while (inLine.hasNextLine())
        {
            lines++;
            inLine.nextLine();
        }
        
        while (inWord.hasNext())
        {
            words++;
            String word = inWord.next();
            for (int i = 0; i < word.length(); i++)
            {
                chars++;
            }
        }

        System.out.println("\nCharacters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
        