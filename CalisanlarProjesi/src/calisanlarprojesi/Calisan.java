
package calisanlarprojesi;


public class Calisan {
    private String ad;
    private String soyAd;
    private int id;

    public Calisan(String ad, String soyAd, int id) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void bilgileriGoster(){
        System.out.println("Bilgiler gösteriliyor..");
        System.out.println("İsim : "+ad);
        System.out.println("Soy isim : "+soyAd);
        System.out.println("Id : "+id);
        
        
    }
}
