/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SimpleBinaryScarchAlgorithm {
    public static void main(String args[]){
         
        Scanner sc = new Scanner(System.in);
        int i, j, n, mid, srch, Start, End;
        System.out.print("How many elements?: ");
        n = sc.nextInt();
        int [] arr = new int[n+3];
        System.out.println("Enter the elements:");
        for(i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        srch = sc.nextInt();
        for(i = 0; i < n; i++)
            {
                    for(j = i + 1; j < n; j++)
                    {
                            if(arr[i] > arr[j])
                            {
                                   arr[i] ^= arr[j];
                                   arr[j] ^= arr[i];
                                   arr[i] ^= arr[j];
                            }
                   }
           }
           Start = 0; End = n-1;
           mid = (Start + End)/2;
           while(Start <= End && arr[mid] != srch)
           {
                  if(srch < arr[mid])
                  {
                           End = mid-1;
                  }
                  else
                  {
                           Start = mid+1;
                  }
                  mid = (Start + End)/2;
          }
          if(arr[mid] == srch)
          {
                  System.out.println("Element found at the position: " + mid);
          }
          else
          {
                 System.out.println("Element is not available on the array.");
          }
    }
}

    

