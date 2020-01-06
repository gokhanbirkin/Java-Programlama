
package ınheritancebaddesign;

/**
 *
 * @author gkand
 */
public class Main2 {
    public static void main(String[] args){
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,"Su",2) ,2);
    }
}
