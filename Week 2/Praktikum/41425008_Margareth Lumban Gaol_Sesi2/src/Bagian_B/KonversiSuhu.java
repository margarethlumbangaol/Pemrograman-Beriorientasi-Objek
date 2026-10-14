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

// Membuat class dengan nama KonversiSuhu
public class KonversiSuhu {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Celsius ke Fahrenheit
        // Meminta pengguna memasukkan suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius: ");

        // Menyimpan suhu Celsius ke dalam variabel celsius
        double celsius = input.nextDouble();

        // Mengubah suhu Celsius menjadi Fahrenheit menggunakan rumus
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Menampilkan hasil konversi Celsius ke Fahrenheit
        System.out.println(celsius + " C = " + fahrenheit + " F");

        // Fahrenheit ke Celsius
        // Meminta pengguna memasukkan suhu dalam Fahrenheit
        System.out.print("Masukkan suhu dalam Fahrenheit: ");

        // Menyimpan suhu Fahrenheit ke dalam variabel fahrenheitInput
        double fahrenheitInput = input.nextDouble();

        // Mengubah suhu Fahrenheit menjadi Celsius menggunakan rumus
        double celsiusHasil = (fahrenheitInput - 32) * 5 / 9;

        // Menampilkan hasil dengan 1 angka di belakang koma untuk Fahrenheit
        // dan 2 angka di belakang koma untuk Celsius
        System.out.printf("%.1f F = %.2f C%n", fahrenheitInput, celsiusHasil);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
