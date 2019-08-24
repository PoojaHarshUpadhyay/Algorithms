import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {

    int[] Arry = {14, 15, 11, 2};
    mergeSort(Arry, 0, Arry.length);
    for (int i = 0; i < Arry.length; i++) {
      System.out.println(Arry[i]);
    }
  }

  static void mergeSort(int[] arr, int m, int n) {
    int start = m;
    int end = n;
    int mid = arr.length / 2;
    if (mid == 0) {
      return;
    }
    int[] lArr = new int[mid];
    int[] rArr = new int[mid];
    int k = 0;
    for (int i = 0; i < lArr.length; i++) {
      lArr[i] = arr[i];
      k++;
    }
    for (int j = 0; j < rArr.length; j++) {
      rArr[j] = arr[k];
      k++;
    }
    mergeSort(lArr, start, mid);
    mergeSort(rArr, mid + 1, end);
    merge(lArr, rArr, arr);
  }

  static void merge(int[] lArr, int[] rArr, int[] Arr) {

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < lArr.length && j < rArr.length) {
      if (lArr[i] > rArr[j]) {
        Arr[k] = rArr[j];
        j++;
      } else {
        Arr[k] = lArr[i];
        i++;
      }
      k++;
    }
    while (i < lArr.length) {
      Arr[k] = lArr[i];
      i++;
      k++;
    }
    while (j < rArr.length) {
      Arr[k] = rArr[j];
      j++;
      k++;
    }
  }
}
