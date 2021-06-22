import java.util.*;

public class CCC10J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cnt = 0;
    for (int i = n; i >= 0; i--)
    {
      if (i <= 5 && i >= n - i) cnt++;
    }
    System.out.println(cnt);
  }
}
