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
        
        public Pasien (String nama, int umur, String jenisKelamin, String alamat, String jenisPenyakit, int noReg){
            super(nama, umur, jenisKelamin, alamat);
            this.jenisPenyakit = jenisPenyakit;
            this.noReg = noReg;
        }
	
	public void setJenisPenyakit(String jenisPenyakit){
		this.jenisPenyakit = jenisPenyakit;
	}
	
	public void setNoRegistrasi(int noReg){
		this.noReg = noReg;
	}
	
	public String getJenisPenyakit(){
		return jenisPenyakit;
	}
	
	public int getNoRegistrasi(){
		return noReg;
	}
}