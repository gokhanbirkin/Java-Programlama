package anonimınnerclass;

/**
 *
 * @author gkand
 */
public class AnonimInnerClass {

    public static void main(String[] args) {
        
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void dersCalis() {
                System.out.println("Ders çalışılıyor..");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse giriliyor..");
            }
        };
        ogrenci.dersCalis();
        ogrenci.derseGir();
        System.out.println("**********************");
        AOgrenci ogrenciA = new AOgrenci("Gökhan",457) {
            @Override
            void kayitYaptir() {
                System.out.println("Kayıt yapılıyor.."+getIsim()+" NO : "+getNo());
            }
        };
        ogrenciA.kayitYaptir();
        ogrenciA.selamla();
        
        
        
    }
    public interface IOgrenci{
            void dersCalis();
            void derseGir();
    }
    public static abstract class AOgrenci{
        private String isim;
        private int no;

        public AOgrenci(String isim, int no) {
            this.isim = isim;
            this.no = no;
        }
        
        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        
        abstract void kayitYaptir();
        public void selamla(){
            System.out.println("Selam");
        }
    }
}
