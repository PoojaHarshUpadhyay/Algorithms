import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    int n = 5;
    int result = climbStairs(n);
    System.out.println(result);
  }

  static int climbStairs(int n) {
    if (n <= 0) {
      return 1;
    }
    int[] ways = new int[n + 1];
    ways[0] = 1;
    ways[1] = 1;
    for (int i = 2; i < n +1; i++) {
      ways[i] = ways[i - 1] + ways[i - 2];
    }
    return ways[n];
  }
}
