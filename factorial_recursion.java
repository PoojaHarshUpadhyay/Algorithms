import com.sun.tools.javac.util.Convert;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    int n = 4;
    long result = factorial(n);

    System.out.println(result);

  }

  private static long factorial(int n) {
    if(n == 1 || n == 0 ) {
      return  1;
    } else {
       long result = n* factorial(n-1);
       return result;
    }
  }

}


