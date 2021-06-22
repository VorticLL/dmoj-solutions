import java.util.*;
public class CCC18J3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    int[] arr = new int[4];
    for (int i = 0; i < 4; i++)
    {
      arr[i] = in.nextInt();
    }
    
    int cnt = 0;
    System.out.print(0 + " ");
    System.out.print(arr[0] + " ");
    System.out.print(arr[0] + arr[1] +" ");
    System.out.print(arr[0] + arr[1] + arr[2] + " ");
    System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
    System.out.print(arr[0] + " ");
    System.out.print(0 + " ");
    System.out.print(arr[1] + " ");
    System.out.print(arr[1] + arr[2] + " ");
    System.out.println(arr[1] + arr[2] + arr[3]);
    System.out.print(arr[0] + arr[1] + " ");
    System.out.print(arr[1] + " ");
    System.out.print(0 + " ");
    System.out.print(arr[2] + " ");
    System.out.println(arr[2] + arr[3]);
    System.out.print(arr[0] + arr[1] + arr[2]+ " ");
    System.out.print(arr[1] + arr[2] + " ");
    System.out.print(arr[2] + " ");
    System.out.print(0 + " ");
    System.out.println(arr[3]);
    System.out.print(arr[0] + arr[1] + arr[2] + arr[3] + " ");
    System.out.print(arr[1] + arr[2] + arr[3] + " ");
    System.out.print(arr[2] + arr[3] +" ");
    System.out.print(arr[3] + " ");
    System.out.println(0);
  }
}
