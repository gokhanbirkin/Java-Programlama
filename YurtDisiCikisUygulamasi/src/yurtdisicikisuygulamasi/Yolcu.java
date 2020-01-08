
package yurtdisicikisuygulamasi;

import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class Yolcu implements YurtDisiKurallari {
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yatıdığınız harç bedeli : ");
        this.harc = scan.nextInt();
        scan.nextLine();
        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu ?(evet,hayır)");
        String cevap = scan.nextLine();
        if(cevap.equalsIgnoreCase("evet")){
            siyasiYasak = true;
        }else{
            siyasiYasak = false;
        }
        System.out.print("Vizeniz bulunuyor mu ? (evet,hayır)");
        String cevap2 = scan.nextLine();
        if(cevap2.equalsIgnoreCase("evet")){
            vizeDurumu = true;
        }else{
            vizeDurumu = false;
        }
    }
    
    @Override
    public boolean yurtDisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırım. (15TL)");
            return false;
        }else{
            System.out.println("Yurtdışı harcı işlemi tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak==true){
            System.out.println("Siyasi yasağınız bulunuyor.Yurtdışına çıkamazsınız.");
            return false;
        }else{
            System.out.println("Siyasi yasağınız bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu){
            System.out.println("Vize işleminiz tamamdır.");
            return true;
        }else{
            System.out.println("Vizeniz bulunmamaktadır.");
            return false;
        }
    }
    
}
