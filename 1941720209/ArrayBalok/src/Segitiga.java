/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisi;
    
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[15];
        
    }
    
    public Segitiga(int a, int t, int s){
        alas=a;
        tinggi=t;
        sisi=s;
    }
    
    public int hitungLuas(){
        return alas*tinggi/2;
    }
    
    public int hitungKeliling(){
        return 3*sisi;
    }
}
