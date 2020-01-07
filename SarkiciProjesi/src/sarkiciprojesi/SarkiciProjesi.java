
package sarkiciprojesi;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class SarkiciProjesi {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scan = new Scanner(System.in);
    
    public static void islemleriBastir(){
        System.out.println("\t 0- İşlemleri Görüntüle");
        System.out.println("\t 1- Şarkıcıları Görüntüle");
        System.out.println("\t 2- Şarkıcı Ekle");
        System.out.println("\t 3- Şarkıcı Güncelle");
        System.out.println("\t 4- Şarkıcı Sil");
        System.out.println("\t 5- Şarkıcı Ara");
        System.out.println("\t 6- Şarkıcılar Uygulamasından Çıkış Yap ");
    }
    
    public static void sarkicilarigoruntule(){
        sarkicilar.sarkicilariBastir();
    }
    public static void sarkiciEkle(){
        System.out.print("Eklemek istediğiniz şarkıcının ismini giriniz : ");
        String isim = scan.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }
    public static void sarkiciGuncelle(){
        System.out.print("Güncellemek istediğiniz pozisyonu giriniz : ");
        int pozisyon = scan.nextInt();
        scan.nextLine();
        System.out.print("Yeni ismi giriniz : ");
        String isim = scan.nextLine();
        sarkicilar.sarkiciGuncelle(isim, pozisyon-1);
    }
    public static void sarkiciSil(){
        System.out.print("Silmek istediğiniz şarkıcının pozisyonunu giriniz : ");
        int pozisyon = scan.nextInt();
        
        sarkicilar.sarkiciSil(pozisyon-1);
        
    }
    public static void sarkiciAra(){
        System.out.print("Aramak istediğiniz şarkıcının ismini giriniz : ");
        String isim = scan.nextLine();
        sarkicilar.sarkiciAra(isim);
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Şarkıcı uygulamasına hoşgeldiniz.");
        islemleriBastir();
        boolean cikis = true;
        int islem;
        while(cikis){
            System.out.print("Bir işlem seçiniz :");
            islem = scan.nextInt();
            scan.nextLine();
            switch(islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkicilarigoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis = false;
                    System.out.println("Uygulamadan çıkılıyor.");
                    break;
                default:
                    System.out.println("Yanlış seçim tekrar deneyiniz.");
                    break;
            }
        }
    }
    
}
