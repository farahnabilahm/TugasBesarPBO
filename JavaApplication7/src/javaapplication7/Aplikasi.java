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
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Aplikasi {
	private ArrayList<Dokter> dokter = new ArrayList<>();
	private ArrayList<PasienInap> pasienInap = new ArrayList<>();
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
	
	public void addPasien(PasienInap p){
		if (nPasien < maxPasien){
			pasienInap.add(p);
			nPasien++;
		}
		else{
			System.out.println("Pasien sudah penuh");
		}
	}
	
	public PasienInap getPasien(int noReg){
		return pasienInap.get(noReg);
 	}
	
	public void deletePasien(int noReg){
		boolean found = false;
		for(int i= 0; i<nPasien; i++){
			if (pasienInap.get(i).getPasien().getNoRegistrasi() == noReg){
				found = true;
				pasienInap.remove(noReg);
				nPasien--;
				break;
			}
		}
	}
	
	public PasienInap searchPasien(int noReg){
		PasienInap a = null;
		for (PasienInap x : pasienInap){
                    if(x.getPasien().getNoRegistrasi() == noReg);
                        a = x;
		}
                return a;
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
        
        public Dokter searchDokter(int nip){
                Dokter t = null;
		for (Dokter x : dokter){
                    if(x.getNip() == nip);
                        t = x;
		}
                return t;
	}
        
        
	public void mainMenu(){
            Scanner s = new Scanner(System.in);
		System.out.println("Sistem Informasi Data Pasien Inap di Rumah Sakit");
		System.out.println("================================================");
		System.out.println("Daftar Menu");
		System.out.println("1. Menambah Dokter ");
		System.out.println("2. Menambah Pasien Inap");
		System.out.println("3. Menghapus Dokter");
		System.out.println("4. Menghapus Pasien Inap");
		System.out.println("5. Mencari Dokter");
		System.out.println("6. Mencari Pasien");
                System.out.println("7. Menampilkan Daftar Dokter");
                System.out.println("8. Menampilkan Daftar Pasien Inap");
		System.out.println("\n");
		System.out.println("Masukan Pilihan Anda : ");
			int n = new Scanner(System.in).nextInt();
		switch(n){
			case 1:
                        System.out.println("Menambahkan Dokter");
			System.out.println(" Nama : "); String namad = s.next();
                        System.out.println(" Umur : "); int umurd = s.nextInt();
                        System.out.println(" Jenis Kelamin : "); String jkd = s.next();
                        System.out.println(" Alamat : "); String alamatd = s.next();
                        System.out.println(" Bidang Spesialis : "); String spesialisd = s.next();
                        System.out.println(" NIP : "); int nipd = s.nextInt();
			Dokter d = new Dokter(namad ,umurd, jkd, alamatd, spesialisd, nipd);
                        addDokter(d);
                        mainMenu();
                            break;
			case 2:
                            
                            Ruangan r = new Ruangan();
                            String nama = null;
                            int nip = 0;
                            String alamat = null;
                            String jk = null;
                            int noReg = 0;
                            String jp = null;
                            String di = null;
                            String namadok = null;
                            System.out.println("Menambahkan Pasien Inap");
                            System.out.println(" Nama : "); nama = s.next();
                            //r.getPasienInapByIndex().setPasien(PasienInap);
                            System.out.println(" Umur : "); nip = s.nextInt();
                            System.out.println(" Alamat : "); alamat = s.next();
                            System.out.println(" Jenis Kelamin : "); jk = s.next();
                            System.out.println(" No Registrasi : "); noReg = s.nextInt();
                            System.out.println(" Jenis Penyakit : "); jp = s.next();
                            System.out.println(" Diagnosa Penyakit : "); di = s.next();
                            System.out.println(" Nama Dokter Pasien : "); namadok = s.next();
                            PasienInap p = new PasienInap();
                            addPasien(p);
                            mainMenu();
                            break;
			case 3:
                            System.out.println("Masukkan NIP Dokter : "); int nipDel = s.nextInt();
                            deleteDokter(nipDel);
                            mainMenu();
                            break;
			case 4:
                            System.out.println("Masukkan NoReg Pasien : "); int noRegDel = s.nextInt();
                            deletePasien(noRegDel);
                            mainMenu();
                            break;
			case 5:
                            System.out.println("Masukkan NIP Dokter : "); int nipSrch = s.nextInt();
                            searchDokter(nipSrch);
                            mainMenu();
                            break;
			case 6:
                            System.out.println("Masukkan NoReg Pasien : "); int noRegSrch = s.nextInt();
				searchPasien(noRegSrch);
				mainMenu();
                                break;
                        case 7: 
                            System.out.println("Daftar Dokter : ");
                            System.out.println("\n");
                                for(int i=0; i < nDokter; i++){
                                    System.out.println(" "+(i+1)+". Nama: "+dokter);
                                }
                            mainMenu();
                            break;
                        case 8:
                            System.out.println("Daftar Pasien Inap : ");
                            System.out.println("\n");
                                for(int i=0; i < nPasien; i++){
                                    System.out.println(" "+(i+1)+". Nama: "+pasienInap);
                                }
                            mainMenu();
                            break;
			default:
				System.out.println("Pilihan yang Dimasukkan Salah");
		}
	}
} 