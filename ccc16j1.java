import java.util.*;

public class CCC16J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int w = 0;
    for (int i = 0; i < 6; i++)
    {
      if (in.nextLine().equals("W")) w++;
    }
    if (w == 5 || w == 6) System.out.println(1);
    else if (w == 3 || w == 4) System.out.println(2);
    else if (w == 1 || w == 2) System.out.println(3);
    else System.out.println(-1);
  }
}
