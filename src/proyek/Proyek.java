/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek;

/**
 *
 * @author Ore
 */
import java.util.Scanner;
public class Proyek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          int waktu;
          int denda;
          int kembali = 0;
          int pinjam = 0;
      Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN STIKI"); 
        System.out.println("=====================================");
        System.out.println("Silahkan Isi identitas Anda : ");
        
        String nama[]= new String[5];
        int nim [] = new int[5];
        System.out.print("Nama : ");
        nama [0]= sc.nextLine();
        System.out.print("NIM : ");
        nim [0] = sc.nextInt();
        System.out.println("=====================================");
        System.out.println("1.Pinjam Buku");
        System.out.println("2.Kembalikan Buku");
        System.out.println("3.Hanya Berkunjung");
        System.out.println("=====================================");
        System.out.print("Masukkan Pilihan Anda :");
        int pilihan =sc.nextInt();
        
        if (pilihan==1){
            System.out.println("Pilih Buku yang Akan dipinjam");
            String [] [] buku ={
                //{"|No|", "Judul", "Penerbit"},
		{"|1|", "PHP Framework Code Igniter","Betha Sidik"},
		{"|2|", "Membuat Website PHP dengan Code Igniter ", "Jubilee Enterprise"},
		{"|3|", "Algoritma & Pemrograman Dasar 1 ED.3", "Informatika"},
                {"|4|", "Analisis & Perancangan Sistem Informasi", "Informatika"} }; 
	
		for (int i=0; i<5; i++){
			for (int j=0;j<3;j++){
				System.out.print(buku [i][j]+" ");
			}System.out.println("");	
		}
               System.out.println("=====================================");
               System.out.print("Waktu Pinjaman Hari : ");
               pinjam = sc.nextInt();
               System.out.print("Waktu Kembali : ");
               kembali = sc.nextInt();

        }else if (pilihan == 2){
               waktu = kembali - pinjam;
               //menghitung denda jika terlambat kembali
               if (kembali > 1){
                   denda = 5000;
               }else{
                   denda = 0;
               }
               int hitung;
               hitung = denda * waktu;
               
        }else if (pilihan == 3){
            System.out.println("Terima Kasih Atas Kunjungan Anda");
        }
        
    
    }
}
