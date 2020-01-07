
package cokboyutluarrayler;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class CokBoyutluArrayler {

    
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[][] array2 = new int[2][2];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        Scanner scan = new Scanner(System.in);
        int[][] array3 = new int[2][2];
        for(int i =0; i<2; i++){
            for(int j =0; j<2; j++){
                System.out.print("array["+i+"]["+j+"] : ");
                array3[i][j] = scan.nextInt();
            }
        }
        
        for(int i =0; i<2; i++){
            for(int j =0; j<2; j++){
                System.out.print("array["+i+"]["+j+"] : " +array3[i][j]);
                System.out.print("\t\t");
                
            }
            System.out.println("");
        }
        
        
    }
    
}
