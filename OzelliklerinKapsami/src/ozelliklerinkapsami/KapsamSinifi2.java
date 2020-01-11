
package ozelliklerinkapsami;

/**
 *
 * @author gkand
 */
public class KapsamSinifi2 {
    private int privateInt = 30;
  

    public KapsamSinifi2() {
    }
    public void dahiliSınıfKontrol(){
        DahiliSınıf d = new DahiliSınıf();
        System.out.println("Kontrol ediliyor...");
        System.out.println("A : "+d.a);
    }
    public class DahiliSınıf{
        private int privateInt = 20;
        private int a=3;
        public void onileCarp(){
            int privateInt = 10;
        //int privateDegisken = 10; // Bu durumda en local olan metoddaki değişkenin değerini alır
        for(int i=0; i<6; i++){
            System.out.println(i+" * "+KapsamSinifi2.this.privateInt+" = "+(i*KapsamSinifi2.this.privateInt));
        }
       

        }
    }
    
    
}
