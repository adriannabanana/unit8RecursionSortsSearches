import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if (n <= 0)   // The smallest list we can make
        {
            return tempList;
        }
        else         // All other size lists are created here
        {
            tempList.addAll(makeList(n-1));
            tempList.add(n);
        }
        return tempList;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) 
    {
        ArrayList<Integer> clonedList = deepClone(list);
        if (clonedList.size() <= 1)
        {
            return clonedList;
        }
        else
        {
           int num = clonedList.remove(0);
           clonedList = reverseList(clonedList);
           clonedList.add(num);
        }
        return clonedList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        return tList;
    }
}