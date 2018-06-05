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
      
          int waktu [] [] = new int [31] [12];
          int denda;
          int kembali[] [] = new int [31][12];
          int pinjam [] [] = new int [31] [12];
      Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN STIKI"); 
        System.out.println("=====================================");
        System.out.println("Silahkan Isi identitas Anda : ");
        
        String nama[]= new String[5];
        int nim [] = new int[5];
        System.out.print("Nama\t: ");
        nama [0]= sc.nextLine();
        System.out.print("NIM\t: ");
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
			for (int j=0;j < buku[i].length;j++){
			System.out.print(buku [i][j]+" ");
			}
                        System.out.println("");	
		}
               System.out.println("=====================================");
               System.out.print("Lama Pinjaman (Hari) : ");
               System.out.print("Waktu Kembali : ");
               
               for(int a=0; a < pinjam.length;a++ ){
                   for(int b=0; b < pinjam[a].length ; b++){
                    pinjam [a][b] = sc.nextInt();
                    kembali[a][b]= sc.nextInt();
           
                   }
               }
               
        }else if (pilihan == 2){
            for(int a=0; a < pinjam.length;a++ ){
                   for(int b=0; b < pinjam[a].length ; b++){
                    waktu [a][b]= kembali[a][b] - pinjam[a][b];
                    
                if (kembali[a][b] > 1){
                   denda = 5000;
               }else{
                   denda = 0;
               }
               
               int hitung[] []= new int [2][0];
               hitung[a][b]= denda *( waktu[a][b]);
                   }
               }
              
               //menghitung denda jika terlambat kembali
               
               
        }else if (pilihan == 3){
            System.out.println("Terima Kasih Atas Kunjungan Anda");
           
        }
        
    
    }
}
