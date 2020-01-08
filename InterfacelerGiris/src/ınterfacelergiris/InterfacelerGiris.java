
package ınterfacelergiris;

/**
 *
 * @author gkand
 */
public class InterfacelerGiris {

    
    public static void main(String[] args) {
        
        /*PcMuhendisi pcMuhendisi = new PcMuhendisi(false, false);
        pcMuhendisi.adliSicilSorgula();
        String[] tecrube = {"İtelligence","Yemeksepeti","Birbilene Sor"};
        pcMuhendisi.isTecrubesi(tecrube);*/
        
        MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true, false);
        String[] tecrube = {};
        String[] referans = {"Mustafa Murat Coçkun", "Serhat Say"};
        makineMuhendisi.askerlikDurumuSorgula();
        makineMuhendisi.adliSicilSorgula();
        makineMuhendisi.isTecrubesi(tecrube);
        makineMuhendisi.referansGetir(referans);
        System.out.println(makineMuhendisi.mezuniyetOrtalamasi(2.5));
        makineMuhendisi.calis();
    }
    
}
