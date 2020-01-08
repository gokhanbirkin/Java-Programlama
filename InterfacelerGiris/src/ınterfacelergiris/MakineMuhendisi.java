
package ınterfacelergiris;

/**
 *
 * @author gkand
 */
public class MakineMuhendisi implements IMuhendis, ICalisma{

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi Çalışıyor..");
    }

    private boolean askerlik;
    private boolean adliSicil;

    public MakineMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }
    
    
    @Override
    public void askerlikDurumuSorgula() {
        if(askerlik){
            System.out.println("Askerliğimi yaptım.");
        }else{
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalamam "+ derece;
    }

    @Override
    public void adliSicilSorgula() {
        if(adliSicil){
            System.out.println("Adli sicil kaydım bulunmaktadır.");
        }else{
            System.out.println("Adli sicil kaydım yoktur.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        if(array.length==0){
            System.out.println("Herhangi bir iş tecrübem bulunmuyor..");
        }else{
            System.out.println("Makine mühendisi olarak şu şirketlerde çalıştım");
            for(String s : array){
                System.out.println(s);
            }
        }
    }
    
    public void referansGetir(String[] array){
        if(array.length==0){
            System.out.println("Herhangi bir referansım bulunmuyor");
        }else{
            System.out.println("Referanslarım : ");
            for(String s : array){
                System.out.println(s);
            }
        }
    }
    
}
