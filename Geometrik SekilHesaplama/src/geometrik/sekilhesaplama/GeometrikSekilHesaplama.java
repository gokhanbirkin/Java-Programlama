/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrik.sekilhesaplama;

import java.util.Scanner;

/**
 *
 * @author sgb_3
 */
public class GeometrikSekilHesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sekil sekil;
        Scanner scan = new Scanner(System.in);
        String islemler = "İşlemler ...\n"
                + "1. Kare Alanı Hesapla\n"
                + "2. Üçgen Alanı Hesapla\n"
                + "3. Daire Alanı Hesapla\n"
                + "Çıkış için q giriniz";
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz ?");
            String sekilTuru = scan.nextLine();
            if(sekilTuru.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else if(sekilTuru.equals("1")){
                System.out.print("Karenin kenarı :");
                int kenar = scan.nextInt();
                scan.nextLine();
                sekil = new Kare(kenar, "Kare");
                sekil.alanHesapla();
            }else if(sekilTuru.equals("2")){
                System.out.println("Üçgenin kenarlarını boşluk bırakarak giriniz");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                scan.nextLine();
                sekil = new Ucgen(a, b, c, "Üçgen");
                sekil.alanHesapla();
            }else if(sekilTuru.equals("3")){
                System.out.println("Dairenin yarıçapını giriniz :");
                int a = scan.nextInt();
                scan.nextLine();
                sekil = new Daire(a, "Daire");
                sekil.alanHesapla();
            }else{
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
                System.out.println(islemler);

            }
        }
    }
    
}
