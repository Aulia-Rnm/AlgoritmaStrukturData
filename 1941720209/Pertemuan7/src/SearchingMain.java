/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class SearchingMain {
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        int data[]={100,90,80,70,60,50,40,30};
        Searching pencarian=new Searching(data, 8);
        System.out.println("isi Array: ");
        pencarian.TampilData();
        int cari=30;
        System.out.println("Menggunakan sequential Search");
        int posisi=pencarian.FindSeqSearch(cari);
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("===================================");
        System.out.println("menggunakan binary search");
        posisi=pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.Tampilposisi(cari, posisi);
    }
}
