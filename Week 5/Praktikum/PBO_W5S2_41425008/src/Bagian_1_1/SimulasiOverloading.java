/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1_1;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

// Kelas MesinTarif berfungsi untuk menghitung tarif pengiriman berdasarkan berbagai skenario bisnis
class MesinTarif {
    // Variabel privat untuk menyimpan nama kota asal pengiriman
    private String kotaAsal;

    // Konstruktor untuk menginisialisasi atribut kota asal
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal; // Menyimpan nilai parameter kotaAsal ke variabel instance
    }

    // Overload 1: Menghitung ongkir standar hanya berdasarkan berat barang (Kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000; // Tarif dasar: Rp10.000 per Kg
    }

    // Overload 2: Menghitung ongkir + biaya asuransi berdasarkan nilai barang
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01; // Biaya asuransi sebesar 1% dari total nilai barang
        return (beratKg * 10000) + biayaAsuransi; // Total ongkir dasar + biaya asuransi
    }

    // Overload 3: Menghitung ongkir dengan skenario pengiriman express (layanan kilat)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000; // Hitung tarif dasar awal
        if (isExpress) {
            total += 20000; // Tambahan biaya flat Rp20.000 jika memilih express
        }
        return total; // Mengembalikan total biaya pengiriman
    }
}

// Kelas utama untuk mensimulasikan penerapan Method Overloading
public class SimulasiOverloading {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERLOADING ===");

        // Menginstansiasi objek MesinTarif dengan lokasi kota asal "Medan"
        MesinTarif tarif = new MesinTarif("Medan");

        // Memanggil hitungOngkir(double) -> Menjalankan Overload 1 (Ongkir Standar)
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp" + tarif.hitungOngkir(2.0));

        // Memanggil hitungOngkir(double, double) -> Menjalankan Overload 2 (Ongkir + Asuransi)
        System.out.println("Ongkir + Asuransi (Barang 5Jt) : Rp" + tarif.hitungOngkir(2.0, 5000000.0));

        // Memanggil hitungOngkir(double, boolean) -> Menjalankan Overload 3 (Ongkir Express)
        System.out.println("Ongkir Express (2.0 Kg)        : Rp" + tarif.hitungOngkir(2.0, true));
    }
}

/*
Lembar Analisis Overloading:
 
  1. Mengapa compiler Java dapat menentukan method hitungOngkir mana
     yang dijalankan sebelum program dieksekusi (compile-time)?
 
     Jawaban:
     Compiler dapat menentukan method hitungOngkir() yang digunakan pada
     saat compile-time karena setiap method memiliki parameter yang berbeda.
     Compiler memeriksa jumlah, tipe data, dan urutan parameter pada saat
     method dipanggil. Dari parameter tersebut, compiler dapat menentukan
     method mana yang paling sesuai sebelum program dijalankan.
 
  2. Jika pada class MesinTarif ditambahkan method berikut:
 
     public int hitungOngkir(double beratKg) {
         return (int)(beratKg  10000);
     }
 
     Mengapa compiler menolak kode tersebut padahal tipe kembaliannya
     berbeda (int vs double)?
 
     Jawaban:
     Compiler menolak method tersebut karena parameter method-nya sama
     persis dengan method yang sudah ada, yaitu hitungOngkir(double).
     Dalam method overloading, perbedaan hanya pada tipe return tidak
     cukup untuk membuat method dianggap berbeda. Jadi, method
     hitungOngkir(double) dengan return type double dan method
     hitungOngkir(double) dengan return type int dianggap memiliki
     signature yang sama dan menyebabkan konflik.
*/
