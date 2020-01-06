
package arraylerornek;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class ArraylerOrnek {
    
    public static void arrayiBastir(int[] array){
        
        for(int i =0; i<array.length; i++){
            System.out.println("Array["+i+"] = "+array[i]);
        }
    }
    
    public static double ortalamaBul(int[] array){
        int toplam = 0;
        for(int i =0; i<array.length; i++){
            toplam += array[i];
        }
        return (double)toplam/array.length;
    }
    
    public static void main(String[] args) {
        //int a = 5;
        //int[] a = new int[10];
        /*a[5] = 7;
        a[9] = 14;
        double[] b;*/
        /*int[] a = {30,40,50,60,70};
        
        System.out.println("a'nın 0. indeksi : "+a[0]);
        System.out.println("a'nın 3. indeksi : "+a[3]);*/
        
        int[] a = new int[5];
        int[] b = {1,2,3,4,5,6,7};
        //System.out.println("b arrayinin boyu  : "+b.length);
        Scanner scan = new Scanner(System.in);
        arrayiBastir(b);
        System.out.println("Ortalama : "+ortalamaBul(b));
        
        /*for(int i=0; i<5; i++){
            a[i] = i*7+2;
        }
        for(int i=0; i<5; i++){
            System.out.println("a["+i+"] : "+a[i]);
        }*/
        
        /*for(int i=0; i<5; i++){
            System.out.print((i)+".indeksi giriniz : ");
            a[i] = scan.nextInt();
        }
        System.out.println("--------------------");
        for(int i=0; i<5; i++){
            System.out.println("a["+i+"] : "+a[i]);
        }*/
    }
    
}
