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

public class DaftarBelanja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan daftar belanja
        // Maksimal 100 item dapat disimpan
        String[] daftar = new String[100];

        // Menyimpan jumlah item yang saat ini ada di dalam daftar
        int jumlahItem = 0;

        // Variabel untuk menyimpan pilihan menu pengguna
        int pilihan;

        // while digunakan agar menu terus ditampilkan
        // selama pengguna belum memilih menu 5 (Keluar)
        do {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");

            // Meminta pengguna memilih menu
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            // Membersihkan enter yang tersisa setelah nextInt()
            scanner.nextLine();

            // Memilih tindakan berdasarkan pilihan pengguna
            switch (pilihan) {

                // =========================
                // MENU 1: TAMBAH ITEM
                // =========================
                case 1:

                    // Mengecek apakah array masih memiliki tempat
                    if (jumlahItem < daftar.length) {

                        // Meminta pengguna memasukkan nama item
                        System.out.print("Masukkan item: ");
                        String item = scanner.nextLine();

                        // Menyimpan item ke posisi terakhir yang kosong
                        daftar[jumlahItem] = item;

                        // Menambah jumlah item setelah berhasil ditambahkan
                        jumlahItem++;

                        // Menampilkan pesan bahwa item berhasil ditambahkan
                        System.out.println(item + " berhasil ditambahkan!");

                    } else {

                        // Ditampilkan jika array sudah penuh
                        System.out.println("Daftar belanja sudah penuh!");
                    }

                    break;

                // =========================
                // MENU 2: HAPUS ITEM
                // =========================
                case 2:

                    // Mengecek apakah daftar memiliki item
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                        break;
                    }

                    // Meminta posisi item yang ingin dihapus
                    System.out.print("Hapus item pada posisi: ");
                    int posisiHapus = scanner.nextInt();

                    // Mengecek apakah posisi yang dimasukkan valid
                    if (posisiHapus >= 1 && posisiHapus <= jumlahItem) {

                        // Mengambil nama item yang akan dihapus
                        String itemDihapus = daftar[posisiHapus - 1];

                        // Menggeser item setelah item yang dihapus
                        // satu posisi ke kiri
                        for (int i = posisiHapus - 1; i < jumlahItem - 1; i++) {
                            daftar[i] = daftar[i + 1];
                        }

                        // Mengosongkan posisi terakhir
                        daftar[jumlahItem - 1] = null;

                        // Mengurangi jumlah item
                        jumlahItem--;

                        // Menampilkan pesan bahwa item berhasil dihapus
                        System.out.println(itemDihapus + " berhasil dihapus!");

                    } else {

                        // Ditampilkan jika posisi tidak ada dalam daftar
                        System.out.println("Posisi tidak valid!");
                    }

                    break;

                // =========================
                // MENU 3: TAMPILKAN ITEM
                // =========================
                case 3:

                    // Mengecek apakah daftar masih kosong
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");

                    } else {

                        // Menampilkan judul daftar
                        System.out.println("Daftar belanja:");

                        // Loop digunakan untuk menampilkan semua item
                        for (int i = 0; i < jumlahItem; i++) {

                            // i + 1 digunakan agar nomor dimulai dari 1
                            System.out.println((i + 1) + ". " + daftar[i]);
                        }
                    }

                    break;

                // =========================
                // MENU 4: CARI ITEM
                // =========================
                case 4:

                    // Mengecek apakah daftar masih kosong
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                        break;
                    }

                    // Meminta nama item yang ingin dicari
                    System.out.print("Cari item: ");
                    String cari = scanner.nextLine();

                    // Variabel untuk mengetahui apakah item ditemukan
                    boolean ditemukan = false;

                    // Mencari item satu per satu menggunakan loop
                    for (int i = 0; i < jumlahItem; i++) {

                        // equalsIgnoreCase digunakan agar pencarian
                        // tidak membedakan huruf besar dan kecil
                        if (daftar[i].equalsIgnoreCase(cari)) {

                            // Item ditemukan
                            System.out.println(
                                cari + " ditemukan pada posisi " + (i + 1)
                            );

                            // Mengubah status menjadi true
                            ditemukan = true;

                            // Menghentikan pencarian karena item sudah ditemukan
                            break;
                        }
                    }

                    // Jika item tidak ditemukan setelah semua item diperiksa
                    if (!ditemukan) {
                        System.out.println(cari + " tidak ditemukan.");
                    }

                    break;

                // =========================
                // MENU 5: KELUAR
                // =========================
                case 5:

                    // Menampilkan pesan sebelum program berhenti
                    System.out.println("Terima kasih!");

                    break;

                // Jika pengguna memasukkan pilihan selain 1-5
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        // Perulangan berhenti jika pilihan pengguna adalah 5
        } while (pilihan != 5);

        // Menutup Scanner setelah program selesai
        scanner.close();
    }
}
