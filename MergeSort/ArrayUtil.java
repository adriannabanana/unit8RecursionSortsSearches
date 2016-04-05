import java.util.Random;

/**
This class contains utility methods for array manipulation.
 */  
public class ArrayUtil
{ 
    private static Random generator = new Random();

    /**
    Creates an array filled with random values.
    @param length the length of the array
    @param n the number of possible random values
    @return an array filled with length numbers between
    0 and n - 1
     */
    public static int[] randomIntArray(int length, int n)
    {  
        int[] a = new int[length];      
        for (int i = 0; i < a.length; i++)
        {
            a[i] = generator.nextInt(n);
        }

        return a;
    }

    /**
    Swaps two entries of an array.
    @param a the array
    @param i the first position to swap
    @param j the second position to swap
     */
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static String[] randomStringArray(int length, int numChars)
    {
        String[] text = new String[length];
        String characters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < length; i++)
        {
            String yay = "";
            for (int j = 0; j < numChars; j++)
            {
                int randNum = generator.nextInt(26);
                yay += characters.substring(randNum,randNum+1);
            }
            text[i] = yay;
        }
        return text;
    }
    
    private static String randomString(int numChars)
    {
        String text = "";
        String characters = "abcdefghijklmnopqrstuvwxyz";
        for (int j = 0; j < numChars; j++)
        {
            int randNum = generator.nextInt(26);
            text += characters.substring(randNum,randNum+1);
        }
        return text;
    }

    
    public static void main(String[] args)
    {
        String[] text = randomStringArray(10,5);
        for (String i : text)
        {
            System.out.println(i);
        }
    }
}

