/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Node {
    CD_UUL cd=new CD_UUL();
    Node prev;
    Node next;
    Node(Node prev, int kode, String judul, String distri, int stock, int broke,Node next) {
        this.prev=prev;
        cd.kode=kode;
        cd.judul=judul;
        cd.distri=distri;
        cd.stock=stock;
        cd.broke=broke;
        this.next=next;
    }
}