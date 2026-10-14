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
Motto: Grow through what you go through
*/

// Mengimpor Scanner untuk menerima input dari pengguna
import java.util.Scanner;

// Membuat class dengan nama OperasiMatematika
public class OperasiMatematika {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan angka pertama
        System.out.print("Masukkan angka pertama: ");

        // Menyimpan angka pertama ke dalam variabel angka1
        int angka1 = input.nextInt();

        // Meminta pengguna memasukkan angka kedua
        System.out.print("Masukkan angka kedua: ");

        // Menyimpan angka kedua ke dalam variabel angka2
        int angka2 = input.nextInt();

        // Menghitung sisa pembagian angka1 dengan angka2
        int sisaBagi = angka1 % angka2;

        // Menghitung angka1 pangkat angka2 menggunakan Math.pow()
        double pangkat = Math.pow(angka1, angka2);

        // Menampilkan hasil sisa pembagian
        System.out.println("Sisa bagi: " + sisaBagi);

        // Mengubah hasil pangkat dari double menjadi int lalu menampilkannya
        System.out.println("Pangkat: " + (int) pangkat);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
