package basitmatvebasitfizproblemleri;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class BasitMatveBasitFizProblemleri {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik ve fizik problemleri programına hoşgeldiniz..");
        String islemler = "İşlemler..\n"
                + "Daire alanı hesaplama için 1\n"
                + "Üçgen çevresi hesaplama için 2\n"
                + "İki vektörün iç çarpımı için 3\n"
                + "Çıkış için q giriniz.";
        while(true){
            System.out.println(islemler);
            System.out.print("İşlemi seçiniz :");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Çıkılıyor..");
                break;
            }else if(islem.equals("1")){
                System.out.println("Yarı çapı giriniz");
                int yaricap = scan.nextInt();
                scan.nextLine();
                Problem.Matematik.daireAlan(yaricap);
            }else if(islem.equals("2")){
                System.out.println("Üçgenin kenarlarını giriniz");
                System.out.print("Kenar 1 :");
                int kenar1 = scan.nextInt();
                System.out.print("Kenar 2 :");
                int kenar2 = scan.nextInt();
                System.out.print("Kenar 3 :");
                int kenar3 = scan.nextInt();
                scan.nextLine();
                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
            }else if(islem.equals("3")){
                Vec vec1 = new Vec("Vektör 1");
                Vec vec2 = new Vec("Vektör 2");
                Problem.Fizik.icCarpim(vec1, vec2);
            }else{
                System.out.println("Geçersiz işlem..");
            }
        }
        //Problem.Matematik problem = new Problem().new Matematik;
        
    }
    
    
    
}
