import java.util.*;

public class CCC12J3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    {
      int k = in.nextInt();
      
      for (int i = 0; i < k; i++) // first k lines
      {
        for (int j = 0; j < k; j++)
        {
          System.out.print("*");
        }
        for (int j = 0; j < k; j++)
        {
          System.out.print("x");
        }
        for (int j = 0; j < k; j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
        for (int i = 0; i < k; i++) // middle k lines
      {
        for (int j = 0; j < k; j++)
        {
          System.out.print(" ");
        }
        for (int j = 0; j < 2*k; j++)
        {
          System.out.print("x");
        }
        System.out.println();
        }
        for (int i = 0; i < k; i++)  // last k lines
      {
        for (int j = 0; j < k; j++)
        {
          System.out.print("*");
        }
        for (int j = 0; j < k; j++)
        {
          System.out.print(" ");
        }
        for (int j = 0; j < k; j++)
        {
          System.out.print("*");
        }
        System.out.println();
        }
    }
  }
}
