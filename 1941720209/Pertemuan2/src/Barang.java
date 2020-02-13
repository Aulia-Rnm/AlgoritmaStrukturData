/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Barang {
    String namaBarang, jenisBarang, garansi;
    int stok, hargaSatuan;
    
    Barang(String old){
        garansi=old;
        
    }
    Barang(String nm, String jn, int st,int hs){
        namaBarang = nm;
        jenisBarang=jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang(){
        System.out.println("Nama = "+namaBarang);
        System.out.println("Jenis = "+jenisBarang);
        System.out.println("Stok = "+stok);
        System.out.println("Harga Satuan = "+hargaSatuan);
    }
    
    void garansiBarang(){
        System.out.println("Garansi = "+garansi);
    }
    
    void tambahStok(int n){
        stok = stok+n;
    }
    
    void kurangiStok(int n){
        if(stok>0){
            stok = stok-n;
        }
        else{
            System.out.println("Stok habis");
        }
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}