package hashmapmain;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gkand
 */
public class HashMapMain {

    public static void main(String[] args) {
        HashMap<Integer,String>  hashMap = new HashMap<Integer,String>(); //<K,V> K : Key, V : Value
        hashMap.put(1, "Java");
        hashMap.put(6, "Php");
        hashMap.put(7, "C");
        hashMap.put(10, "C++");
        hashMap.put(11, "Php");
        hashMap.put(1, "Javascript"); //Artık 1 keyi Javascripti gösteriyor..
        System.out.println(hashMap);
        
        System.out.println(hashMap.get(1)); // Javascript
        System.out.println(hashMap.containsValue("Php")); //true
        
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println(entry); //1=Javascript 6=Php 7=C 10=C++
        }
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Anahtar : "+entry.getKey()+" Deger : "+entry.getValue());
        }
    }
    
}
