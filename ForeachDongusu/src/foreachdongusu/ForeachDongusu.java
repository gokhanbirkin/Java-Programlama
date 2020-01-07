
package foreachdongusu;

/**
 *
 * @author gkand
 */
public class ForeachDongusu {

    
    public static void main(String[] args) {
        String[] array = {"Elma","Armut","Çilek","Kiraz"};
        int[] array2 = {1,2,3,4,5,6,7,8};
        Deneme[] array3 = {new Deneme("Gökhan"),new Deneme("Fatih"),new Deneme("Kaan")};
        
        for(String a : array){
            System.out.println(a);
        }
        for(int b : array2){
            System.out.print(b+"\t");
        }
        System.out.println("");
        for(Deneme c : array3){
           c.yaz();
        }
    }
    
}
