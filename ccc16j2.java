import java.util.*;
import java.io.*;

public class CCC16J2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int[][] sum = new int[2][4];
    int[][] a = new int[4][4];
    for (int i = 0; i < 4; i++) // row
    {
      for (int j = 0; j < 4; j++) //col
      {
        a[i][j] = in.nextInt();
        sum[0][j] += a[i][j];
        sum[1][i] += a[i][j];
      }
    }
    if (sum[0][0] == sum[0][1] && 
        sum[0][1] == sum[0][2] && 
        sum[0][2] == sum[0][3] && 
        sum[1][0] == sum[0][1] && 
        sum[1][0] == sum[1][1] && 
        sum[1][0] == sum[1][2] && 
        sum[1][0] == sum[1][3]) System.out.println("magic");
    else System.out.println("not magic");
  }
}
