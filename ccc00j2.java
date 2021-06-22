import java.util.*;

public class CCC00J2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int m = in.nextInt();
    int n = in.nextInt();
    
    int cnt = 0;
    for (int i = m; i <= n; i++)
    {
      if (rotatable(i + "")) cnt++;
    }
    System.out.println(cnt);
  }
  
  static boolean rotatable(String s)
  {
    String s2 = "";
    for (int i = s.length()-1; i >= 0; i--)
    {
      char c = s.charAt(i);
      if (c == '2' ||
          c == '3' ||
          c == '4' ||
          c == '5' ||
          c == '7') return false;
      if (c == '6')
      {
        s2 += 9;
      }
      else if (c == '9')
      {
        s2 += 6;
      }
      else
      {
        s2 += c;
      }
    }
    return s.equals(s2);
  }
}
