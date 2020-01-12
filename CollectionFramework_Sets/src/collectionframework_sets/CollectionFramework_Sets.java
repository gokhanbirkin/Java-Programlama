/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionframework_sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author sgb_3
 */
public class CollectionFramework_Sets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Set<String> s;
        HashSet<String> hs; //Sıralı bir şekilde depolanmıyorlar. (Time Complexity : O(1))
        LinkedHashSet<String> lhs; //Elemanlar ekleme sırasına göre depolanır (Time Complexity : O(1))
        TreeSet<String> ts; // Elemanlar sıralı bir şekilde depolanıyorlar. (Time Complexity : log(n))
        */
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new LinkedHashSet<String>();
        Set<String> s3 = new TreeSet<String>();
        
        //Aynı elemandan bir daha eklenemez 
        
        s1.add("Java");
        s1.add("Python");
        s1.add("C++");
        s1.add("Javascript");
        s1.add("PHP");
        
        s2.add("Java");
        s2.add("Python");
        s2.add("C++");
        s2.add("Javascript");
        s2.add("PHP");
        
        s3.add("Java");
        s3.add("Python");
        s3.add("C++");
        s3.add("Javascript");
        s3.add("PHP");
        /*
        System.out.println("---------Hashset----------");
        for(String temp : s1){
            System.out.println(temp); // Rasgele yazar
        }
        System.out.println("---------LinkedHashset----------");
        for(String temp : s2){
            System.out.println(temp); //Eklenme sırasına göre yazar
        }
        System.out.println("---------TreeSet----------");

        for(String temp : s3){
            System.out.println(temp); // Alfabetik sıraya göre yazar
        }
        */
        /*
        // Tüm setlerde ortak. set class'ının özellikleri
        System.out.println(s1.contains("Java")); // true
        System.out.println(s1.contains("Go")); //false
        System.out.println(s1.isEmpty()); //false
        System.out.println(s1.remove("Java")); //Javayı siler
         */
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        
        set1.add("Java");
        set1.add("PHP");
        set1.add("Javascript");
        set2.add("Java");
        set2.add("Go");
        set2.add("Css");
        
        /*
        Set<String> fark = new HashSet<String>(set2);
        
        System.out.println(fark.removeAll(set1)); // True
        System.out.println(fark); //[Css, Go] 
        */
        
        Set<String> kesisim = new HashSet<String>(set2);
        System.out.println(kesisim);// [Java,Css,Go]
        System.out.println(kesisim.retainAll(set1));// true
        
    }
    
}
