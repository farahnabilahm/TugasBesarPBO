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
import java.util.ArrayList;
import java.util.Scanner;
public class Aplikasi {
	private ArrayList<Dokter> dokter = new ArrayList<>();
	private ArrayList<Pasien> pasien = new ArrayList<>();
	private ArrayList<Ruangan> ruangan = new ArrayList<>();
	final private int maxDokter = 100;
	private int nDokter = 0;
	final private int maxPasien = 1000;
	private int nPasien = 0;
	
	public void addDokter(Dokter d){
		if (nDokter < maxDokter){
			dokter.add(d);
			nDokter++;
		}
		else{
			System.out.println("Dokter sudah penuh");
		}
	}
	
	public void addPasien(Pasien p){
		if (nPasien < maxPasien){
			pasien.add(p);
			nPasien++;
		}
		else{
			System.out.println("Pasien sudah penuh");
		}
	}
	
	public Pasien getPasien(int noReg){
		return pasien.get(noReg);
 	}
	
	public void deletePasien(int noReg){
		boolean found = false;
		for(int i= 0; i<nPasien; i++){
			if (pasien.get(i).getNoRegistrasi() == noReg){
				found = true;
				pasien.remove(noReg);
				nPasien--;
				break;
			}
		}
	}
	
	public void searchPasien(int noReg){
		int index = 0;
		for (int i=0; i<nPasien; i++){
			if(pasien.get(i).getNoRegistrasi() == noReg);
				index = i;
		}
	}
	
	public Dokter getDokter(int nip){
		return dokter.get(nip);
	}
	
	public void deleteDokter(int nip){
		boolean found = false;
		for(int i= 0; i<nDokter; i++){
			if (dokter.get(i).getNip() == nip){
				found = true;
				dokter.remove(nip);
				nDokter--;
				break;
			}
		}
	}
	
	public void searchDokter(int nip){
		int index = 0;
		for (int i=0; i<nPasien; i++){
			if(dokter.get(i).getNip() == nip);
				index = i;
		}
	}
        
        public void viewDokter(Dokter d){
            for(int i =0; i<nDokter;i++){
                System.out.println("Nama : "+d.getNama());
                System.out.println("Umur : "+d.getUmur());
                System.out.println("Alamat : "+d.getAlamat());
                System.out.println("Jenis Kelamin : "+d.getjenisKelamin());
                System.out.println("NIP : "+d.getNip());
                System.out.println("Bidang Spesialis : "+d.getSpesialis());
                System.out.println("==========================================\n\n");
            }
        }
        
        public void viewPasienInap(Pasien p){
            for(int i =0; i<nPasien;i++){
                System.out.println("Nama : "+p.getNama());
                System.out.println("Umur : "+p.getUmur());
                System.out.println("Alamat : "+p.getAlamat());
                System.out.println("Jenis Kelamin : "+p.getjenisKelamin());
                System.out.println("No Registrasi : "+p.getNoRegistrasi());
                System.out.println("Jenis Penyakit : "+p.getJenisPenyakit());
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
                            
                            /**/
                            
                            
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
                            System.out.println("Masukkan Diagnosa : "+p.getDiagnosaByIndex())
                            /**/
                            break;
			case 3:
                            System.out.println("Masukkan Nip Dokter yang akan di Hapus : "+d.getNip());
                            
				deleteDokter(nip);
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