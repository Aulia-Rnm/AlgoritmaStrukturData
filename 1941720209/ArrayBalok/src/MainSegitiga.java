/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray [0]= new Segitiga(10, 4, 7);
        sgArray [1]= new Segitiga(20, 10, 12); 
        sgArray [2]= new Segitiga(15, 6, 15);
        sgArray [3]= new Segitiga(25, 10, 21); 
        for(int i=0;i<4;i++){
            System.out.println("Luas Segitiga ke-"+i+"= "+sgArray[i].hitungLuas());
        }
        for(int i=0;i<4;i++){
            System.out.println("Keliling segitiga ke-"+i+"= "+sgArray[i].hitungKeliling());
        }
    }
}
