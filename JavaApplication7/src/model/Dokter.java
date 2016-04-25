/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Dell Inspiron 14
 */
public class Dokter extends Orang implements Serializable{
	private String spesialis;
	private String nip;
        
        public Dokter (String nama, String jenisKelamin, String alamat, String spesialis, String nip){
            super(nama, jenisKelamin, alamat);
            this.spesialis = spesialis;
            this.nip = nip;
        }
        
        public void setSpesialis(String spesialis){
		this.spesialis = spesialis;
	}
	
	public void setNip(String nip){
		this.nip = nip;
	}
	
	public String getSpesialis(){
		return spesialis;
	}
	
	public String getNip(){
		return nip;
	}
}
