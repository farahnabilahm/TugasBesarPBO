/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Dell Inspiron 14
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    private Connection con;
    private Statement stat;
    
    public void connect(){
        try {
            con = DriverManager.getConnection("jdbs:msql://", "root", "");
            stat = con.createStatement();
            System.out.println("Berhasil Connect11");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void disconnect(){
        try {
            stat.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //insert update delete
    public boolean manipulation(String query){
        try {
            if(stat.executeUpdate(query)>0){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //select 
    public ResultSet getData(String query){
        try {
            return stat.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}   
