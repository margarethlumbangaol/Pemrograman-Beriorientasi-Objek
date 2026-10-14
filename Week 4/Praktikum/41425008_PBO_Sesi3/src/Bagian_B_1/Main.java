/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_1;

/**
 *
 * @author MARGARETH
 */

/* Nama : Margareth Lumban Gaol
   NIM  : 41425008
   Prodi : D4 TRPL
*/

public class Main {
    
    public static void main(String[] args) {
        
        // Membuat objek StudentGrade bernama mahasiswa.
        // Data yang diberikan adalah NIM, nama, nilai kuis, dan nilai UTS.
        StudentGrade mahasiswa = new StudentGrade(
                "11425001",
                "Marsha",
                80.0,
                90.0
        );

        // Menampilkan pesan bahwa mahasiswa berhasil didaftarkan.
        // getNim() digunakan untuk mengambil NIM,
        // sedangkan getNama() digunakan untuk mengambil nama mahasiswa.
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: "
                + mahasiswa.getNim() + " - " + mahasiswa.getNama());

        // Mencoba memasukkan nilai kuis yang tidak valid.
        // Nilai 110 berada di luar batas nilai yang diperbolehkan, yaitu 0-100.
        mahasiswa.setNilaiKuis(110.0);

        // Memperbaiki nilai kuis dengan nilai yang valid.
        // Nilai 85 berada dalam rentang 0-100 sehingga akan diterima.
        mahasiswa.setNilaiKuis(85.0);

        // Menampilkan nilai kuis setelah berhasil diperbarui.
        System.out.println("[Update] Nilai kuis berhasil diubah menjadi: "
                + mahasiswa.getNilaiKuis());

        // Mengubah nilai UTS menjadi 90.
        // Nilai tersebut valid karena berada dalam rentang 0-100.
        mahasiswa.setNilaiUTS(90.0);

        // Menampilkan nilai UTS setelah berhasil diperbarui.
        System.out.println("[Update] Nilai UTS berhasil diubah menjadi: "
                + mahasiswa.getNilaiUTS());

        // Memberikan satu baris kosong agar tampilan output lebih rapi.
        System.out.println();

        // Memanggil method cetakLaporan() untuk menampilkan
        // seluruh informasi nilai mahasiswa.
        mahasiswa.cetakLaporan();
    }
}
