import java.util.*;

public class CCC02S2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int y = in.nextInt();
    
    int g  = (x <= y)?gcd(x,y):gcd(y,x);
    
    x /= g;
    y /= g;
    
    int whole = x/y;
    int frac = x % y;
    
    if (whole != 0) System.out.print(whole);
    if (whole != 0 && frac != 0) System.out.print(" ");
    if (frac != 0) System.out.print (frac + "/" + y);
    System.out.println();
  }
  static int gcd(int x, int y)
  {
    if (x == 0) return y;
    return gcd(y % x, x);
  }
}
