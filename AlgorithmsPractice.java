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
public class AlgorithmsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int arr[] = {12, 11, 13, 5, 6, 7};
 
       
        QuickSortAlgo ob = new QuickSortAlgo();
        ob.quickSort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
       
    }
    
     public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
