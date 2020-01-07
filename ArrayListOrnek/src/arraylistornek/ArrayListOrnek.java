package arraylistornek;
import java.util.ArrayList;
public class ArrayListOrnek {

    /**
     * @param args the command line arguments
     */
    
    public static void yazdir(ArrayList<String> a){
        for(int i =0; i<a.size(); i++){
            System.out.println(i+1+".ci eleman : "+a.get(i));
        }
    }
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Model");
        arrayList.add("Gripin");
        arrayList.add("Yüzyüzeyken Konuşuruz");
        arrayList.add("Model");
        arrayList.add("Yüzyüzeyken Konuşuruz");
        arrayList.add("Model");
        
        
        System.out.println(arrayList.get(0));
        
        System.out.println("Boyu : "+arrayList.size());
        
        
        //arrayList.remove(1);
        //arrayList.remove("Gripin");
        //System.out.println(arrayList.get(1));
        System.out.println("Modelin ilk yeri : "+arrayList.indexOf("Model")); //ilk gördüğü yerde durur.
        System.out.println("Modelin son yeri : "+arrayList.lastIndexOf("Model"));
        System.out.println("Tarkan var mı ? "+ arrayList.indexOf("Tarkan"));
        arrayList.set(4, "Tarkan");
        
        
        yazdir(arrayList);
    }
    
}
