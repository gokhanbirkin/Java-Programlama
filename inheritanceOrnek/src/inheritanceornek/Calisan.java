
package inheritanceornek;

public class Calisan {
    private String ad;
    private int maas;
    private String departman;

    public Calisan(String ad, int maas, String departman) {
        this.ad = ad;
        this.maas = maas;
        this.departman = departman;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
    public void calis(){
        System.out.println("Çalışan çalışıyor..");
    }
    
    public void bilgileriGoster(){
        System.out.println("İsim :" +ad);
        System.out.println("Maaş :" +maas);
        System.out.println("Departman : "+departman);
    }
    
    public void departmanDegis(String yeniDepartman){
        System.out.println("Departman değişiyor");
        this.departman = yeniDepartman;
        System.out.println("Yeni departman : "+yeniDepartman);
    }
}
