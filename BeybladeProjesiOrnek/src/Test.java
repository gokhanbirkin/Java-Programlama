
import java.util.Scanner;


public class Test {
    public static void main(String[] args){
        System.out.println("Beyblade programına hoş geldiniz.");
        System.out.println("Çıkış için q giriniz");
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beyblade'i üretmek istiyorsunuz ?(dragon,draciel,drayga,dranza)");
            String islem = scan.nextLine();
            if(islem.equalsIgnoreCase("q")){
                System.out.println("Beyblade programından çıkılıyor..");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if(beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade ismi giriniz...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
