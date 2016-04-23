/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell Inspiron 14
 */
public class Pasien extends Orang{
	private String jenisPenyakit;
	private int noReg;
        
        public Pasien (String nama, String jenisKelamin, String alamat, int noReg){
            super(nama, jenisKelamin, alamat);
            this.noReg = noReg;
        }
	
	public void setNoRegistrasi(int noReg){
		this.noReg = noReg;
	}
	
	public int getNoRegistrasi(){
		return noReg;
	}
}