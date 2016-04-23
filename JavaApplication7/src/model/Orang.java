/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public abstract class Orang {
	private String nama;
	private String jenisKelamin;
        private String alamat;
	
	public Orang(String nama, String jenisKelamin, String alamat){
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
                this.alamat = alamat;
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getAlamat() {
		return alamat;
	}
	
	public String getjenisKelamin() {
		return jenisKelamin;
	}
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setjenisKelamin(String jenisKelamin){
		this.jenisKelamin = jenisKelamin;
	}
	
	public void setAlamat(String alamat){
		this.alamat = alamat;
	}
}
