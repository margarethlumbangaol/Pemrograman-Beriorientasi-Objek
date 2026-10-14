/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolymorphismdanAbstractClass;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class abstrak Mantra sebagai cetakan dasar (superclass) untuk semua jenis mantra.
 */
abstract class Mantra {
    // Variabel privat untuk menyimpan nama mantra (enkapsulasi)
    private String nama;

    // Konstruktor untuk menginisialisasi atribut nama
    public Mantra(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengambil nilai nama mantra
    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra (wajib diimplementasikan oleh subclass)
    public abstract void efek();
}

/**
 * Subclass Expelliarmus yang mewarisi sifat dari class Mantra.
 */
class Expelliarmus extends Mantra {
    // Konstruktor mengirim nama "Expelliarmus" ke superclass
    public Expelliarmus() {
        super("Expelliarmus");
    }

    // Implementasi khusus method efek() untuk Expelliarmus
    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

/**
 * Subclass ExpectoPatronum yang mewarisi sifat dari class Mantra.
 */
class ExpectoPatronum extends Mantra {
    // Konstruktor mengirim nama "Expecto Patronum" ke superclass
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    // Implementasi khusus method efek() untuk ExpectoPatronum
    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

/**
 * Subclass Lumos yang mewarisi sifat dari class Mantra.
 */
class Lumos extends Mantra {
    // Konstruktor mengirim nama "Lumos" ke superclass
    public Lumos() {
        super("Lumos");
    }

    // Implementasi khusus method efek() untuk Lumos
    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

/**
 * Class Penyihir merepresentasikan karakter penyihir yang memiliki daftar mantra.
 */
class Penyihir {
    // Variabel private untuk menyimpan nama penyihir dan daftar mantra yang dikuasai
    private String nama;
    private List<Mantra> mantraList;

    // Konstruktor untuk menginisialisasi nama penyihir dan list mantra
    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Method untuk menambahkan mantra baru ke dalam daftar mantra penyihir
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Method untuk mencari dan mengucapkan mantra berdasarkan nama
    public void ucapkanMantra(String namaMantra) {
        // Melakukan perulangan untuk mengecek setiap mantra yang dipelajari
        for (Mantra mantra : mantraList) {
            // Jika nama mantra ditemukan di dalam list
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek(); // Mengaktifkan efek dari mantra tersebut
                return; // Keluar dari method setelah mantra ditemukan dan dieksekusi
            }
        }
        // Pesan jika mantra belum ada di dalam daftar mantraList
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Method baru untuk mengucapkan SEMUA mantra yang telah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println("\n=== " + nama + " Mengucapkan Semua Mantra yang Dipelajari ===");
        
        // Mengecek apakah penyihir belum mempelajari mantra sama sekali
        if (mantraList.isEmpty()) {
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }

        // Iterasi dan eksekusi setiap mantra yang ada di dalam list
        for (Mantra mantra : mantraList) {
            System.out.println(nama + " mengucapkan: " + mantra.getNama());
            mantra.efek();
        }
    }
}

/**
 * Class utama (DuniaSihir) untuk menjalankan simulasi program.
 */
public class DuniaSihir {
    public static void main(String[] args) {
        // Membuat objek penyihir bernama Harry Potter
        Penyihir harry = new Penyihir("Harry Potter");
        
        // Membuat instance objek dari masing-masing jenis mantra
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        // Harry mempelajari mantra
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
        harry.belajarMantra(lumos);

        // Memanggil perintah untuk mengucapkan semua mantra sekaligus
        harry.ucapkanSemuaMantra();
    }
}

/*
Pertanyaan:

1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?

Mantra sebagai Cetakan Abstrak (Abstract Class):Abstract class Mantra berfungsi menetapkan aturan 
bahwa semua mantra wajib memiliki method efek(), sekaligus menyediakan method umum seperti getNama().
Subclass Menentukan Perilaku Khusus: Setiap kelas turunan (Expelliarmus, ExpectoPatronum, Lumos) 
mengimplementasikan logika efek() masing-masing sesuai jenis mantranya.
Polymorphism Mengelola Berbagai Objek: Dalam kelas Penyihir, daftar mantra disimpan menggunakan
tipe umum List<Mantra>. Saat method ucapkanMantra() atau ucapkanSemuaMantra() dipanggil, Java secara 
dinamis mengeksekusi method efek() milik objek spesifik (subclass) tersebut secara otomatis pada saat runtime, 
tanpa peduli jenis mantra apa yang sedang diproses.

2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah? Mengapa?
Prosesnya Mudah.
Alasannya: Kelas Penyihir dibuat berpatokan pada abstract class Mantra (menerapkan prinsip Dependency Inversion), 
bukan pada kelas konkret seperti Expelliarmus atau Lumos.
Langkah Penambahan: Jika kita ingin membuat mantra baru (misalnya AvadaKedavra atau Alohomora), 
kita cukup membuat kelas baru yang menuruni Mantra (extends Mantra) dan mengimplementasikan method efek().
Kelas Penyihir tidak perlu diubah atau diedit sedikit pun, karena objek dari kelas mantra baru tersebut 
otomatis bisa langsung dimasukkan ke dalam mantraList dan dijalankan oleh method belajarMantra() maupun ucapkanSemuaMantra().
*/
