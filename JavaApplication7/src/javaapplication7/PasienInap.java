/*\]+-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aldebaranbn
 */
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private ArrayList<String> diagnosa = new ArrayList<>();
    //private String[] diagnosa;
    private int nDiagnosa;
    boolean status;
	
    public PasienInap(Pasien p, Dokter d){
	//diagnosa = new String[10];
        this.pasien = p;
        this.dokter = d;
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
            diagnosa.add(d);
            nDiagnosa++;
	}else{
           System.out.println("Diagnosa terlalu banyak!");
        }
    }
    
    public String getDiagnosaByIndex(int index){
        return diagnosa.get(index);
    }
    
    public void deleteDiagnosaByIndex(int index){
        //List list = new ArrayList();
        //list.remove(diagnosa[index]);
		diagnosa.remove(index);
    }
}
