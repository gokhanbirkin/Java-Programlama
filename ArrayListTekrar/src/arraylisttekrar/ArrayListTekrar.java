/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttekrar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gkand
 */
public class ArrayListTekrar {


    public static void main(String[] args) {
        
        //ArrayList<String> arrayList = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        
        //Eleman ekleme
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("______________________");
        //indekse göre verileri alma
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        //System.out.println(list.get(4));//Hata verir
        System.out.println("______________________");
        // Ekrana basma foreach
        for(String temp : list){
            System.out.println(temp);
        }
        System.out.println("______________________");
        //Elemanı silme
        list.remove(1);
        list.remove("C++");
        for(String temp : list){
            System.out.println(temp);
        }
        
    }
    
}
