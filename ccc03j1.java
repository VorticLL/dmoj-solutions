import java.util.*;

public class CCC03J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int t = in.nextInt();
    int s = in.nextInt();
    int h = in.nextInt();
    
    for (int i = 0; i < t; i++)
    {
      System.out.print("*");
      for (int j = 0; j < s; j++) System.out.print(" ");
      System.out.print("*");
      for (int j = 0; j < s; j++) System.out.print(" ");
      System.out.println("*");
      
    }
    for (int j = 0; j < 2*s+3; j++) System.out.print("*");
    System.out.println();
    
    for (int i = 0; i < h; i ++)
    {
      for (int j = 0; j < s+1; j++) System.out.print(" ");
      System.out.println("*");
    }
  }
}
