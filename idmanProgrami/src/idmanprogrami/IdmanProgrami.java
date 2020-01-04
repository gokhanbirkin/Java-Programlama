
package idmanprogrami;

import java.util.Scanner;

public class IdmanProgrami {

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("İdman Programına Hoşgeldiniz");
        String idmanlar = "Geçerli Hareketler..\n"+
                "Burpee\n"+
                "Situp\n"+
                "Pushup"+
                "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun..");
        System.out.print("Burpee sayisi : ");
        int burpee = scan.nextInt();
        System.out.print("Situp sayisi : ");
        int situp = scan.nextInt();
        System.out.print("Pushup sayisi : ");
        int pushup = scan.nextInt();
        System.out.print("Squat sayisi : ");
        int squat = scan.nextInt();
        scan.nextLine(); //nextIntden sonra alınacak nextLine'da verilen hata için boş bir satır alıyoruz
        
        Idman idman = new Idman(burpee,pushup,situp,squat); // Burada idman programını oluşturuyoruz..
        System.out.println("İdmanınız başlıyor..");
        
        while(!idman.IdmanBittiMi()){
            System.out.print("Yapmak istediğiniz hareket türünü giriniz(Burpee,Situp,Pushup,Squat) : ");
            String tur = scan.nextLine();
            System.out.print(tur+" hareketinden kaç tane yapacaksınız ? :");
            int sayi = scan.nextInt();
            scan.nextLine(); //nextIntden sonra alınacak nextLine'da verilen hata için boş bir satır alıyoruz
            idman.hareketYap(tur, sayi);
            
            
        }
        System.out.println("İdmanınızı başarıyla bitirdiniz..");
        
    }
    
}
