package hashmaplinkedhashmaptreemap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author gkand
 */
public class HashMapLinkedHashMapTreeMap {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        System.out.println("-------HashMap-------"); 
        mapYazdir(hashMap);
        System.out.println("-------linkedHashMap-------");
        mapYazdir(linkedHashMap);
        System.out.println("-------treeMap-------");
        mapYazdir(treeMap);
    }
    
    public static void mapYazdir(Map<Integer,String> map){
        map.put(1, "Java");
        map.put(5, "Php");
        map.put(7, "Python");
        map.put(2, "C");
        map.put(4, "Javascript");
        
        /*for(Map.Entry<Integer,String> temp : map.entrySet()){
            System.out.println("Key : "+temp.getKey()+" Değeri : "+temp.getValue());
        }
        System.out.println("______________________________");*/
        //System.out.println(map.keySet());
        /*for(Integer temp : map.keySet()){
            System.out.println("Key : "+temp+" Değeri : "+map.get(temp));
        }*/
        
        Collection<String> values = map.values();
        for(String temp:values){
            System.out.println(temp);
        }
    }
    
}
