package staticanahtarkelimesi;

/**
 *
 * @author gkand
 */
public class StaticAnahtarKelimesi {

    
    public static void main(String[] args) {
        Seyirci seyirci1 = new Seyirci("Gökhan");
        Seyirci seyirci2 = new Seyirci("Mahmut");
        seyirci1.oyunSeyret();
        /*System.out.println("Seyirci sayici : "+Seyirci.seyirciSayisi);
        System.out.println("Seyirci sayici : "+seyirci2.seyirciSayisi);
        System.out.println("Seyirci sayici : "+seyirci1.seyirciSayisi);*/
        System.out.println("Seyirci sayici : "+Seyirci.getSeyirciSayisi());
        //selamla();  //Oluşan bir static metodu olan mainden static olmayan bir metod çağıralamaz
        System.out.println(Math.PI);
    }
    
    public void selamla(){
        System.out.println("Selamla");
    }
}
