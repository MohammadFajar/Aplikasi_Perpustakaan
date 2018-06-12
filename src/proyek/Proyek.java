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
            {"|No|", "--------------------Judul-----------------------------"},
            {"|1 |", " Penerapan Data Mining Dengan Matlab "},
            {"|2 |", " 30 Menit Membuat Jaringan Komputer"},
            {"|3 |", " Membuat Sendiri Jaringan  Komputer"},
            {"|4 |", " Koleksi Lengkap Software Hacking"},
            {"|5 |", " Konfigurasi Wireless Routerboard Mikrotik"},
            {"|6 |", " WordPress (Pengenalan WordPress)"},
            {"|7 |", " 101 Masalah Malware & Penangananya"},
            {"|8 |", " Aneka Tool Penyelamat Data Komputer"},
            {"|9 |", " Cara Cepat Menyusun Skripsi (Jurusan Informatika /Komputer)"},
            {"|10|", " Instalasi & Konfigurasi Jaringan Windows & Linux"}
        };
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < buku[i].length; j++) {
                System.out.print(buku[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("|--------------------------------------------------|");
    }
    
    static void menu() {
        System.out.println("=====================================");
        System.out.println("SELAMAT DATANG DI PERPUSTAKAAN STIKI");
        System.out.println("=====================================");
        System.out.println("Silahkan Isi identitas Anda : ");
    }

    static void home() {
        System.out.println("|--------------------------------------------------|");
        System.out.println("|               HOME PERPUSTAKAAN                  |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| 1.Pinjam Buku                                    |");
        System.out.println("| 2.Kembalikan Buku                                |");
        System.out.println("| 3.Hanya Berkunjung                               |");
        System.out.println("|--------------------------------------------------|");
    }

    public static void main(String[] args) {
        int i = 0;
        int waktu[] = new int[31];
        int kembali[] = new int[31];
        int pinjam[] = new int[31];
        int buku_pinjam[] = new int[5];
        int denda;
        int pilbuku = 0;
        Scanner input = new Scanner(System.in);

        //Bagian Menu Awal
        menu();
        String nama[] = new String[5];
        int nim[] = new int[5];
        System.out.print("Nama\t: ");
        nama[0] = input.nextLine();
        System.out.print("NIM\t: ");
        nim[0] = input.nextInt();

        home();
        System.out.print("Masukkan Pilihan Anda :");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Pilih Buku yang Akan dipinjam");
            rak();
            System.out.println("=====================================");
            System.out.print("Pilih Judul Buku yang akan dipinjam : ");
            pilbuku = input.nextInt();
            System.out.println("|--------------------------------------------------|");
            System.out.println("|              INFORMASI BUKU                      |");
            System.out.println("|--------------------------------------------------|");

            if (pilbuku == 1) {
                System.out.println("|--------------------------------------------------|");
                System.out.println("Judul\t: Penerapan Data Minign Dengan Matlab");
                System.out.println("Penerbit: Informatika");
                System.out.println("Tahun\t: Maret 2011");
                System.out.println("|--------------------------------------------------|");
            } else if (pilbuku == 2) {
                System.out.println("Judul\t: 30 Menit Mahir Membuat Jaringa Komputer");
                System.out.println("Penerbit: Dunia Komputer");
                System.out.println("Penulis : Alan Nur Hidayat");
                System.out.println("Tahun\t: 2013");
            } else if (pilbuku == 3) {
                System.out.println("Judul\t: Membuat Sendiri Jaringan  Komputer ");
                System.out.println("Penerbit: Elex Media Ko712mputindo ");
                System.out.println("Penuis : Edy Winarno ST.M.ENG");
                System.out.println("Tahun\t: 2013");
            } else if (pilbuku == 4) {
                System.out.println("Judul\t: Koleksi Lengkap Software Hacking");
                System.out.println("Penerbit: Elex Media");
                System.out.println("Penulis : Dedik Kurniawan ");
                System.out.println("Tahun\t: 2013");
            } else if (pilbuku == 5) {
                System.out.println("Judul\t: Konfigurasi Wireless Routerboard Mikrotik");
                System.out.println("Penerbit: Yogyakarta");
                System.out.println("Penulis : Hardana dan Ina Invantino");
                System.out.println("Tahun\t: 2012");
            } else if (pilbuku == 6) {
                System.out.println("Judul\t: WordPress(Pengenalan WordPress)");
                System.out.println("Penerbit : Andy");
                System.out.println("Penulis : Maria Agustino S");
                System.out.println("Tahun\t: 2010");
            } else if (pilbuku == 7) {
                System.out.println("Judul\t: 101 Masalah & Penanganannya");
                System.out.println("Penerbit : Andy");
                System.out.println("Penulis  : Feri Sulianta");
                System.out.println("Tahun\t: 2010");
            } else if (pilbuku == 8) {
                System.out.println("Judul\t: Aneka Tool");
                System.out.println("Penerbit :");
                System.out.println("Penulis  :");
                System.out.println("Tahun\t:");
            } else if (pilbuku == 9) {
                System.out.println("Judul\t:");
                System.out.println("Penerbit :");
                System.out.println("Penulis  :");
                System.out.println("Tahun\t:");
            } else if (pilbuku == 10) {
                System.out.println("Judul\t:");
                System.out.println("Penerbit:");
                System.out.println("Penulis :");
                System.out.println("Tahun\t:");
            } else {
                System.out.println("Pilihan Anda Salah");
            }
            System.out.println("Batas Peminjaman  : 3 Hari");
            System.out.print("Tanggal Pinjam : ");
            pinjam[i] = input.nextInt();
            
        } else if (pilihan == 2) {
            System.out.println("Buku yang akan dikembalikan : ");
            kembali[i] = input.nextInt();
            System.out.println("Tanggal Kembali : ");
            kembali[i] = input.nextInt();
            if (kembali[i] <= 1) {
                denda = 0;
            } else if (kembali[i] >= 2) {
                denda = 2000;
            }

        } else if (pilihan == 3) {
            System.out.println("Terima Kasih Atas Kunjungan Anda");

        }
    }
}
