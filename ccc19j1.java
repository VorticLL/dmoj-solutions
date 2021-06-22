import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 3*in.nextInt() + 2*in.nextInt() + in.nextInt();
        int b = 3*in.nextInt() + 2*in.nextInt() + in.nextInt();

        if (a>b) System.out.println("A");
        else if (b>a) System.out.println("B");
        else System.out.println("T");
    }
}
