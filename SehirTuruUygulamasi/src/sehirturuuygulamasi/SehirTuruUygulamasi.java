
package sehirturuuygulamasi;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author gkand
 */
public class SehirTuruUygulamasi {

    public static void islemleriBastir(){
        System.out.println("0 - İşlemleri Görüntüle..");
        System.out.println("1 - Bir sonraki şehre git..");
        System.out.println("2 - Bir önceki şehre git..");
        System.out.println("3 - Çıkış yap..");
    }
    
    public static void sehirleriTurla(LinkedList<String> sehirler){
        ListIterator<String> iterator = (ListIterator<String>) sehirler.iterator();
        
        int islem;
        islemleriBastir();
        Scanner scan = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor."); //Linked list boş
        }
        boolean cikis = true;
        boolean ileri = true;
        while(cikis){
            islem=scan.nextInt();
            switch(islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    
                    if(iterator.hasNext()){
                        System.out.println("Şehre gidiliyor. Gidilen şehir : "+iterator.next());
                    }else{
                        System.out.println("İlerde şehir kalmadı..");
                    }
                    
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Şehre gidiliyor. Gidilen şehir : "+iterator.previous());
                    }else{
                        System.out.println("Geride şehir kalmadı..");
                        ileri = true;
                    }
                    break;
                case 3:
                    cikis = false;
                    System.out.println("Uygulamadan çıkılıyor..");
                    break;
                default : 
                    System.out.println("Yanlış bir seçim yapıldı..");
                    break;
                
            }
        }
    }
    
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        System.out.println("Şehir turu uygulamasına hoşgeldiniz..");
        sehirler.add("Kayseri");
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirleriTurla(sehirler);
        
            
    }
    
}
