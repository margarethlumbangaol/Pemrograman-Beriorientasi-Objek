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

// Membuat class dengan nama LoginSederhana
public class LoginSederhana {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan username
        System.out.print("Masukkan username: ");

        // Menyimpan username yang dimasukkan ke dalam variabel username
        String username = input.nextLine();

        // Meminta pengguna memasukkan password
        System.out.print("Masukkan password: ");

        // Menyimpan password yang dimasukkan ke dalam variabel password
        String password = input.nextLine();

        // Menentukan nilai awal bahwa password belum memiliki angka
        boolean adaAngka = false;

        // Mengecek apakah password mengandung angka
        for (int i = 0; i < password.length(); i++) {

            // Mengecek setiap karakter password apakah berupa angka
            if (Character.isDigit(password.charAt(i))) {

                // Jika ditemukan angka, adaAngka diubah menjadi true
                adaAngka = true;

                // Menghentikan perulangan karena angka sudah ditemukan
                break;
            }
        }

        // Mengecek apakah username benar dan password memenuhi syarat
        if (username.equals("admin") && password.length() >= 6 && adaAngka) {

            // Jika semua syarat terpenuhi, login berhasil
            System.out.println("Login berhasil!");

        // Mengecek apakah username yang dimasukkan tidak benar
        } else if (!username.equals("admin")) {

            // Menampilkan pesan bahwa username tidak valid
            System.out.println("Login gagal! Username tidak valid.");

        } else {

            // Jika username benar tetapi password tidak memenuhi syarat
            System.out.println("Login gagal! Password tidak valid.");
        }

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
