
package arraycopyandsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class ArrayCopyAndSort {

    public static int[] arrayiDoldur(int sayi){
        Scanner scan = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for(int i =0; i<sayi; i++){
            cikti[i] = scan.nextInt();
        }
        return cikti;
    }
    
    public static void arrayiBastir(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
    }
    
    public static void arraySort(int[] array){
        //Arrays Sınıfı : sort
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            System.out.println("array["+i+"] = "+array[i]);
        }
    }
    
    public static void main(String[] args) {
        /*int[] a = arrayiDoldur(6);
        arraySort(a);
        System.out.println(a[0]);*/
        
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        if(a==b){ //Referansları kıyaslar.
            System.out.println("Eşitler.");
        }else{
            System.out.println("Eşit değiller.");
        }
        if(Arrays.equals(a, b)){ //içerik kıyaslar
            System.out.println("Eşitler.");
        }else{
            System.out.println("Eşit değiller.");
        }
    }
    
}
