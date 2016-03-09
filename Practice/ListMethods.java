import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if (n <= 0)  // The smallest list we can make
        {
            return tempList;
        }
        else        // All other size lists are created here
        {
            for (int i : makeList(n-1))
            {
                tempList.add(i);
            }
        }
        return tempList;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) 
    {
        ArrayList<Integer> clonedList = deepClone(list);
        return clonedList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (Integer i : tList)
        {
            list.add(new Integer(i));
        }
        return list;
    }

}