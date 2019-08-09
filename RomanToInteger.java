import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    String S = "MCMXCIV";
    int result = romanToInt(S);
    System.out.println(result);
  }

  static int romanToInt(String s) {
    int res = 0;
    char[] carr = s.toCharArray();
    int i = 0;
    while (i < carr.length) {

      int val1 = funMap(carr[i]);
      int val2 = 0;
      if (!(i >= carr.length-1)) {
        val2 = funMap(carr[i + 1]);
      }
      if (val1 < val2) {
        res += val2 - val1;
        i = i + 2;
      } else {
        res += val1;
        i++;
      }
    }
    return res;
  }

  static int funMap(char r) {
    int val = 0;
    Map<Character, Integer> num = new HashMap<>();
    num.put('I', 1);
    num.put('V', 5);
    num.put('X', 10);
    num.put('L', 50);
    num.put('C', 100);
    num.put('D', 500);
    num.put('M', 1000);
    if (num.containsKey(r)) {
      val = num.get(r);
    }
    return val;
  }
}
