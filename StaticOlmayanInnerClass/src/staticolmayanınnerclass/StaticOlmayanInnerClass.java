package staticolmayanınnerclass;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class StaticOlmayanInnerClass {
    /*
        1.Static Olmayan Inner Classlar
        2.Statlic  Inner Classlar
        3.Lokal(Yerel) Inner Classlar
        4.Anonymous Inner Classlar
    */
    
    public static void main(String[] args) {
        Matematik mat = new Matematik();
               
        Matematik.Factorial fac = new Matematik().new Factorial();
        Matematik.Alan.DaireAlan alan = new Matematik().new  Alan().new DaireAlan();
        Matematik.Asal asal = new Matematik().new Asal();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        if(asal.asalMi(sayi)){
            System.out.println("Sayı asaldır.");
        }else{
            System.out.println("Sayı asal değildir.");
        }
        fac.faktorial();
        alan.daireAlan(sayi);
    }
    
}
