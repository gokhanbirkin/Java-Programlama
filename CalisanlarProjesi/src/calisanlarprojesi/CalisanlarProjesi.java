
package calisanlarprojesi;

import java.util.Scanner;


public class CalisanlarProjesi {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "İşlemler...\n"+
                "1. Yazılımcı işlemleri\n"+
                "2. Yönetici işlmeleri\n"+
                "Çıkış işin q giriniz..\n"+"---------------------";
        System.out.println(islemler);
        while(true){
            System.out.print("İşlem seçiniz : ");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Süleyman Gökhan","Birkin",1,"Java,C");
                String yazilimciIslem = "Yazılımcı işlemleri...\n"+
                        "1.Format at\n"+
                        "2. Bilgileri Göster\n"+
                        "Çıkış için q giriniz...";
                System.out.println(yazilimciIslem);
                while(true){
                    System.out.print("İşlemi seçiniz : ");
                    String yIslem = scan.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor");
                        break;
                    }else if(yIslem.equals("1")){
                        System.out.print("İşletim sistemini giriniz : ");
                        String isletimSistemi = scan.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }else{
                        System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
                    }
                }
            }else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Mahmut","Kara",10,23);
                String yoneticiIslemler = "Yönetici işlemleri..\n"+
                        "1. Zam yap\n"+
                        "2. Bilgileri göster\n"+
                        "Çıkış için q giriniz...\n";
                System.out.println(yoneticiIslemler);
                while(true){
                    System.out.print("İşlemi seçiniz : ");
                    String yoIslem = scan.nextLine();
                    if(yoIslem.equals("q")){
                        
                    }else if(yoIslem.equals("1")){
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zam = scan.nextInt();
                        scan.nextLine();
                        yonetici.zamYap(zam);
                    }else if(yoIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }else{
                        System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
                    }
                }

            }else{
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz..");
            }
        }
        
    }
    
}
