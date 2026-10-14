/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

/**
 *
 * @author MARGARETH
 */

/*
NIM: 41425008
Nama: Margareth Lumban Gaol
Motto:
*/

import java.util.Scanner; // Mengimpor Scanner untuk membaca input dari pengguna

public class KasirSederhana { // Membuat class dengan nama KasirSederhana

    public static void main(String[] args) { // Method utama yang pertama kali dijalankan

        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input

        System.out.print("Masukkan nama barang: "); // Meminta pengguna memasukkan nama barang
        String namaBarang = input.nextLine(); // Menyimpan nama barang ke dalam variabel namaBarang

        System.out.print("Masukkan harga barang: "); // Meminta pengguna memasukkan harga barang
        double hargaBarang = input.nextDouble(); // Menyimpan harga barang ke dalam variabel hargaBarang

        System.out.print("Masukkan jumlah beli: "); // Meminta pengguna memasukkan jumlah barang yang dibeli
        int jumlahBeli = input.nextInt(); // Menyimpan jumlah beli ke dalam variabel jumlahBeli

        // Menghitung total harga sebelum mendapatkan diskon
        double totalSebelumDiskon = hargaBarang * jumlahBeli;

        double diskon = 0; // Menentukan nilai awal diskon sebesar 0

        // Mengecek apakah total belanja mencapai Rp100.000
        if (totalSebelumDiskon >= 100000) {

            // Jika mencapai Rp100.000, diberikan diskon sebesar 10%
            diskon = totalSebelumDiskon * 0.10;
        }

        // Menghitung total yang harus dibayar setelah dikurangi diskon
        double totalBayar = totalSebelumDiskon - diskon;

        // Menampilkan total harga sebelum diskon
        // (int) digunakan untuk menghilangkan angka desimal
        System.out.println("Total sebelum diskon: " + (int) totalSebelumDiskon);

        // Menampilkan jumlah diskon
        System.out.println("Diskon: " + (int) diskon);

        // Menampilkan total harga yang harus dibayar
        System.out.println("Total bayar: " + (int) totalBayar);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
