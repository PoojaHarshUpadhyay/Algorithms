/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmspractice;

/**
 * refer theory from interview book
 * @author pooja
 */
public class BinarySearchAlgo {
    
    public int binary_search(int[] a, int x)
    {
        int start_p = 0;
        int end_r = a.length - 1;
        
        while (start_p <= end_r)
        {
            int mid_q =( start_p + end_r ) / 2;
            if (mid_q == x)
            {
                if (a[mid_q] == x)
                {
                   return a[mid_q];
                }
            }
            else if ( mid_q > x )
            {
                end_r = mid_q - 1;
            }
            else{
                start_p = mid_q + 1;
            }
        }
        return  -1;
    }
}
