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
public class OracleProductDao extends BaseProductDao{

    public OracleProductDao(String connectionString) {
        super(connectionString);
    }

    @Override
    public void add(Product product) {
         System.out.println("Oracle Database : "+product.getName()+" eklendi");
    }
    
    
}
