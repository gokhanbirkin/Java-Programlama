
package autoboxingandunboxing;

import java.util.ArrayList;

/**
 *
 * @author gkand
 */
public class AutoboxingAndUnboxing {

    
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<String>();
        ArrayList<Integer> arrayListInt = new ArrayList<Integer>();
        ArrayList<Character> arrayListChar = new ArrayList<Character>();
        ArrayList<Boolean> arrayListBool = new ArrayList<Boolean>();
        
        /*for(int i=0; i<10; i++){
            arrayListInt.add(Integer.valueOf(i*4));//Autoboxing
        }
        for(int i=0; i<arrayListInt.size(); i++){
            System.out.println(arrayListInt.get(i).intValue()); //Unboxing
        }*/
        for(int i=0; i<10; i++){ // Java kendisi yapıyor bu autoboxing ve unboxing'i
            arrayListInt.add(i*4);
        }
        for(int i=0; i<arrayListInt.size(); i++){
            System.out.println(arrayListInt.get(i)); 
        }
    }
    
}
