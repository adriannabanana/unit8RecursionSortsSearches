import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNames
{
   public static final double LIMIT = .5;
   public static final double GIRLS_TOTAL = 18450257;
   public static final double BOYS_TOTAL = 19229058;
   public static double currentGirls = 0;
   public static double currentBoys = 0;
   
   public static void main(String[] args) throws FileNotFoundException
   {  
      Scanner s = new Scanner(System.in);
      System.out.print("File name: ");
      File inputFile = new File(s.next());
      Scanner in = new Scanner(inputFile);
      in.useDelimiter(",");
      
      RecordReader boys = new RecordReader(LIMIT, BOYS_TOTAL, currentBoys);
      RecordReader girls = new RecordReader(LIMIT, GIRLS_TOTAL, currentGirls);
      
      while (boys.hasMore() || girls.hasMore())
      {
         int rank = in.nextInt();
         System.out.print(rank + " ");
         boys.process(in);
         girls.process(in);
         System.out.println();
      }

      in.close();
   }
}   
