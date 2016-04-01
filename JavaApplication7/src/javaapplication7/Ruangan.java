/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author aldebaranbn
 */
public class Ruangan {
    private PasienInap[] pasien;
    private int noKamar;
    private boolean status;
	
    public Ruangan(){
	status = true;
        pasien = new PasienInap[10];
    }
	
    public void tambahPasienInap(Pasien p, Dokter d){
	int i = 0;
        pasien[i] = new PasienInap(p,d);
        i++;
    }
    
    public void removePasienInap (Pasien p, Dokter d){
	List list = new ArrayList();
        list.remove(pasien(p,d));
    }
}
