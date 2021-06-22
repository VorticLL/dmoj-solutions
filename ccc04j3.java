import java.util.*;

public class CCC04J3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    String[] adj = new String[n];
    String [] noun = new String[m];
    for (int i = 0; i < n; i++)
    {
      adj[i] = in.next();
    }
    for (int i = 0; i < m; i++)
    {
      noun[i] = in.next();
    }
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        System.out.println(adj[i] + " as " + noun[j]);
      }
    }
  }
}
