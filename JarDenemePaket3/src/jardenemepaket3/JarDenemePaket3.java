/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardenemepaket3;

import com.gokhanbirkin.matematik.Matematik;
import java.util.Scanner;

/**
 *
 * @author sgb_3
 */
public class JarDenemePaket3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        Scanner scan = new Scanner(System.in);
        String islemler = "1.Toplama \n"
                + "2.Çıkartma\n"
                + "3.Çarpma\n"
                + "4.Bölme\n"
                + "Çıkış için q basınız";
        
        while(true){
            System.out.println(islemler);
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
            }else if(islem.equals("1")){
                System.out.print("Birinci sayıyı giriniz : ");
                int a = scan.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                int b = scan.nextInt();
                scan.nextLine();
                matematik.toplama(a, b);
            }else if(islem.equals("2")){
                System.out.print("Birinci sayıyı giriniz : ");
                int a = scan.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                int b = scan.nextInt();
                scan.nextLine();
                matematik.cikarma(a, b);
            }
            else if(islem.equals("3")){
                System.out.print("Birinci sayıyı giriniz : ");
                int a = scan.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                int b = scan.nextInt();
                scan.nextLine();
                matematik.carpma(a, b);
            }
            else if(islem.equals("4")){
                System.out.print("Birinci sayıyı giriniz : ");
                int a = scan.nextInt();
                System.out.print("İkinci sayıyı giriniz : ");
                int b = scan.nextInt();
                scan.nextLine();
                matematik.bolme(a, b);
            }else{
                System.out.println("Yanlış bir işlem seçtiniz. Tekrar deneyiniz.");
            }
        }
    }
    
}
