/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aldebaranbn
 */
import java.io.Serializable;
import java.util.ArrayList;
public class Ruangan implements Serializable{
private ArrayList<PasienInap> pasienInap = new ArrayList<>();
private int noKamar;
	
    public Ruangan(int noKamar){
        this.noKamar = noKamar;
    }   

    public int getNoKamar() {
        return noKamar;
    }

    public ArrayList<PasienInap> getPasienInap() {
        return pasienInap;
    }
    
    public void tambahPasienInap(Pasien p, Dokter d, String diag){
        PasienInap pi = new PasienInap(p, d);
        pi.addDiagnosa(diag);
        pasienInap.add(pi);    
    }
    
    public PasienInap getPasienInapByIndex(int index){
        return pasienInap.get(index);
    }
    
    public PasienInap getPasienInapByPasienId(int noReg){
        for(PasienInap p : pasienInap){
            if (p.getPasien().getNoRegistrasi() == noReg){
                return p;
            }
        }
        return null;
    }
        
    public void removePasienInap(int i){
        pasienInap.remove(i);
    }
}