package linkedlistornek2;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author gkand
 */
public class LinkedListOrnek2 {
    
    public static void siraliEkle(LinkedList<String> liste, String yeni){
        ListIterator<String> iterator = (ListIterator<String>) liste.iterator();
        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);
            if(karsilastir ==0){
                System.out.println("Bu kelimeniz zaten listede var.");
                return;
            }else if(karsilastir <0){
                System.out.println("Yeni değer iterator.next'ten daha büyüktür");
            }else if(karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return;
            }
        }
        iterator.add(yeni);
    }
        
    public static void listeyiYazdir(LinkedList<String> liste){
        /*for(String s : liste){
            System.out.println(s);
        }*/
        ListIterator<String> iterator = (ListIterator<String>) liste.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
    }
    public static void main(String[] args) {
        
        LinkedList<String> gidilecekYerler = new LinkedList<String>();
        /*gidilecekYerler.add("Market");
        gidilecekYerler.add("Postane");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("Spor Salonu");
        gidilecekYerler.add("Ev");
        
        listeyiYazdır(gidilecekYerler);
        
        System.out.println("-----------------");
        gidilecekYerler.add(4,"Alışveriş Merkezi");
        listeyiYazdır(gidilecekYerler);
        
        System.out.println("-------------");
        gidilecekYerler.remove(3);
        listeyiYazdır(gidilecekYerler);*/
        siraliEkle(gidilecekYerler,"Postane");
        siraliEkle(gidilecekYerler, "Market");
        siraliEkle(gidilecekYerler, "Kütüphane");
        siraliEkle(gidilecekYerler, "Adana");
        siraliEkle(gidilecekYerler, "Zonguladk");
        listeyiYazdir(gidilecekYerler);
        
        
    }
    
}
