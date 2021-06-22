import java.util.*;

public class CCC14J3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 100;
    int d = 100;
    
    for (int i = 0; i < n; i++)
    {
      int ax = in.nextInt();
      int dy = in.nextInt();
      if (ax > dy) d -= ax;
      else if (ax < dy) a -= dy;
    }
    System.out.println(a);
    System.out.println(d);
  }
}
