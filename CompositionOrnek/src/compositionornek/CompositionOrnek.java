
package compositionornek;

public class CompositionOrnek {


    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("N65VZ", "Asus", "15.3", resolution);
        Kasa kasa = new Kasa("Shadow Blade", "Asus", "Temperli Cam");
        Anakart anakart = new Anakart("v201","Asus",10,"Windows 10");
        Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
        
        bilgisayar.getKasa().bilgisayariAc();
        bilgisayar.getAnakart().isletimSistemiYukle("Linux");
        bilgisayar.getMonitor().monitoruKapa();
        System.out.println("Boy : "+bilgisayar.getMonitor().getResolution().getBoy());
        System.out.println("En  : "+bilgisayar.getMonitor().getResolution().getEn());
        
    }
    
}
