
package idmanprogrami;


public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    public void hareketYap(String hareketTuru, int sayi){
        if(hareketTuru.equalsIgnoreCase("Burpee")){
            burpeeYap(sayi);
        }
        else if(hareketTuru.equalsIgnoreCase("Pushup")){
            pushupYap(sayi);
        }
        else if(hareketTuru.equalsIgnoreCase("Situp")){
            situpYap(sayi);
        }
        else if(hareketTuru.equalsIgnoreCase("Squat")){
            squatYap(sayi);
        }
        else{
            System.out.println("Geçersiz hareket");
        }
        
    }
    
    public void burpeeYap(int sayi){
        if(burpee_sayisi==0){
            System.out.println("Yapacak burpee kalmadı..");
        }
        if(burpee_sayisi-sayi<0){
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler");
            burpee_sayisi = 0;   
        }else{
            burpee_sayisi -=sayi;
            System.out.println("Kalan burpee sayisi : "+burpee_sayisi);
        }
    }
    
    public void pushupYap(int sayi){
        if(pushup_sayisi==0){
            System.out.println("Yapacak pushup kalmadı..");
        }
        else if(pushup_sayisi-sayi<0){
            System.out.println("Hedeflediğin pushup sayısını geçtin. Tebrikler");
            pushup_sayisi = 0;   
        }else{
            pushup_sayisi -=sayi;
            System.out.println("Kalan pushup sayisi : "+pushup_sayisi);
        }
    }
    
    public void situpYap(int sayi){
        if(situp_sayisi==0){
            System.out.println("Yapacak situp kalmadı..");
        }
        else if(situp_sayisi-sayi<0){
            System.out.println("Hedeflediğin situp sayısını geçtin. Tebrikler");
            situp_sayisi = 0;   
        }else{
            situp_sayisi -=sayi;
            System.out.println("Kalan situp sayisi : "+situp_sayisi);
        }
    }
    
    public void squatYap(int sayi){
        if(squat_sayisi==0){
            System.out.println("Yapacak squat kalmadı..");
        }
        else if(squat_sayisi-sayi<0){
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler");
            squat_sayisi = 0;   
        }else{
            squat_sayisi -=sayi;
            System.out.println("Kalan squat sayisi : "+squat_sayisi);
        }
    }
    
    public boolean IdmanBittiMi(){
        return (burpee_sayisi==0)&&(pushup_sayisi==0)&&(situp_sayisi==0)
                &&(squat_sayisi==0);
    }
}
