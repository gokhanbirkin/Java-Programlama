
package ınheritancebaddesign;

/**
 *
 * @author gkand
 */

//Ekleme silme gibi DB işlemleri yapılacak class
public class OracleProductDao {
    private String connectionString;
    
    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public void add(Product product){
        System.out.println("Oracle Database "+product.getName()+" eklendi.");
    }
    
    public void delete(Product product){
        System.out.println("Oracle Database"+product.getName()+" silindi.");
    }
}
