import java.util.*;

public class CCC11J2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    Boolean b = false;
    for (int t = 1; t <= m; t++)
    {
      int a = -6 * (int) Math.pow(t, 4) + h * (int) Math.pow(t, 3) + 2 * (int) Math.pow(t, 2) + t;
      if (a <= 0) 
      {
        System.out.println("The balloon first touches ground at hour: \n" + t); 
        b = true;
        break;
      }
    }
    if (b == false) System.out.println("The balloon does not touch ground in the given time.");
  }
}
