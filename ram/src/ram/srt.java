import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* package codechef; // don't place package name! */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while((test--) > 0)
        {
          int n = sc.nextInt();
           
            int arr[][] = new int[n][n];
          
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                    
                }
            }
            
            int r_low, c_low;
            int row , col;
            row = n-1;
            col = n-1;
            r_low =0;
            c_low =0;
            while(r_low<=row && c_low <= col)
            {
                for(int i=c_low; i<=col;i++)
                {
                    System.out.print(arr[r_low][i] + " ");
                }
                r_low++;
                for(int i=r_low; i<=row;i++)
                {
                    System.out.print(arr[i][col] + " ");
                }
                col--;
                if(c_low <= col)
                {
                for(int i=col; i>=c_low;i--)
                {
                    System.out.print(arr[row][i] + " ");
                }
                row--;
                }
                if(r_low<= row)
                {
                for(int i=row; i>=r_low;i--)
                {
                    System.out.print(arr[i][c_low] + " ");
                }
                c_low++;
                }
            }
        }
    }
    
}

    
