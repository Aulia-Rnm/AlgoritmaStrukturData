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
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        System.out.println("================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen=uul.nextInt();
        
        Faktorial[] fk=new Faktorial[elemen];
        for(int i=0;i<elemen;i++){
            fk[i]=new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai=uul.nextInt();
        }
        
        System.out.println("===============================================");
        double startTime=System.currentTimeMillis();
        System.out.println("Hasil faktorial dengan Brute Force");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialBF(fk[i].nilai));
        }
        double endTime=System.currentTimeMillis();
        double elapsedTime=(endTime-startTime)/1000;
        System.out.println("Waktu eksekusi: "+String.valueOf(elapsedTime)+" detik");        
        System.out.println("===============================================");
        
        startTime=System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0;i<elemen;i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah: "+fk[i].faktorialDC(fk[i].nilai));
        }
        endTime=System.currentTimeMillis();
        elapsedTime=(endTime-startTime)/1000;
        System.out.println("Waktu eksekusi: "+String.valueOf(elapsedTime)+" detik");
        System.out.println("===============================================");
    }
    
}
