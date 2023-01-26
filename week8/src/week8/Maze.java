
package week8;

public class Maze {
    static int[][] maze = { 
             {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
             {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
             {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
             {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
             {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
             {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
             {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
    
    static boolean findPath(int x, int y) {
       if ( x == 1 && y == 1 ) {      
          maze[x][y] = 2;             
          return true;
       }
       else if ( maze[x][y] == 0 ) { 
              maze[x][y] = 2;         
              if ( findPath(x - 1, y) ||     
                   findPath(x + 1, y) ||     
                   findPath(x, y - 1) ||     
                   findPath(x, y + 1) )      
                  return true;
              else {
                  maze[x][y] = 0;     
                  return false;
              }
            }
            else return false;
    } 
    public static void main(String[] args) {
        findPath(5, 8);                 
        System.out.println("迷宮路徑圖(從右下到左上角):");
        for ( int i = 0; i <= 6; i++) {  
           for ( int j = 0; j <= 9; j++) 
              System.out.print(maze[i][j]+" ");
           System.out.println();
        }
        System.out.println("數字 1: 牆壁");
        System.out.println("數字 2: 走過的路徑");
    }
    
}
