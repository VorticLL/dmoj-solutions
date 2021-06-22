import java.util.*;

public class CCC03J2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    while (true)
    {
      int n = in.nextInt();
      if ( n == 0) return;
      
      for (int i = (int)Math.sqrt(n); i >= 1; i--)
      {
        int j = n/i;
        if (i * j == n)
        {
          System.out.printf("Minimum perimeter is %d with dimensions %d x %d\n", 2*i+2*j, i, j);
          break;
        }
      }
    }
  }
}
