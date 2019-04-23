import com.sun.tools.javac.util.Convert;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    int[] n = {3,3,4};
    long result = majorityElement(n);

    System.out.println(result);

  }

  private static int majorityElement(int[] nums) {
   Arrays.sort(nums);
    return nums[nums.length/2];
  }

}


