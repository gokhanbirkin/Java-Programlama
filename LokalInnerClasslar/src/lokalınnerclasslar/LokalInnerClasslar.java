package lokalınnerclasslar;

/**
 *
 * @author gkand
 */
public class LokalInnerClasslar {

    
    public static void main(String[] args) {
        
        class Alan{
            public void daireAlan(int yaricap){
                System.out.println("Dairenin alanı : "+(yaricap*yaricap*Math.PI));
            }
        }
        Alan alan = new Alan();
        alan.daireAlan(5);
        Alan alan2 = new Alan();
        Alan alan3 = new Alan();
        
        
    }
    /*public static void deneme(){
            Alan alan = new Alan();
        }*/
    
}
