package linkedlistornek1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author gkand
 */
public class LinkedListOrnek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> diller = new ArrayList<String>();
        diller.add("Java");
        diller.add("Php");
        diller.add("C");
        diller.add("Kotlin");
        
        /*for(int i =0; i<diller.size(); i++){
            System.out.println(diller.get(i));
        }*/
        for(String s: diller){
            System.out.println(s);
        }
        System.out.println("-------------------------");
        diller.add(1,"C++"); //1. indexteki değeri aşağı kaydırır ve 1.indexe C++ atar
        for(String s : diller){
            System.out.println(s);
        }
        System.out.println("----------------------");
        System.out.println("Linked List Örneği");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Java");
        linkedList.add("Php");
        linkedList.add("C");
        linkedList.add("Kotlin");
        for(String s : linkedList){
            System.out.println(s);
        }
        linkedList.add(1,"C++"); // Arraylist ile aynı sonuçları verir. Fakat Linkedlist'e ekleme yaparken daha hızlı işlem yapar
        for(String s : linkedList){ // ArrayList'e göre LinkedList daha fazla hafıza kullanır.
            System.out.println(s);
        }
        
    }
    
}
