
package yurtdisicikisuygulamasi;

/**
 *
 * @author gkand
 */
public class YurtDisiCikisUygulamasi {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökhçen Havaalanına Hoşgeldiniz....");
        String sartlar = "Yurtdışı Çıkış Kuralları ...\n"
                +"Herhangi bir siyasi yasağınızın olmaması gerekiyor.\n"
                + "15 TL harç bedelini ödemeniz gerekiyor.\n"
                + "Gideceğiniz ülkeye vizenizin olması gerekiyor";
        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekiyor";
        System.out.println("*********************************");
        System.out.println(message);
        System.out.println("*********************************");
        while(true){
            
            System.out.println(sartlar);
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);
            if(!yolcu.yurtDisiHarciKontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            if(!yolcu.siyasiYasakKontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(!yolcu.vizeDurumuKontrol()){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamamdır. Yurtdışına çıkabilirsiniz.");
            break;
        }
    }
    
}
