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

// Membuat class dengan nama RataRataNilai
public class RataRataNilai {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai pertama
        System.out.print("Masukkan nilai 1: ");

        // Menyimpan nilai pertama ke dalam variabel nilai1
        double nilai1 = input.nextDouble();

        // Meminta pengguna memasukkan nilai kedua
        System.out.print("Masukkan nilai 2: ");

        // Menyimpan nilai kedua ke dalam variabel nilai2
        double nilai2 = input.nextDouble();

        // Meminta pengguna memasukkan nilai ketiga
        System.out.print("Masukkan nilai 3: ");

        // Menyimpan nilai ketiga ke dalam variabel nilai3
        double nilai3 = input.nextDouble();

        // Menghitung rata-rata dari ketiga nilai
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        // Menampilkan hasil rata-rata dengan 2 angka di belakang koma
        System.out.printf("Rata-rata: %.2f%n", rataRata);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
