/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Dell Inspiron 14
 */
public class Dokter extends Orang{
	private String spesialis;
	private int nip;
        
        public Dokter (String nama, int umur, String jenisKelamin, String alamat, String spesialis, int nip){
            super(nama, umur, jenisKelamin, alamat);
            this.spesialis = spesialis;
            this.nip = nip;
        }
        
        public void setSpesialis(String spesialis){
		this.spesialis = spesialis;
	}
	
	public void setNip(int nip){
		this.nip = nip;
	}
	
	public String getSpesialis(){
		return spesialis;
	}
	
	public int getNip(){
		return nip;
	}
}
