/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/
import java.util.*;

/*
Class abstrak MantraAbstrak berfungsi sebagai blueprint/cetakan dasar
untuk semua jenis mantra. Tidak dapat diinstansiasi secara langsung.
 */
abstract class MantraAbstrak {
    // Variabel private untuk menyimpan nama mantra (enkapsulasi)
    private String nama;

    // Konstruktor untuk menginisialisasi nama mantra saat objek dibuat
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: wajib diimplementasikan/diisi oleh setiap subclass
    public abstract void efek();

    // Method konkret: memiliki implementasi langsung dan mewarisi fungsinya ke subclass
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

/*
Class Expelliarmus mewarisi (extends) sifat dan metode dari MantraAbstrak
 */
class Expelliarmus extends MantraAbstrak {
    // Konstruktor Expelliarmus mengirimkan nama mantra ke konstruktor parent (MantraAbstrak)
    public Expelliarmus() {
        super("Expelliarmus");
    }

    // Mengimplementasikan abstract method efek() khusus untuk Expelliarmus
    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

/*
Class ExpectoPatronum mewarisi (extends) sifat dan metode dari MantraAbstrak
 */
class ExpectoPatronum extends MantraAbstrak {
    // Konstruktor ExpectoPatronum mengirimkan nama mantra ke konstruktor parent (MantraAbstrak)
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    // Mengimplementasikan abstract method efek() khusus untuk ExpectoPatronum
    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

/*
Class Lumos mewarisi (extends) sifat dan metode dari MantraAbstrak
 */
class Lumos extends MantraAbstrak {
    // Konstruktor Lumos mengirimkan nama mantra ke konstruktor parent (MantraAbstrak)
    public Lumos() {
        super("Lumos");
    }

    // Mengimplementasikan abstract method efek() khusus untuk Lumos
    @Override
    public void efek() {
        System.out.println("Efek: Menciptakan cahaya di ujung tongkat.");
    }
}

/*
Class utama untuk menjalankan dan menguji program
 */
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // Polimorfisme: membuat objek mantra dengan referensi bertipe MantraAbstrak
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        // Mengeksekusi method untuk mantra1 (Expelliarmus)
        mantra1.ucapkan();
        mantra1.efek();

        // Mengeksekusi method untuk mantra2 (ExpectoPatronum)
        mantra2.ucapkan();
        mantra2.efek();

        // Mengeksekusi method untuk mantra3 (Lumos)
        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*
Pertanyaan:

1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Terjadi Error saat Kompilasi (Compile-time Error).
Contoh Uji Coba Kode:
java
MantraAbstrak mantra = new MantraAbstrak("Lumos"); // Error!

Penjelasan Error:Compiler Java akan mengeluarkan pesan kesalahan seperti:
MantraAbstrak is abstract; cannot be instantiated
Hal ini terjadi karena abstract class merupakan kelas yang belum lengkap (memiliki abstract method tanpa bodi seperti efek()).
Java sengaja melarang pembuatan objek dari kelas abstrak untuk mencegah eksekusi method yang belum ada implementasinya.

2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
Menerapkan Standar / Cetakan Dasar (Blueprint):Memastikan semua subclass memiliki struktur dan method wajib yang sama 
(misalnya setiap mantra wajib memiliki cara kerja efek() masing-masing).
Mencegah Duplikasi Kode (Code Reusability*): Kode atau atribut umum (seperti atribut nama dan method ucapkan()) 
cukup ditulis sekali di *abstract class* dan otomatis diwarisi oleh seluruh subclass.
Mendukung Polimorfisme: Memungkinkan pembuatan *collection* atau referensi dengan tipe superclass 
(seperti List<MantraAbstrak>), sehingga pengelolaan berbagai jenis objek mantra menjadi lebih rapi dan fleksibel.
Meningkatkan Keamanan Arsitektur Kode: Mencegah developer membuat objek generik yang tidak spesifik atau belum lengkap di dalam sistem.
*/
