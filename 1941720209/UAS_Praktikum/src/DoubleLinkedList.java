/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DoubleLinkedList {
    Node head;
    int size;
    public DoubleLinkedList(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int kode, String judul, String distri, int stock, int broke){
        if(isEmpty()){
            head=new Node(null,kode,judul,distri,stock,broke,null);
        }else{
            Node newNode=new Node(null,kode,judul,distri,stock,broke,head);
            head.prev=newNode;
            head=newNode;
        }size++;
    }
    public void AddLast(String judul, String distri,int kode, int stock, int broke){
        if(isEmpty()){
            addFirst(kode,judul,distri,stock,broke);
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            Node newNode=new Node(current,kode,judul,distri,stock,broke,null);
            current.next=newNode;
            size++;
        }
    }
    public void add(String judul, String distri,int kode, int stock, int broke, int index)throws Exception{
        if(isEmpty())
            addFirst(kode,judul,distri,stock,broke);
        if(index<0||index>size)
            throw new Exception("Nilai index diluar batas");
        else{
            Node current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }if(current.prev==null){
                Node newNode=new Node(null,kode,judul,distri,stock,broke,current);
                current.prev=newNode;
                head=newNode;
            }else{
                Node newNode=new Node(current,kode,judul,distri,stock,broke,current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }size++;
    }
    public int size(){
        return size;
    }
    public void print(){
        if(!isEmpty()){
            Node tmp=head;
            while(tmp!=null){
                tmp.cd.tampil();
                tmp=tmp.next;
            }System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("LinkedList Kosong");
        }
    }
    public void removeFirst()throws Exception{
        if(isEmpty())throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        else if(size==1){
            removeLast();
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    public void removeLast()throws Exception{
        if(isEmpty())throw new Exception("Linked List masih kosong, tidak dapat di hapus");
        if(head.next==null){
            head=null;
            size--;
            return;
        }Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }current.next = null;
        size--;
    }
    public void remove(int index)throws Exception{
        if(isEmpty()||index>=size)throw new Exception("Nilai index diluar batas");
        if(index==0){
            removeFirst();
        }else{
            Node current=head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }
            if(current.next==null){
                current.prev.next=null;
            }else if(current.prev==null){
                current=current.next;
                current.prev=null;
                head=current;
            }else{
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            size--;
        }
    }
     public void getFirst()throws Exception{
        if(isEmpty())
            throw new Exception("Linked List Kosong");
        head.cd.tampil();
    }
    public void getLast()throws Exception {
        if(isEmpty())throw new Exception("Linked List Kosong");
        Node tmp=head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }
        tmp.cd.tampil();
    }
    public void get(int index) throws Exception {
        if(isEmpty()||index>=size)throw new Exception("Nilai index diluar batas");
        Node tmp=head;
        for(int i=0;i<index;i++){
            tmp=tmp.next;
        }
        tmp.cd.tampil();
    }
    public int find(String key){
        Node tmp=head;
        int ada=0;
        while(tmp.next!=null){
            if(tmp.cd.judul.equalsIgnoreCase(key)){
                break;
            }
            ada++;
            tmp=tmp.next;
        }
        return ada;
    }
    public void bubbleShort(){
        Node tmp=head;
        for (int i=1;i<size-1;i++){
            for(int j=1;j<size;j++){
                if(tmp.cd.kode>tmp.next.cd.kode){
                    CD_UUL n=tmp.cd;
                    tmp.cd=tmp.next.cd;
                    tmp.next.cd=n;
                }
                tmp=tmp.next;
            }
            tmp=head;
        }
    }
}
