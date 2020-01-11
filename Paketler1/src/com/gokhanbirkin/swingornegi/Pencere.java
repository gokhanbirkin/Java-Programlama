/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gokhanbirkin.swingornegi;

import javax.swing.*;

/**
 *
 * @author gkand
 */
public class Pencere {
    private JFrame frame;
    public Pencere(){
        frame = new JFrame();
        JButton button = new JButton("Tıkla");
        
        button.setBounds(130, 100, 100, 40);
        frame.add(button);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
