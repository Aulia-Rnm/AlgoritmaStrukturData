import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner uul = new Scanner(System.in);
        Scanner uul1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data=new DaftarMahasiswaBerprestasi();
        int jumMhs=5;
        
        for(int i=0;i<jumMhs;i++){
            System.out.print("Nama= ");
            String nama=uul1.nextLine();
            System.out.print("Tahun Masuk= ");
            int thn=uul.nextInt();
            System.out.print("Umur= ");
            int umur=uul.nextInt();
            System.out.print("IPK= ");
            double ipk=uul.nextDouble();
            
            Mahasiswa m=new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        System.out.println("Data Mahasiswa sebelum sorting= ");
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk= ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk= ");
        data.selectionSort();
        data.tampil();
        System.out.println("Data mahasiswa setelah di Insertion Sort= ");
        data.insertionSort();
        data.tampil();
    }
}