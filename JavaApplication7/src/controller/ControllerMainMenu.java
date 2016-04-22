/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import model.Aplikasi;
import view.MainMenu;

/**
 *
 * @author aldebaranbn
 */
public class ControllerMainMenu implements ActionListener, KeyListener{
    Aplikasi app;
    MainMenu main;
    
    public ControllerMainMenu(){
        app = new Aplikasi();
        main = new MainMenu();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }   

    @Override
    public void keyTyped(KeyEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
