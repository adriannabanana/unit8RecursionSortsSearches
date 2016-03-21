import java.util.Scanner;
import java.io.File;
import java.io.FileReader;


// Asks user for a file name and prints the number of characters, words, and lines in that file.

public class WC
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("File name: ");
        File inputFile = new File(s.next());
        Scanner in = new Scanner(inputFile);
        while(in.hasNext
        