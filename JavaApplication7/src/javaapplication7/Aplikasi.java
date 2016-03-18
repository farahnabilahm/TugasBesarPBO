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
import java.util.Scanner;
public class Aplikasi {
	private Dokter[] daftarDokter;
	private Pasien[] daftarPasien;
	private Ruangan[] daftarRuangan;
	final private int maxDokter = 100;
	private int nDokter = 0;
	final private int maxPasien = 1000;
	private int nPasien = 0;
	
	public void addDokter(Dokter d){
		if (nDokter < maxDokter){
			daftarDokter[nDokter] = d;
			nDokter++;
		}
		else{
			System.out.println("Dokter sudah penuh");
		}
	}
	
	public void addPasien(Pasien p){
		if (nPasien < maxPasien){
			daftarPasien[nPasien] = p;
			nPasien++;
		}
		else{
			System.out.println("Pasien sudah penuh");
		}
	}
	
	public Pasien getPasien(int noReg){
		return daftarPasien[noReg];
 	}
	
	public void deletePasien(Pasien p){
		boolean found = false;
		for(int i= 0; i<nPasien; i++){
			if (daftarPasien[i].getNoRegistrasi() == p.getNoRegistrasi()){
				found = true;
				daftarPasien[i] = daftarPasien[nPasien-1];
				nPasien--;
				break;
			}
		}
	}
	
	public void searchPasien(Pasien p){
		int index = 0;
		for (int i=0; i<nPasien; i++){
			if(daftarPasien[i].getNoRegistrasi() == p.getNoRegistrasi());
				index = i;
		}
	}
	
	public Dokter getDokter(int nip){
		return daftarDokter[nip];
	}
	
	public void deleteDokter(Dokter d){
		boolean found = false;
		for(int i= 0; i<nDokter; i++){
			if (daftarDokter[i].getNip() == d.getNip()){
				found = true;
				daftarDokter[i] = daftarDokter[nDokter-1];
				nDokter--;
				break;
			}
		}
	}
	
	public void searchDokter(Dokter d){
		int index = 0;
		for (int i=0; i<nPasien; i++){
			if(daftarDokter[i].getNip() == d.getNip());
				index = i;
		}
	}
	public void mainMenu(){
		System.out.println("Sistem Informasi Data Pasien Inap di Rumah Sakit");
		System.out.println("================================================");
		System.out.println("Daftar Menu");
		System.out.println("1. Menambah Dokter ");
		System.out.println("2. Menambah Pasien ");
		System.out.println("3. Menghapus Dokter");
		System.out.println("4. Menghapus Pasien");
		System.out.println("5. Mencari Dokter");
		System.out.println("6. Mencari Pasien");
		System.out.println("\n");
		System.out.println("Masukan Pilihan Anda : ");
			int n = new Scanner(System.in).nextInt();
		switch(n){
			case 1:
                            Dokter d = new Dokter();
                            addDokter(d);
                            System.out.println("Masukkan Nama : "+d.getNama());
                            System.out.println("Masukkan Umur : "+d.getUmur());
                            System.out.println("Masukkan Alamat : "+d.getAlamat());
                            System.out.println("Masukkan Jenis Kelamin : "+d.getjenisKelamin());
                            System.out.println("Masukkan NIP : "+d.getNip());
                            System.out.println("Masukkan Bidang Spesialis : "+d.getSpesialis());
                            
                            System.out.println("Nama : "+d.getNama());
                            System.out.println("Umur : "+d.getUmur());
                            System.out.println("Alamat : "+d.getAlamat());
                            System.out.println("Jenis Kelamin : "+d.getjenisKelamin());
                            System.out.println("NIP : "+d.getNip());
                            System.out.println("Bidang Spesialis : "+d.getSpesialis());
                            
                            
                            break;
			case 2:
                            Pasien p = new Pasien();
                            addPasien(p);
                            System.out.println("Masukkan Nama : "+p.getNama());
                            System.out.println("Masukkan Umur : "+p.getUmur());
                            System.out.println("Masukkan Alamat : "+p.getAlamat());
                            System.out.println("Masukkan Jenis Kelamin : "+p.getjenisKelamin());
                            System.out.println("Masukkan No Registrasi : "+p.getNoRegistrasi());
                            System.out.println("Masukkan Jenis Penyakit : "+p.getJenisPenyakit());
                            
                            System.out.println("Nama : "+p.getNama());
                            System.out.println("Umur : "+p.getUmur());
                            System.out.println("Alamat : "+p.getAlamat());
                            System.out.println("Jenis Kelamin : "+p.getjenisKelamin());
                            System.out.println("No Registrasi : "+p.getNoRegistrasi());
                            System.out.println("Jenis Penyakit : "+p.getJenisPenyakit());
                            break;
			case 3:
				deleteDokter(d);
				break;
			case 4:
				deletePasien(p);
				break;
			case 5:
				searchDokter(d);
				break;
			case 6:
				searchPasien(p);
				break;
			default:
				System.out.println("Pilihan yang Dimasukkan Salah");
		}
	}
} 