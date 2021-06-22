import java.util.*;

public class CCC07J3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int cases[] = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
    for (int i = 0; i < n; i++)
    {
      int temp = in.nextInt() - 1;
      cases[temp] = 0;
    }
    int offer = in.nextInt();
    double avg = 0;
    int t = 0;
    for (int i = 0; i < 10; i++)
    {
      avg += cases[i];
      if (cases[i] != 0) t++;
    }
    avg = avg/t;
    System.out.println(offer > avg? "deal" : "no deal");
  }
}
