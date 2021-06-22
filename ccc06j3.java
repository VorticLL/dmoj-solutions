import java.util.*;

public class CCC06J3
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    
    HashMap<Character, String> map = new HashMap<Character, String>();
    map.put('a', "2");
    map.put('b', "22");
    map.put('c', "222");
    map.put('d', "3");
    map.put('e', "33");
    map.put('f', "333");
    map.put('g', "4");
    map.put('h', "44");
    map.put('i', "444");
    map.put('j', "5");
    map.put('k', "55");
    map.put('l', "555");
    map.put('m', "6");
    map.put('n', "66");
    map.put('o', "666");
    map.put('p', "7");
    map.put('q', "77");
    map.put('r', "777");
    map.put('s', "7777");
    map.put('t', "8");
    map.put('u', "88");
    map.put('v', "888");
    map.put('w', "9");
    map.put('x', "99");
    map.put('y', "999");
    map.put('z', "9999");

    while (true)
    {
      int cnt = 0;
      String s = in.nextLine();
      if (s.equals("halt")) break;
     for (int i = 0; i < s.length(); i++)
     {
       char c = s.charAt(i);
       String buttons = map.get(c);
       if (i > 0)
       {
         char prev = s.charAt(i-1);
         String prevB = map.get(prev);
         if (buttons.charAt(0) == prevB.charAt(0)) cnt += 2;
       }
       cnt += buttons.length();
      }
      System.out.println(cnt);
    }
  }
}
