package tryexception1;



/**
 *
 * @author gkand
 */
public class TryException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int[] a = {1,2,3,4,5,6,7};
            System.out.println("a[10]"+a[10]);
            String b = "a12";
            int i = Integer.parseInt(b);
            int x = 5/0; // Unchecked Exception
        }catch(ArithmeticException e){
            System.out.println("Sayı 0 a bölünemez");
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dizi boyutu aşıldı..");
        }
        catch (Exception e) {
            //e.printStackTrace();
            System.err.println("Bir hata oluştu..");
            e.printStackTrace();
        } 
    }
    
}
