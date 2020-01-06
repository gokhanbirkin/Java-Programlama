
package ınheritancegooddesign;

/**
 *
 * @author gkand
 */
public class ProductManager {
    
    private BaseProductDao baseProductDao;

    public ProductManager(BaseProductDao baseProductDao) {
        this.baseProductDao = baseProductDao;
    }
    
    
    public void add(Product product){
        baseProductDao.add(product);
        
        //iş katmanı sınıfı
        
        
        System.out.println("Ürün İş Katmanı İşlemleri");
        System.out.println("Ürün ismi : "+product.getName());
    }
}
