/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author aldebaranbn
 */
import java.util.ArrayList;
public class Ruangan {
private ArrayList<PasienInap> pasienInap = new ArrayList<>();
private int noKamar;
private boolean status;
	
    /*public Ruangan(){
	//status = true;
        daftarPasien = new PasienInap[10];
    }*/
    public Ruangan(int noKamar){
        this.noKamar = noKamar;
    }   

    public ArrayList<PasienInap> getPasienInap() {
        return pasienInap;
    }
    
    
	
    public void tambahPasienInap(Pasien p, Dokter d){
        pasienInap.add(new PasienInap(p,d));
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
