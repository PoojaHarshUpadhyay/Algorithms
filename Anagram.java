import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    String a = "bacdc";
    String b = "dcbad";
    int result = makeAnagram(a, b);
  }

  static int makeAnagram(String a, String b) {
    int res = 0;
    char[] char1 = a.toCharArray();
    char[] char2 = b.toCharArray();

    for (int i = 0; i < char1.length - 1; i++) {
      char temp = char1[i + 1];
      char1[i + 1] = char1[i];
      char1[i] = temp;
    }
    String finalStringA = String.valueOf(char1);

    for (int i = 0; i < char1.length - 1; i++) {
      for (int j = 0; j < char2.length - 1; j++) {
        char temp = char2[j + 1];
        char2[j + 1] = char2[j];
        char2[j] = temp;
        String finalStringB = String.valueOf(char2);
        if (finalStringA.equals(finalStringB)) {
          System.out.println("is anagram");
        }
      }
    }
    return res;
  }
}
