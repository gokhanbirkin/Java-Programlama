
package staticanahtarkelimesi;

/**
 *
 * @author gkand
 */
public class Seyirci {
    private String isim;
    private static int seyirciSayisi = 0;

    public static int getSeyirciSayisi() {
        return seyirciSayisi;
    }
 
    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
        
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    
    
    public void oyunSeyret(){
        System.out.println(isim+" oyun seyrediyor.");
                
    }
}
