/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class CD_UUL {
    String judul,distri;
    int kode,stock,broke;
    public CD_UUL(){
        
    }
    void tampil(){
        System.out.println("------------------------------");
        System.out.println("Kode : "+kode);
        System.out.println("Judul : "+judul);
        System.out.println("Distributor: "+distri);
        System.out.println("Jumlah Stock: "+stock);
        System.out.println("Jumlah Rusak: "+broke);
    }
}
