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
public class Ruangan {
    private PasienInap[] daftarPasien;
    private int noKamar;
    private boolean status;
	
    public Ruangan(){
	status = true;
        daftarPasien = new PasienInap[10];
    }
	
    public void tambahPasienInap(Pasien p, Dokter d){
	for(int i=0;i<10;i++){
            if(daftarPasien[i].status){
		daftarPasien[i].setPasien(p);
		daftarPasien[i].setDokter(d);
		status = false;
            }
            break;
	}
    }
}
