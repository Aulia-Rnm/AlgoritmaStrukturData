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
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        for(int i=0;i<3;i++){
            ppArray[0]=new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[0].panjang=uul.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[0].lebar=uul.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[0].panjang+", lebar: "+ppArray[0].lebar);
        }
    }
}
