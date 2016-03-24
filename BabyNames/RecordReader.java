import java.util.Scanner;

/**
   This class processes baby name records.
*/
public class RecordReader
{
   private double current;
   private double limit;
   private double total;

   /**
      Constructs a RecordReader with a zero total.
   */
   public RecordReader(double aLimit, double aTotal, double currentCount)
   {
      limit = aLimit;
      total = aTotal;
      current = currentCount;
   }

   /**
      Reads an input record and prints the name if the current total is less 
      than the limit.
      @param in the input stream
   */
   public void process(Scanner in)
   {
      String name = in.next();
      int count = in.nextInt();
      current+=count;
      if (current/total < limit) { System.out.print(name + " "); }
   }
   

   /**
      Checks whether there are more inputs to process
      @return true if the limit has not yet been reached
   */
   public boolean hasMore()
   {
      return current/total < limit;
   }
}
