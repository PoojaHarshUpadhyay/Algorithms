import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    int result = countingValleys(12, "UDDDUDUU");
    System.out.println(result);
  }

  static int countingValleys(int n, String s) {
    int altitude = 0;
    int valley = 0;

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c == 'U') {
        if (altitude == -1) {
          valley++;
        }
        altitude++;
      } else {
        altitude--;
      }
    }
    return valley;
  }
}

