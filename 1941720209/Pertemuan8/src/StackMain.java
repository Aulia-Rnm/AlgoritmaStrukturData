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
public class StackMain {
    static Scanner uul=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah data: ");
        int input=uul.nextInt();
        int j[]={input};
        Stack tumpukan=new Stack(input);
        for(int i=0;i<input;i++){
            System.out.println("Masukkan angka ke-"+(i+1)+": ");
            int angka=uul.nextInt();
            tumpukan.push(angka);
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}