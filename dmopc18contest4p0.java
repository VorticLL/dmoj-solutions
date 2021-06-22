import java.util.*;

public class DMOPC18C4P0
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    
    int[] A = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
    int[] B = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
    int[] C = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
    int[] D = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
    
    int n = Math.min(B[2], C[2]);
    n = Math.min(n, D[2]);
    
    if (n == B[2] && (B[0] - A[1])*(B[0] - A[1]) + (B[1] - A[2])*(B[1] - A[2]) < A[0]*A[0]) System.out.println("What a beauty!");
    else if (n == C[2] && (C[0] - A[1])*(C[0] - A[1]) + (C[1] - A[2])*(C[1] - A[2]) < A[0]*A[0]) System.out.println("What a beauty!");
    else if (n == D[2] && (D[0] - A[1])*(D[0] - A[1]) + (D[1] - A[2])*(D[1] - A[2]) < A[0]*A[0]) System.out.println("What a beauty!");
    else System.out.println("Time to move my telescope!");
    
  }
}
