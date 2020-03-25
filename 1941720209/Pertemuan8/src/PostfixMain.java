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
public class PostfixMain {
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika: ");
        Q=uul.nextLine();
        Q=Q.trim();
        Q=Q+")";
        int total=Q.length();
        Postfix post=new Postfix(total);
        P=post.konversi(Q);
        System.out.println("Postfix: "+P);
    }
}
