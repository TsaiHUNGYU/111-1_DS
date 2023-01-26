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
public class HanoiTower {

    public static void move(int n , char from , char aux , char to)
        {
            if(n == 1)
            {
                System.out.printf("Move disk %d from %c --> %c\n" , n , from , to);
            }
            else
            {
                move(n-1, from , to , aux);
                System.out.printf("Move disk %d from %c --> %c\n", n , from , to);
                move(n-1 , aux , from , to);
            }
        }
    public static void main(String[] args) {
        move(3,'A','B','C');

    }
    
}
