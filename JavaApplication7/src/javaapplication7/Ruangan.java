/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.ArrayList;

/**
 *
 * @author aldebaranbn
 */

public class Ruangan {
    private ArrayList<PasienInap> pasienInap = new ArrayList<>();
    private int noKamar;
    private boolean status;
	
    public Ruangan(){
	status = true;
        daftarPasien = new PasienInap[10];
    }
	
    public void tambahPasienInap(Pasien p, Dokter d){
	int i = 0;
        daftarPasien[i] = new PasienInap(p,d);
        pasienInap.add(p)
        i++;
    }
    
    public PasienInap getPasienInapByIndex(int index){
        return pasienInap.get(index);
    }
    
    public PasienInap getPasienInapByPasienId(int noReg){
        return pasienInap.get(noReg);
    }
    
    public void removePasienInap(){
        
    }
}
