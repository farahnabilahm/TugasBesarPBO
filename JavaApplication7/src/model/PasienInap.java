/*\]+-
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aldebaranbn
 */
public class PasienInap implements Serializable{
    private Pasien pasien;
    private Dokter dokter;
    private ArrayList<String> diagnosa = new ArrayList<>();
    private int nDiagnosa;
	
    public PasienInap(Pasien p, Dokter d){
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
	diagnosa.remove(index);
    }

    public ArrayList getDiagnosa(){
        return diagnosa;
    }
}