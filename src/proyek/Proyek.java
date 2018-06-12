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

    static void rak() {
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                   DAFTAR BUKU                    |");
        System.out.println("|--------------------------------------------------|");
        String[][] buku = {
            {"|No|","\t-------------Judul---------------\t","\t---------Pengarang---------\t","\t----Tahun-----\t"},
            {"|1|","\tTips Jitu Optimasi Jaringan Wifi\t","\t\tMadcoms\t","\t\t\t2010\t"},
            {"|2|","\tKonfigurasi Wireless Routerboard Mikrotik\t","\tAndy\t","\t\t\t2012\t"},
            {"|3|","\tWordPress(Pengenalan WordPress)\t","\t\t\tMario Agustinos\t","\t\t2010\t"},
            {"|4|","\t101 Masalah Malware & Penanganannya\t","\t\tFeri Sulianta\t","\t\t2010\t"},
            {"|5|","\tJago Merakit Komputer\t","\t\t\t\tBenecdicto Rini\t","\t\t2011\t"},
        };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < buku[i].length; j++) {
                System.out.print(buku[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("|--------------------------------------------------|");
    }
     static int pinjam[] = new int [31];
    static Scanner input = new Scanner(System.in);
    static Scanner input2 = new Scanner(System.in);

    static void menu() {
        System.out.println("=====================================");
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN STIKI");
        System.out.println("=====================================");
        System.out.println("Silahkan Isi identitas Anda : ");
        String nama[] = new String[5];
        int nim[] = new int[5];
        System.out.print("Nama\t: ");
        nama[0] = input.nextLine();
        System.out.print("NIM\t: ");
        nim[0] = input.nextInt();
    }

    static void home() {
        System.out.println("|--------------------------------------------------|");
        System.out.println("|               HOME PERPUSTAKAAN                  |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| 1.Pinjam Buku                                    |");
        System.out.println("| 2.Kembalikan Buku                                |");
        System.out.println("| 3.Hanya Berkunjung                               |");
        System.out.println("|--------------------------------------------------|");
                System.out.print("Masukkan Pilihan Anda :");
        int pilihan = input.nextInt();
        
         int i = 0;
        
        int kembali[] = new int[31];
        int denda;
        int denda1 = 0;
        int pilbuku = 0;
        int total = 0;
        
        if (pilihan == 1) {
            System.out.println("Pilih Buku yang Akan dipinjam");
            rak();
            System.out.println("=====================================");
            System.out.print("Pilih Judul Buku yang akan dipinjam : ");
            pilbuku = input.nextInt();
            System.out.println("|--------------------------------------------------|");
            System.out.println("|              INFORMASI BUKU                      |");
            System.out.println("|--------------------------------------------------|");

           
            System.out.print("Lama Pinjam : ");
            pinjam[i] = input.nextInt();
            System.out.println(pinjam[i]);

            home();

        } else if (pilihan == 2) {
            System.out.print("Buku yang akan dikembalikan : ");
            kembali[i] = input.nextInt();
            System.out.print("Lama Kembali : ");
            kembali[i] = input.nextInt();
         
            if (pinjam[i] > kembali[i]    ) {
                denda = 0;
            }else if (pinjam[i] < kembali[i]){
              total = (pinjam[i] - kembali[i])*2000;
            }
            if(total<0){
                total = total*-1;
            }
            System.out.print("Denda Anda :" + total);
        } else if (pilihan == 3) {
            System.out.println("Terima Kasih Atas Kunjungan Anda");

        }
    }
    static String y;

    public static void main(String[] args) {


        //Bagian Menu Awal
        menu();

        home();


        
    }
}
