import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String p = "pusheen";
    int cnt = 0;
    for (int i = 0; i < 7; i++)
    {
      if (s.charAt(i) != p.charAt(i)) cnt++;
    }
    System.out.println(cnt);
  }
}
