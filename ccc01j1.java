import java.util.*;

public class CCC01J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 1; i <= n; i+= 2)
    {
      for (int j = 1; j <= i; j++) System.out.print("*");
      for (int j = 1; j <= 2*n-2*i; j++) System.out.print(" ");
      for (int j = 1; j < i; j++) System.out.print("*");
      System.out.println("*");
    }
    for (int i = n-2; i >= 1; i -= 2)
    {
      for (int j = i; j >= 1; j--) System.out.print("*");
      for (int j = 2*n-2*i; j >= 1; j--) System.out.print(" ");
      for (int j = i; j > 1; j--) System.out.print("*");
      System.out.println("*");
    }
  }
}
