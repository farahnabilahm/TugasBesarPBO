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
import model.Pasien;
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
        main.setVisible(true);
    }
    
    public void addDokterToTable(JTable table, ArrayList<Dokter> array){
        String[] columnDokter = {"NAMA","JENIS KELAMIN","ALAMAT","SPESIALIS","NIP"};
        DefaultTableModel tb = new DefaultTableModel(columnDokter, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        for (Dokter d : array)
        {
            String[] data = {d.getNama(), d.getjenisKelamin(), d.getAlamat(), d.getSpesialis(), ""+d.getNip()};
            tb.addRow(data);
        }
        table.setModel(tb);
    }
    
    public void addPasienToTable(JTable table, ArrayList<PasienInap> array){
        String[] columnPasien = {"NAMA","JENIS KELAMIN","ALAMAT","NO REGISTRASI","NIP DOKTER","DIAGNOSA"};
        DefaultTableModel tb = new DefaultTableModel(columnPasien, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        for (PasienInap p : array){
            String[] data = {p.getPasien().getNama(), ""+p.getPasien(), p.getPasien().getjenisKelamin(), p.getPasien().getAlamat(), ""+p.getPasien().getNoRegistrasi(), p.getDokter().getNama(), p.getDiagnosa().get(0).toString()};
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
        
        //button simpan dokter di klik
        if (source.equals(main.getBtnSimpanDokter()))
        {
            ArrayList<Dokter> d = new ArrayList<>();
            d.add(new Dokter(main.getNamaDokterField().getText(), main.getJKDokterField().getText(), main.getAlamatDokterField().getText(), main.getSpesialisField().getText(), main.getNIPField().getText()) );
            if (app.insertDokter(d)){
                main.showMessage("Insert Berhasil !!");
            }
            else{
                main.showMessage("Insert GAGAL!", "ERROR INSERT", JOptionPane.ERROR_MESSAGE);
            }
        }
        //button simpan ruangan di klik
        if (source.equals(main.getBtnSimpanRuangan())){
            ArrayList<Ruangan> r = new ArrayList<>();
            r.add(new Ruangan(Integer.parseInt(main.getNoRuanganField().getText())));
            if (app.insertRuangan(r)){
                main.showMessage("Insert Berhasil !!");
            }
            else{
                main.showMessage("Insert GAGAL!", "ERROR INSERT", JOptionPane.ERROR_MESSAGE);
            }
        }
        //button simpan pasien di klik
        /*if(source.equals(main.getBtnSimpanPasien())){
            ArrayList<PasienInap> p = new ArrayList<>();
            p.add(new PasienInap(new Pasien(main.getNamaPasienField().getText(), main.getJKPasienField().getText(), main.getAlamatPasienField().getText(), Integer.parseInt(main.getNoRegField().getText())), new Dokter(main.getNamaDokterField().getText(), main.getJKDokterField().getText(), main.getAlamatDokterField().getText(), main.getSpesialisField().getText(), main.getNIPField().getText())));
            if (app.insertPasien(p)){
                main.showMessage("Insert Berhasil !!");
            }
            else{
                main.showMessage("Insert GAGAL!", "ERROR INSERT", JOptionPane.ERROR_MESSAGE);
            }
        }*/
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
