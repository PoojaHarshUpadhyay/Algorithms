import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    int n = 9;
    int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
    int result = sockMerchant(n, arr);
    System.out.println(result);
  }

  static int sockMerchant(int n, int[] ar) {
    int[] sortArray = sortedArray(ar);
    int count = countSock(sortArray);
    return count;
  }

  static int countSock(int[] sortArray) {
    int count = 0;
    int i = 0;
    while (i < sortArray.length - 1) {
      if (sortArray[i] == sortArray[i + 1]) {
        count++;
        i += 2;
      } else {
        i++;
      }
    }
    return count;
  }

  static int[] sortedArray(int[] ar) {
    boolean sorted = false;
    while (!sorted) {
      sorted = true;
      for (int i = 0; i < ar.length - 1; i++) {
        if (ar[i] > ar[i + 1]) {
          int temp = ar[i + 1];
          ar[i + 1] = ar[i];
          ar[i] = temp;
          sorted = false;
        }
      }
    }
    return ar;
  }
}
