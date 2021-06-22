import java.util.*;

public class CCCHK15J1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int n = in.nextInt();
    int alice = 0;
    int bob = 0;
    String[] Alice = new String[n];
    String[] Bob = new String[n];
    
    for (int i = 0; i < n; i++)
    {
      Alice[i] = in.next();
    }
    for (int i = 0; i < n; i++)
    {
      Bob[i] = in.next();
    }
    for (int i = 0; i < n; i++)
    {
      if (Alice[i].equals("rock") && Bob[i].equals("scissors")) alice++;
      else if (Alice[i].equals("paper") && Bob[i].equals("rock")) alice++;
      else if (Alice[i].equals("scissors") && Bob[i].equals("paper")) alice++;
      else if (Bob[i].equals("rock") && Alice[i].equals("scissors")) bob++;
      else if (Bob[i].equals("paper") && Alice[i].equals("rock")) bob++;
      else if (Bob[i].equals("scissors") && Alice[i].equals("paper")) bob++;
    }
    System.out.println(alice + " " + bob);
  }
}
