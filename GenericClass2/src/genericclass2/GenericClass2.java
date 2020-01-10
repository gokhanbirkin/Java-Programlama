package genericclass2;

/**
 *
 * @author gkand
 */
public class GenericClass2 {


    public static void main(String[] args) {
       /* Character[] charDizi = {'J','A','V','A'};
        Integer[] intDizi = {1,2,3,4};
        String[] stringDizi = {"Java","Php","C"};
        Ogrenci[] ogrDizi = {new Ogrenci("Gökhan"),new Ogrenci("Mehmet"),new Ogrenci("Mustafa")};
        yazdir(charDizi);
        yazdir(intDizi);
        yazdir(stringDizi);
        yazdir(ogrDizi);*/
       
       Sayisal sayisal1 = new Sayisal(23, 45, 42, 17);
       Sayisal sayisal2 = new Sayisal(27, 44, 43, 13);
       Sayisal birinci = birinci(sayisal1, sayisal2);
       
       System.out.println("Birinci öğrencinin puanı : "+birinci.puanHesapla());
       
       Esitagirlik esitagirlik1 = new Esitagirlik(46, 21, 22, 49);
       Esitagirlik esitagirlik2 = new Esitagirlik(49, 23, 12, 47);
       Esitagirlik birinciE = birinci(esitagirlik1,esitagirlik2);
       
        System.out.println("Birinci eşit ağırlık öğrencisinin puanı : "+birinciE.puanHesapla());
    }
    
    public static <E extends Aday> E birinci(E e1, E e2){
        if(e1.puanHesapla()>e2.puanHesapla()){
            return e1;
        }else{
            return e2;
        }
    }
    
    public static <E> void yazdir(E[] dizi){
        for(E e : dizi){
            System.out.println(e);
        }
    }
    
    
}
