import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    String[] str = {"flower","flow","flight"};
    String result = longestCommonPrefix(str);
    System.out.println(result);
  }

  static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    StringBuilder sb = new StringBuilder();

    String fValue = strs[0];
    for (int i = 0; i < fValue.length(); i++) {
      int count = 0;
      for (int j = 1; j < strs.length; j++) {
        int wordLength = strs[j].length();

        if (i < wordLength) {
          if (fValue.charAt(i) != strs[j].charAt(i)) {
            return sb.toString();
          }
          if (fValue.charAt(i) == strs[j].charAt(i)) {
            count++;
          }
        }
      }
      if (count == strs.length - 1) {
        sb.append(fValue.charAt(i));
      }
    }
    return sb.toString();
  }
}

