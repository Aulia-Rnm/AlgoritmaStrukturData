/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Queue {
    int max, size, front, rear;
    int[] q;
    
    Queue(int n){
        max=n;
        create();
    }
    void create(){
        q=new int[max];
        size=0;
        front=rear=-1;
    }
    boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen Terdepan: "+q[front]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    void print(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong!!");
        }else{
            int i=front;
            while(i!=rear){
                System.out.print(q[i]+"-");
                i=(i+1)%max;
            }
            System.out.println(q[i]+" ");
            System.out.print("Jumlah antrian= "+size);
        }
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("Antrian sudah penuh!!");
        }else{
            if(isEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }
            }
            q[rear]=data;
            size++;
        }
    }
    int dequeue(){
        int data=0;
        if(isEmpty()){
            System.out.println("Antrian kosong!!");
        }else{
            data=q[front];
            size--;
            if(isEmpty()){
                front=rear=-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
}