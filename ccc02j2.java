import java.util.*;
import java.io.*;

public class CCC02J2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    while (true)
    {
      String s = in.nextLine();
      if (s.equals("quit!")) break;
      else if (s.length() >= 4 && 
               s.substring(s.length()-2).equals("or") && 
               s.charAt(s.length()-3)!='a'&& 
               s.charAt(s.length()-3)!='e'&& 
               s.charAt(s.length()-3)!='i'&& 
               s.charAt(s.length()-3)!='o'&& 
               s.charAt(s.length()-3)!='u'&& 
               s.charAt(s.length()-3)!='y')
      {
        System.out.println(s.substring(0, s.length()-1) + "ur");
      }
      else System.out.println(s);
    }
  }
}
