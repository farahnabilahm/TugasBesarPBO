/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author aldebaranbn
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private String[] diagnosa;
    private int nDiagnosa;
    boolean status;
	
    public PasienInap(Pasien p){
	diagnosa = new String[10];
        this.pasien = p;
    }
	
    public void setDokter(Dokter d){
	this.dokter = d;
    }
    
    public Dokter getDokter(){
        return dokter;
    }
    
    public void setPasien(Pasien p){
        this.pasien = p;
    }
    
    public Pasien getPasien(){
        return pasien;
    }
	
    public void addDiagnosa(String d){
	if(nDiagnosa<10){
            diagnosa[nDiagnosa] = d;
	}else{
           System.out.println("Diagnosa terlalu banyak!");
        }nDiagnosa++;
    }
}