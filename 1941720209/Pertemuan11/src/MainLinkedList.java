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
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainLinkedList {
    public static Scanner uul = new Scanner(System.in);
    public static int Pil,n;
    public static void main(String[] args) {
        LinkedList data=new LinkedList();
        System.out.println("Pilih salah satu");
        System.out.println("1. Tambah");
        System.out.println("1. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.println("-----------------");
        System.out.println("Pilihan: ");
        Pil=uul.nextInt();
        switch(Pil){
            case 1:
                tambah();
                break;
            case 2:
                hapus();
                break;
            case 3:
                cari();
                break;
            default:
        }
        /*try{
            data.addFirst(7);
            data.print();
            data.add(8, 1);
            data.print();
            data.addFirst(1);
            data.print();
            data.remove(1);
            data.addByValue(2, 7, 7);
            data.addByValue(1, 9, 9);
            data.print();
            data.clear();
            data.print();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }*/
    }
    public static void tambah(){
        LinkedList data=new LinkedList();
        int nilai, cari;
        System.out.println("1.Tambah (First)");
        System.out.println("2.Tambah (Index)");
        System.out.println("3.Tambah (Last)");
        System.out.print("Pilihan: ");
        Pil = uul.nextInt();
        
        switch(Pil){
            case 1:
                System.out.print("Masukan data yang ingin ditambahkan: ");
                n = uul.nextInt();
                data.addFirst(n);
                data.print();
                break;
            case 2:
                System.out.print("Masukan data yang ingin ditambahkan: ");
                n = uul.nextInt();
                System.out.print("Masukan nilai: ");
                nilai = uul.nextInt();
                System.out.print("Masukan cari: ");
                cari = uul.nextInt();
                {
                    try {
                        data.addByValue(n, nilai, cari);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
            case 3:
                System.out.print("Masukan data yang ingin ditambahkan: ");
                n = uul.nextInt();
                System.out.print("Masukan nilai: ");
                nilai = uul.nextInt();
                {
                    try {
                        data.add(nilai, n);
                    } catch (Exception ex) {
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                data.print();
                break;
            default:
        }
    }
    public static void hapus(){
        int nilai,cari;
        LinkedList data=new LinkedList();
        System.out.println("1. Hapus (Index)");
        System.out.println("2. Hapus (key)");
        System.out.println("3. Clear");
        System.out.print("Pilihan: ");
        Pil=uul.nextInt();
        switch(Pil){
            case 1:
                System.out.print("Masukkan data yang ingin dihapus: ");
                n=uul.nextInt();
                System.out.print("Masukkan nilai: ");
                nilai=uul.nextInt();
                System.out.print("Masukkan cari: ");
                cari=uul.nextInt();
                {
                    try{
                        data.removeByValue(n, nilai, cari);
                    }catch(Exception ex){
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
                data.print();
                break;
            case 2:
                System.out.print("Masukkan data yang ingin dihapus: ");
                n=uul.nextInt();
                {
                    try{
                        data.remove(n);
                    }catch(Exception ex){
                        Logger.getLogger(MainLinkedList.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
                data.print();
                break;
            case 3:
                data.clear();
                data.print();
                break;
            default:
        }
    }
    public static void cari(){
        LinkedList data=new LinkedList();
        System.out.println("1.Cari (Index)");
        System.out.println("2.Cari (Key)");
        System.out.print("Pilihan: ");
        Pil=uul.nextInt();
    }
}