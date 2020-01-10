package staticolmayanınnerclass;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class Matematik {
    private double PI = Math.PI;
    
    public class Factorial{
        public void faktorial(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayı giriniz :");
            int sayi = scan.nextInt();
            int fak=1;
            for(int i =1; i<=sayi; i++){
                fak*=i;
            }
            System.out.println(sayi+"! = "+fak);
        }
    }
    public class Asal{
        public boolean asalMi(int sayi){
            int i = 2;
            while(i<sayi){
                if(sayi%i==0){
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public class Alan{
        public class DaireAlan{
            public void daireAlan(int yaricap){
            System.out.println("Dairenin alanı : "+(PI*yaricap*yaricap));
        }
        }
        
    }
}
