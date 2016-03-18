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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dokter d = new Dokter();
		d.setNama("Nabilah");
		d.setUmur(25);
		d.setjenisKelamin("Perempuan");
		d.setAlamat("Jalan Murai No 7 Padang");
		d.setSpesialis("Saraf");
		d.setNip(1301144423);
		
		Pasien p = new Pasien();
		p.setNama("Naufal");
		p.setUmur(23);
		p.setjenisKelamin("Laki-Laki");
		p.setAlamat("Jalan Murai No 7 Padang");
		p.setNoRegistrasi(10000001);
		p.setJenisPenyakit("Kista Pangkreas");
		
		System.out.println("\nData Dokter");
		System.out.println("======================================");
		System.out.println("\nNama \t\t: "+d.getNama());
		System.out.println("Umur \t\t: "+d.getUmur());
		System.out.println("Jenis Kelamin \t: "+d.getjenisKelamin());
		System.out.println("Alamat \t\t: "+d.getAlamat());
		System.out.println("Spesialis \t: "+d.getSpesialis());
		System.out.println("NIP \t\t: "+d.getNip());
		
		System.out.println("\n\nData Pasien");
		System.out.println("======================================");
		System.out.println("\nNama \t\t: "+p.getNama());
		System.out.println("Umur \t\t: "+p.getUmur());
		System.out.println("Jenis Kelamin \t: "+p.getjenisKelamin());
		System.out.println("Alamat \t\t: "+p.getAlamat());
		System.out.println("No Registrasi \t: "+p.getNoRegistrasi());
		System.out.println("Jenis Penyakit \t: "+p.getJenisPenyakit());
	
		System.out.println("\nDaftar Pasien Inap dan Dokter");
		System.out.println("======================================");
		PasienInap pi = new PasienInap(p,d);
		pi.setPasien(p);
		pi.setDokter(d);
		System.out.println("Pasien : "+pi.getPasien().getNama());
		System.out.println("Dokter : "+pi.getDokter().getNama());
                
                pi.addDiagnosa("Demam");
                pi.addDiagnosa("Campak");
                
                Ruangan r = new Ruangan();
                r.tambahPasienInap(p,d);
    }
    
}
