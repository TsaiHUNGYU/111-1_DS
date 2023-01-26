/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author User
 */


public class Week10 {

    /**
     * @param args the command line arguments
     */
    public static int fac(int i)
    {
        if(i==1)
        {
            return i;
        }
        else{
            return i*fac(i-1);
        }
    }
    public static int fib(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        //fac
        
        int sum = fac(3);
        System.out.println(sum);

        //fib
        int n = 5;
        int x = 0;
        int y = 0;
        for (int i = 0 ; i<n ; i++)
        {
            if (i == 0)
            {
                x = 0;
                y = 1;
            }
            else
            {
                int temp = x;
                x = y;
                y = temp + y;
            }
        }
        System.out.println(y);
        int sum1 = fib(5);
        System.out.println(sum1);
    }
    
}
