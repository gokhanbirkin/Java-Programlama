/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınheritancegooddesign;

/**
 *
 * @author sgb_3
 */
public class MysqlProductDao extends BaseProductDao{

    public MysqlProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
        System.out.println("Mysql Database "+product.getName()+" ürünü eklendi");
    }
    
    
}
