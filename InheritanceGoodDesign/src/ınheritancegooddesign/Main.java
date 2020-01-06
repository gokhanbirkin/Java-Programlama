
package ınheritancegooddesign;

/**
 *
 * @author gkand
 */
public class Main {

    
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(new OracleProductDao("Oracle String")); //Database oluşturuduk
        productManager.add(new Product(2,"Çikolata",5)); // Oluşturduğumuz database'e ürün ekledik
        ProductManager productManager2 = new ProductManager(new MysqlProductDao("Mysql String"));
        productManager2.add(new Product(2,"Çikolata",5));
        
    }
    
}
