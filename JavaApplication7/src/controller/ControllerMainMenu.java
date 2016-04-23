/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Aplikasi;
import model.Dokter;
import model.PasienInap;
import model.Ruangan;
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
        
        main.getBtnSimpanRuangan().addActionListener(this);
        main.getBtnSimpanPasien().addActionListener(this);
        main.getBtnSimpanDokter().addActionListener(this);
    }
    
    public void addRuanganToTable(JTable table, ArrayList<Ruangan> array){
        String[] columnRuangan = {"No Ruangan"};
        DefaultTableModel tb = new DefaultTableModel(columnRuangan, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        for (Ruangan r : array)
        {
            String[] data = {r.getNoKamar()};
            tb.addRow(data);
        }
        table.setModel(tb);
    }
    
    public void addDokterToTable(JTable table, ArrayList<Dokter> array){
        String[] columnDokter = {"NAMA","UMUR","JENIS KELAMIN","ALAMAT","SPESIALIS","NIP"};
        DefaultTableModel tb = new DefaultTableModel(columnDokter, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        for (Dokter d : array)
        {
            String[] data = {d.getNama(), d.getUmur(), d.getjenisKelamin(), d.getAlamat(), d.getSpesialis(), d.getNip()};
            tb.addRow(data);
        }
        table.setModel(tb);
    }
    
    public void addPasienToTable(JTable table, ArrayList<PasienInap> array){
        String[] columnPasien = {"NAMA","UMUR","JENIS KELAMIN","ALAMAT","NO REGISTRASI","NIP DOKTER","DIAGNOSA"};
        DefaultTableModel tb = new DefaultTableModel(columnPasien, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        for (PasienInap p : array){
            String[] data = {p.getPasien().getNama(), p.getPasien().getUmur(), p.getPasien().getjenisKelamin(), p.getPasien().getAlamat(), p.getPasien().getNoRegistrasi(), p.getDokter().getNama(), p.getDiagnosaByIndex(i)};
            tb.addRow(data);
        }
        table.setModel(tb);
    }
    
    public void show(JPanel panel, String cardName)
    {
        CardLayout card = (CardLayout) panel.getLayout();
        card.show(panel, cardName);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        //button simpan ruangan di klik
        if (source.equals(main.getBtnSimpanDokter()))
        {
            Dokter d = new Dokter(main.getNamaDokterField().getText(), main.getUmurDokterField().getText(), main.getJKDokterField().getText(), main.getAlamatDokterField().getText(), main.getSpesialisField().getText(), main.getNIPField().getText());
            if (app.insertDokter(d))
            {
                main.showMessage("Insert Berhasil !!");
            }
            else
            {
                main.showMessage("Insert GAGAL!", "ERROR INSERT", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
