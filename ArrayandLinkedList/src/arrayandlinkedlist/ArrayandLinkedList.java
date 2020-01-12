/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayandlinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sgb_3
 */
public class ArrayandLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList", arrayList);
        zamanHesapla2("0. indexe ekleme LinkedList", linkedList);
        zamanHesapla2("0. indexe ekleme ArrayList", arrayList);
        
       
        
    }
    public static void zamanHesapla(String veriTipi, List<Integer> list){
     //Listin sonuna değer ekleme
     long baslangis;
     long bitis;
     baslangis =System.currentTimeMillis();
     for(int i=0; i<1000000; i++){
         list.add(i);
     }
     bitis = System.currentTimeMillis();
     
        System.out.println(veriTipi+" eklenme süresi : "+(bitis-baslangis)+"ms");
    }
    public static void zamanHesapla2(String veriTipi, List<Integer> list){
     //Listin sonuna değer ekleme
     long baslangis;
     long bitis;
     baslangis =System.currentTimeMillis();
     for(int i=0; i<100000; i++){
         list.add(0,i);
     }
     bitis = System.currentTimeMillis();
     
        System.out.println(veriTipi+" eklenme süresi : "+(bitis-baslangis)+"ms");
    }
    
}
