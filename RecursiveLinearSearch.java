/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmspractice;

/**
 *
 * @author pooja
 */
public class RecursiveLinearSearch {
    public int recursiveLinearSearch(int[] a, int i, int x)
    {
       if(i > a.length - 1)
       {
          return -1;
       }
       else if (a[i] == x)
       {
           return i;
       }
       else {
           System.out.println("index is : " + i);
          return recursiveLinearSearch(a, i+1, x);
       }
    }
}
