import java.util.*;

public class CCCHK08J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int c = in.nextInt();
    int cfish = 0;
    for (int i = 0; i < c; i++)
    {
      int fish = in.nextInt()*in.nextInt();
      if (fish > cfish) cfish = fish;
    }
    int n = in.nextInt();
    int nfish = 0;
    for (int i = 0; i < n; i++)
    {
      int fish = in.nextInt()*in.nextInt();
      if (fish > nfish) nfish = fish;
    }
    if (cfish > nfish) System.out.println("Casper");
    else if (cfish < nfish) System.out.println("Natalie");
    else System.out.println("Tie");
  }
}
