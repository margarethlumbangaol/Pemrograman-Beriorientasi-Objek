/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */

public class PengelolaanNilaiApp {

    public static void main(String[] args) {

        // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("Andi");

        try {
            // Mencoba memasukkan nilai mahasiswa
            mhs.setNilai(120);

            // Menampilkan data jika tidak terjadi exception
            mhs.tampilkanData();

        } catch (NilaiTidakValidException e) {

            // Menangani exception jika nilai tidak valid
            System.out.println("Terjadi kesalahan: "
                    + e.getMessage());

        } finally {

            // Bagian ini dijalankan setelah try-catch selesai
            System.out.println("Proses pengelolaan nilai selesai.");
        }
    }
}

