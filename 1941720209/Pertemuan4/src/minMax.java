/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class minMax {
    public int nilaiArray;
    public static void max_min(int[] arr, int index_awal, int index_akhir, Maxmin hasil){
        int index_tengah;
        Maxmin hasil1=new Maxmin();
        Maxmin hasil2=new Maxmin();
        
        if(index_awal==index_akhir){
            hasil.minimum=hasil.maximum= arr[index_awal];
        }else if(index_akhir-index_awal==1){
            if(arr[index_awal]>arr[index_akhir]){
                hasil.minimum=arr[index_akhir];
                hasil.maximum=arr[index_awal];
            }else{
                hasil.minimum=arr[index_awal];
                hasil.maximum=arr[index_akhir];
            }
        }else{
            index_tengah=(index_awal+index_akhir)/2;
            max_min(arr, index_awal, index_tengah, hasil1);
            max_min(arr, index_tengah+1, index_akhir, hasil2);
            
            hasil.minimum=(hasil1.minimum<hasil2.minimum)?hasil1.minimum:hasil2.minimum;
            hasil.maximum=(hasil1.maximum>hasil2.maximum)?hasil1.maximum:hasil2.maximum;
        }
    }
}
