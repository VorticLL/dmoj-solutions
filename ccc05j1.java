import java.util.*;

public class CCC05J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int d = in.nextInt();
    int e = in.nextInt();
    int w = in.nextInt();
    
    double a = 0;
    double b = 0;
    
    if (d < 100)
    {
      a = e * 0.15 + w * 0.2;
      b = e * 0.35 + w * 0.25;
    }
    else if (d > 100 && d < 250) 
    {
      a = (d - 100) * 0.25 + e * 0.15 + w * 0.2;
      b = e * 0.35 + w * 0.25;
    }
    else 
    {
      a = (d - 100) * 0.25 + e * 0.15 + w * 0.2;
      b = (d - 250) * 0.45 + e * 0.35 + w * 0.25;
    }
    a = Math.round(a * 100.0) / 100.0;
    b = Math.round(b * 100.0) / 100.0;
    
    System.out.println("Plan A costs " + a);
    System.out.println("Plan B costs " + b);
    if (a > b) System.out.println("Plan B is cheapest.");
    else if (a < b) System.out.println("Plan A is cheapest.");
    else System.out.println("Plan A and B are the same price.");
  }
}
