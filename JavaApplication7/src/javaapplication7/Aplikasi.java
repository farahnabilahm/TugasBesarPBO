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
	
	public Pasien searchPasien(int noReg){
		Pasien a = null;
		for (Pasien x : pasien){
                    if(x.getNoRegistrasi() == noReg);
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
		System.out.println("2. Menambah Pasien ");
		System.out.println("3. Menghapus Dokter");
		System.out.println("4. Menghapus Pasien");
		System.out.println("5. Mencari Dokter");
		System.out.println("6. Mencari Pasien");
                System.out.println("7. Menampilkan Daftar Dokter");
                System.out.println("8. Menampilkan Daftar Pasien");
		System.out.println("\n");
		System.out.println("Masukan Pilihan Anda : ");
			int n = new Scanner(System.in).nextInt();
		switch(n){
			case 1:
                        System.out.println("Menambahkan Dokter");
			System.out.println(" Nama : "); String namad = s.next();
                        System.out.println(" Umur : "); int umurd = s.nextInt();
                        System.out.println(" Alamat : "); String alamatd = s.next();
                        System.out.println(" Jenis Kelamin : "); String jkd = s.next();
                        System.out.println(" NIP : "); int nipd = s.nextInt();
                        System.out.println(" Bidang Spesialis : "); String spesialisd = s.next();
			Dokter d = new Dokter();
                        addDokter(d);
                            break;
			case 2:
                            String nama = null;
                            int nip = 0;
                            String alamat = null;
                            String jk = null;
                            int noReg = 0;
                            String jp = null;
                            System.out.println("Menambahkan Pasien Inap");
                            System.out.println(" Nama : "); nama = s.next();
                            System.out.println(" Umur : "); nip = s.nextInt();
                            System.out.println(" Alamat : "); alamat = s.next();
                            System.out.println(" Jenis Kelamin : "); jk = s.next();
                            System.out.println(" No Registrasi : "); noReg = s.nextInt();
                            System.out.println(" Jenis Penyakit : "); jp = s.next();
                            Pasien p = new Pasien();
                            addPasien(p);
                            break;
			case 3:
                            System.out.println("Masukkan NIP Dokter : "); int nipDel = s.nextInt();
                            deleteDokter(nipDel);
				break;
			case 4:
                            System.out.println("Masukkan NoReg Pasien : "); int noRegDel = s.nextInt();
                            deletePasien(noRegDel);
				break;
			case 5:
                            System.out.println("Masukkan NIP Dokter : "); int nipSrch = s.nextInt();
                            searchDokter(nipSrch);
				break;
			case 6:
                            System.out.println("Masukkan NoReg Pasien : "); int noRegSrch = s.nextInt();
				searchPasien(noRegSrch);
				break;
                        case 7: 
                            
                            break;
                        case 8:
                            
                            break;
			default:
				System.out.println("Pilihan yang Dimasukkan Salah");
		}
	}
} 