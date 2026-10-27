/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */

public class Mahasiswa {

    // Menyimpan nama mahasiswa
    private String nama;

    // Menyimpan nilai mahasiswa
    private double nilai;

    // Constructor untuk mengisi nama mahasiswa
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // Method untuk mengisi dan memeriksa nilai mahasiswa
    // throws memberi tahu bahwa method dapat menghasilkan exception
    public void setNilai(double nilai)
            throws NilaiTidakValidException {

        // Nilai harus berada pada rentang 0 sampai 100
        if (nilai < 0 || nilai > 100) {

            // throw digunakan untuk melempar custom exception
            throw new NilaiTidakValidException(
                "Nilai harus berada antara 0 sampai 100!"
            );
        }

        // Nilai disimpan jika lolos pemeriksaan
        this.nilai = nilai;

        System.out.println("Nilai berhasil disimpan.");
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nilai mahasiswa: " + nilai);
    }
}

