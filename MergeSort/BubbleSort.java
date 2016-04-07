import java.util.Arrays;

public class BubbleSort
{
    public BubbleSort() {}

    public static void sort(int[] numArray)
    {
        int n = 0;
        for (int i = 0; i < numArray.length; i++)
        {
            for (int j = 1; j < (numArray.length - i); j++)
            {
                if (numArray[j-1] > numArray[j])
                {
                    n = numArray[j-1];
                    numArray[j-1] = numArray[j];
                    numArray[j] = n;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(4,50);
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
        
    }

}
