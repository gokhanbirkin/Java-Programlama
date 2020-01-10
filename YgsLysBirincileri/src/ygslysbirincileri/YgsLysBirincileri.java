/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ygslysbirincileri;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class YgsLysBirincileri {

    
    public static void main(String[] args) {
        /*Sayisal sayisal1 = new Sayisal(23, 45, 42, 17,"Mahmut");
        Sayisal sayisal2 = new Sayisal(27, 44, 43, 13,"Derye");
        Sayisal sayisal3 = new Sayisal(27, 44, 43, 13,"Murat");
        Esitagirlik e1 = new Esitagirlik(42, 13, 32, 44, "Kemal");
        Esitagirlik e2 = new Esitagirlik(40, 38, 11, 42, "Merve");
        Esitagirlik e3 = new Esitagirlik(42, 22, 18, 44, "Mehtap");*/
        String islemler = "İşlemeler...\n"
                + "1. Eşit ağırlık öğrencileri 1.si\n"
                + "2. Sayısal öğrencileri 1.si\n"
                + "Çıkış işin q";
        System.out.println(islemler);
        System.out.println("_________________________________");
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("İşlemi giriniz :");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Program sonlandırılıyor..");
                break;
            }else if(islem.equals("1")){
                System.out.println("Eşit ağırlık öğrencilerinin bilgilerini giriniz..");
                System.out.println("1.Öğrencinin ismini giriniz.");
                String isim1 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur1 = scan.nextInt();
                int mat1 = scan.nextInt();
                int fiz1 = scan.nextInt();
                int sos1 = scan.nextInt();
                scan.nextLine();
                Esitagirlik e1 = new Esitagirlik(tur1, mat1, fiz1, sos1, isim1);
                System.out.println("2.Öğrencinin ismini giriniz.");
                String isim2 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur2 = scan.nextInt();
                int mat2 = scan.nextInt();
                int fiz2 = scan.nextInt();
                int sos2 = scan.nextInt();
                scan.nextLine();
                Esitagirlik e2 = new Esitagirlik(tur2, mat2, fiz2, sos2, isim2);
                System.out.println("3.Öğrencinin ismini giriniz.");
                String isim3 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur3 = scan.nextInt();
                int mat3 = scan.nextInt();
                int fiz3 = scan.nextInt();
                int sos3 = scan.nextInt();
                scan.nextLine();
                Esitagirlik e3 = new Esitagirlik(tur3, mat3, fiz3, sos3, isim3);
                Esitagirlik birinci = birinci(e1, e2, e3);
                System.out.println("Birincimiz : "+birinci.getIsim());
            }else if(islem.equals("2")){
               System.out.println("Sayısal öğrencilerinin bilgilerini giriniz..");
                System.out.println("1.Öğrencinin ismini giriniz.");
                String isim1 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur1 = scan.nextInt();
                int mat1 = scan.nextInt();
                int fiz1 = scan.nextInt();
                int sos1 = scan.nextInt();
                scan.nextLine();
                Sayisal s1 = new Sayisal(tur1, mat1, fiz1, sos1, isim1);
                System.out.println("2.Öğrencinin ismini giriniz.");
                String isim2 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur2 = scan.nextInt();
                int mat2 = scan.nextInt();
                int fiz2 = scan.nextInt();
                int sos2 = scan.nextInt();
                scan.nextLine();
                Sayisal s2 = new Sayisal(tur2, mat2, fiz2, sos2, isim2);
                System.out.println("3.Öğrencinin ismini giriniz.");
                String isim3 = scan.nextLine();
                System.out.println("Notlar(Turk,mat,fiz,sos) olarak giriniz. ");
                int tur3 = scan.nextInt();
                int mat3 = scan.nextInt();
                int fiz3 = scan.nextInt();
                int sos3 = scan.nextInt();
                scan.nextLine();
                Sayisal s3 = new Sayisal(tur3, mat3, fiz3, sos3, isim3);
                Sayisal birinci = birinci(s1, s2, s3);
                System.out.println("Birincimiz : "+birinci.getIsim());
                
            }else{
                System.out.println("Yanlış bir seçim yapıldı tekrar deneyiniz..");
            }
        }
    }
    


    public static <E extends Aday> E birinci(E e1, E e2, E e3){
        if(e1.puanHesapla()>e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla() ){
            return e1;
        }else if(e2.puanHesapla()>e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla() ){
            return e2;
        }else if(e3.puanHesapla()>e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla() ){
            return e2;
        }else{
            return e1;
        }
    }
}