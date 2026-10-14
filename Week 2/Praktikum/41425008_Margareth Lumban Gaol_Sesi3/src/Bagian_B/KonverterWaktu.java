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

public class KonverterWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            // Menampilkan menu pilihan
            System.out.println("\n=== Konverter Waktu ===");
            System.out.println("1. Detik ke HH:MM:SS");
            System.out.println("2. HH:MM:SS ke detik");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            // Pilihan 1: Mengubah total detik menjadi jam, menit, dan detik
            if (pilihan == 1) {
                System.out.print("Masukkan jumlah detik: ");
                int totalDetik = input.nextInt();

                // Menghitung jumlah jam
                int jam = totalDetik / 3600;

                // Menghitung sisa detik setelah jam diambil
                int sisaDetik = totalDetik % 3600;

                // Menghitung menit dari sisa detik
                int menit = sisaDetik / 60;

                // Menghitung detik yang tersisa
                int detik = sisaDetik % 60;

                // %02d digunakan agar angka selalu memiliki 2 digit
                // Contoh: 1 menjadi 01 dan 5 menjadi 05
                System.out.printf("Hasil: %02d:%02d:%02d%n",
                        jam, menit, detik);

            // Pilihan 2: Mengubah HH:MM:SS menjadi total detik
            } else if (pilihan == 2) {
                // nextLine() digunakan untuk mengambil input waktu lengkap
                // seperti 01:01:05
                input.nextLine();

                System.out.print("Masukkan waktu (HH:MM:SS): ");
                String waktu = input.nextLine();

                // Memisahkan jam, menit, dan detik berdasarkan tanda :
                String[] bagian = waktu.split(":");

                // Mengubah setiap bagian dari String menjadi int
                int jam = Integer.parseInt(bagian[0]);
                int menit = Integer.parseInt(bagian[1]);
                int detik = Integer.parseInt(bagian[2]);

                // Mengubah semuanya menjadi detik
                int totalDetik = (jam * 3600) + (menit * 60) + detik;

                System.out.println("Hasil: " + totalDetik + " detik");

            // Pilihan 3 digunakan untuk keluar dari program
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");

            // Jika pilihan bukan 1, 2, atau 3
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
