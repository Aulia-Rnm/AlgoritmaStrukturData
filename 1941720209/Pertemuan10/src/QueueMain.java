/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aulia
 */
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan jumlah maksimal data antrian= ");
        int n=uul.nextInt();
        Queue Q=new Queue(n);
        do{
            menu();
            pilih=uul.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru= ");
                    int dtMasuk=uul.nextInt();
                    Q.enqueue(dtMasuk);
                    break;
                case 2:
                    int dtKlr=Q.dequeue();
                    if(dtKlr!=0){
                        System.out.println("Data yang terambil= "+dtKlr);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
            }
        }while(pilih==1||pilih==2||pilih==3||pilih==4);
    }
    static void menu(){
        System.out.println("Pilih operasi yang ingin dilakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("-------------------------------------");
    }
}
