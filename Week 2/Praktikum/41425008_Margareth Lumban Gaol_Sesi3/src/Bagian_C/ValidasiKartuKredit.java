/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

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

public class ValidasiKartuKredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nomor kartu
        System.out.print("Masukkan nomor kartu: ");
        String kartu = input.nextLine();

        // Menghapus tanda hubung (-) dari nomor kartu
        String nomor = kartu.replace("-", "");

        // Mengecek apakah jumlah digit tepat 16
        if (nomor.length() != 16) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Nomor kartu harus terdiri dari 16 digit.");

        // Mengecek apakah karakter pertama adalah 4, 5, atau 6
        } else if (!(nomor.startsWith("4")
                || nomor.startsWith("5")
                || nomor.startsWith("6"))) {

            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");

        } else {
            // Mengecek apakah semua karakter merupakan angka
            boolean semuaAngka = true;

            for (int i = 0; i < nomor.length(); i++) {
                if (!Character.isDigit(nomor.charAt(i))) {
                    semuaAngka = false;
                    break;
                }
            }

            if (semuaAngka) {
                System.out.println("Nomor kartu valid.");
            } else {
                System.out.println("Nomor kartu tidak valid!");
                System.out.println("Nomor kartu hanya boleh mengandung angka.");
            }
        }

        input.close();
    }
}
