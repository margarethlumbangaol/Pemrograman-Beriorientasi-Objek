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

public class StudentGrade {
    
    // Semua atribut dibuat private agar data tidak dapat
    // diakses atau diubah secara langsung dari luar class.
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    // Constructor digunakan untuk membuat objek StudentGrade
    // sekaligus menerima data NIM, nama, nilai kuis, dan nilai UTS.
    public StudentGrade(String nim, String nama, double nilaiKuis, double nilaiUTS) {
        this.nim = nim;
        this.nama = nama;
        
        // Menggunakan setter agar nilai awal juga divalidasi.
        setNilaiKuis(nilaiKuis);
        setNilaiUTS(nilaiUTS);
    }

    // Getter digunakan untuk mengambil nilai NIM.
    public String getNim() {
        return nim;
    }

    // Getter digunakan untuk mengambil nama mahasiswa.
    public String getNama() {
        return nama;
    }

    // Getter digunakan untuk mengambil nilai kuis.
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Getter digunakan untuk mengambil nilai UTS.
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter digunakan untuk mengambil grade huruf mahasiswa.
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Setter digunakan untuk mengubah nilai kuis.
    // Sebelum disimpan, nilai diperiksa agar berada di antara 0-100.
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            // Jika nilai valid, nilai kuis disimpan ke atribut.
            this.nilaiKuis = nilaiKuis;

            // Setelah nilai berubah, grade huruf dihitung kembali.
            hitungGradeHuruf();
        } else {
            // Jika nilai tidak valid, nilai tidak disimpan
            // dan program menampilkan pesan kesalahan.
            System.out.println("[Error] Nilai kuis tidak valid: "
                    + nilaiKuis + " (Harus antara 0 - 100)");
        }
    }

    // Setter digunakan untuk mengubah nilai UTS.
    // Nilai UTS juga harus berada di antara 0-100.
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            // Jika nilai valid, nilai UTS disimpan ke atribut.
            this.nilaiUTS = nilaiUTS;

            // Setelah nilai berubah, grade huruf dihitung kembali.
            hitungGradeHuruf();
        } else {
            // Jika nilai tidak valid, nilai tidak disimpan
            // dan program menampilkan pesan kesalahan.
            System.out.println("[Error] Nilai UTS tidak valid: "
                    + nilaiUTS + " (Harus antara 0 - 100)");
        }
    }

    // Method ini digunakan untuk menghitung nilai akhir mahasiswa.
    // Nilai kuis memiliki bobot 40%, sedangkan nilai UTS 60%.
    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    // Method private ini digunakan untuk menentukan grade huruf
    // berdasarkan nilai akhir mahasiswa.
    private void hitungGradeHuruf() {
        
        // Mengambil hasil perhitungan nilai akhir.
        double nilaiAkhir = hitungNilaiAkhir();

        // Menentukan grade berdasarkan rentang nilai akhir.
        if (nilaiAkhir >= 85) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 75) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 55) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Method ini digunakan untuk mencetak laporan
    // hasil studi mahasiswa ke layar.
    public void cetakLaporan() {
        
        // Menampilkan judul laporan.
        System.out.println("=== KARTU HASIL STUDI ===");

        // Menampilkan NIM mahasiswa.
        System.out.println("NIM         : " + nim);

        // Menampilkan nama mahasiswa.
        System.out.println("Nama        : " + nama);

        // Menampilkan nilai kuis.
        System.out.println("Nilai Kuis  : " + nilaiKuis);

        // Menampilkan nilai UTS.
        System.out.println("Nilai UTS   : " + nilaiUTS);

        // Menghitung dan menampilkan nilai akhir.
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());

        // Menampilkan grade huruf yang telah ditentukan.
        System.out.println("Grade Huruf : " + gradeHuruf);
    }
}
