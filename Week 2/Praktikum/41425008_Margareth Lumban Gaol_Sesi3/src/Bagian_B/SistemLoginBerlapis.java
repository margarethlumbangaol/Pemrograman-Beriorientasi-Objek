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

import java.util.Scanner;

public class SistemLoginBerlapis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menentukan username dan password yang benar
        String usernameBenar = "admin";
        String passwordBenar = "password123";

        // Menampilkan judul sistem login
        System.out.println("=== Sistem Login ===");

        // Perulangan untuk memberikan maksimal 3 kali percobaan
        for (int percobaan = 1; percobaan <= 3; percobaan++) {

            // Menampilkan nomor percobaan
            System.out.println("Percobaan " + percobaan + ":");

            // Meminta username
            System.out.print("Username: ");
            String username = scanner.nextLine();

            // Meminta password
            System.out.print("Password: ");
            String password = scanner.nextLine();

            // Mengecek apakah username memiliki 5-10 karakter
            if (username.length() < 5 || username.length() > 10) {
                System.out.println(
                    "Login gagal! Username harus antara 5-10 karakter."
                );

                // Jika username tidak valid, lanjut ke percobaan berikutnya
                continue;
            }

            // Menyimpan informasi apakah password memiliki angka
            boolean adaAngka = false;

            // Mengecek setiap karakter dalam password
            for (int i = 0; i < password.length(); i++) {

                // Jika karakter merupakan angka
                if (Character.isDigit(password.charAt(i))) {
                    adaAngka = true;

                    // Tidak perlu mengecek karakter berikutnya
                    break;
                }
            }

            // Mengecek apakah password kurang dari 8 karakter
            // atau tidak memiliki angka
            if (password.length() < 8 || !adaAngka) {

                // Jika password tidak memenuhi syarat
                System.out.println(
                    "Login gagal! Password harus minimal 8 karakter dan mengandung angka."
                );

                // Langsung lanjut ke percobaan berikutnya
                continue;
            }

            // Mengecek apakah username dan password benar
            if (username.equals(usernameBenar)
                    && password.equals(passwordBenar)) {

                // Jika username dan password benar
                System.out.println("Login berhasil!");

                // Menghentikan perulangan karena login berhasil
                break;

            } else {

                // Jika username atau password salah
                if (percobaan == 3) {

                    // Jika sudah sampai percobaan ketiga, akun dikunci
                    System.out.println(
                        "Akun terkunci! Terlalu banyak percobaan gagal."
                    );

                } else {

                    // Jika masih memiliki kesempatan mencoba
                    System.out.println("Login gagal! Password salah.");
                }
            }
        }

        // Menutup Scanner
        scanner.close();
    }
}