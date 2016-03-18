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
	int i = 0;
        daftarPasien[i] = new PasienInap(p,d);
        i++;
    }
}
