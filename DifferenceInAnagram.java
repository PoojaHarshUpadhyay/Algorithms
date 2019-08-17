import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    String a = "cde";
    String b = "abc";
    int result = makeAnagram(a, b);
    System.out.println(result);
  }

  static int makeAnagram(String first, String second) {
    int[] countArray1 = getCharacterCount(first);
    int[] countArray2 = getCharacterCount(second);
    int difference = getDifference(countArray1, countArray2);
    return difference;
  }

  static int[] getCharacterCount(String word) {
    int[] characterArray = new int[26];
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      int offset = (int) 'a';
      int count =  c - offset;
      characterArray[count]++;
    }
    return characterArray;
  }

  static int getDifference(int[] countArray1, int[] countArray2) {
    int delta = 0;
    for (int i = 0; i < countArray1.length; i++) {
      int difference = Math.abs(countArray1[i] - countArray2[i]);
      delta += difference;
    }
    return delta;
  }
}
