/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterfacereallife;

/**
 *
 * @author sgb_3
 */
public class ComplexUserCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {
        if(user.getAge()>=18 && user.getName().startsWith("Gö")){
            return true;
        }
        return false;
    }
}
