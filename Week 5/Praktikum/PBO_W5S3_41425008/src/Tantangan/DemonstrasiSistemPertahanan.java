/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

import java.util.ArrayList;
import java.util.List;

/*
Class abstrak MantraPerlindungan sebagai cetakan dasar (superclass)
untuk seluruh jenis mantra perlindungan di Hogwarts.
 */
abstract class MantraPerlindungan {
    private String namaMantra;

    // Konstruktor untuk inisialisasi nama mantra
    public MantraPerlindungan(String namaMantra) {
        this.namaMantra = namaMantra;
    }

    // Getter untuk mengambil nama mantra
    public String getNamaMantra() {
        return namaMantra;
    }

    // Abstract method: wajib diimplementasikan oleh setiap subclass
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

/*
Subclass Protego yang mewarisi MantraPerlindungan.
 */
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dihilangkan.");
    }
}

/*
Subclass Fidelius yang membutuhkan seorang Secret Keeper.
 */
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    // Konstruktor menerima nama Secret Keeper
    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan! Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan. Rahasia tidak lagi tersembunyi.");
    }
}

/*
Subclass MantraAntiApparition untuk mencegah Apparition di area Hogwarts.
 */
class MantraAntiApparition extends MantraPerlindungan {
    public MantraAntiApparition() {
        super("Mantra Anti-Apparition");
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif! Penyihir tidak bisa melakukan Apparition di area ini.");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan. Apparition kembali dimungkinkan.");
    }
}

/*
Class SistemPertahanan menampung dan mengelola kumpulan mantra perlindungan.
 */
class SistemPertahanan {
    // List untuk menampung objek-objek MantraPerlindungan
    private List<MantraPerlindungan> daftarMantra;

    // Konstruktor menginisialisasi ArrayList
    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    // Method untuk menambahkan mantra baru ke dalam sistem
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.getNamaMantra() + " berhasil ditambahkan ke Sistem Pertahanan.");
    }

    // Method untuk mengaktifkan seluruh mantra yang terdaftar
    public void aktifkanSemuaMantra() {
        System.out.println("\n--- Mengaktifkan Seluruh Sistem Pertahanan Hogwarts ---");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Method untuk menonaktifkan seluruh mantra yang terdaftar
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n--- Menonaktifkan Seluruh Sistem Pertahanan Hogwarts ---");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

/*
Class utama untuk mendemonstrasikan Sistem Pertahanan Hogwarts.
 */
public class DemonstrasiSistemPertahanan {
    public static void main(String[] args) {
        // Membuat instance Sistem Pertahanan Hogwarts
        SistemPertahanan pertahananHogwarts = new SistemPertahanan();

        // Instansiasi berbagai objek mantra
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition();

        // Menambahkan mantra ke sistem pertahanan
        System.out.println("=== Pendaftaran Mantra ===");
        pertahananHogwarts.tambahMantra(protego);
        pertahananHogwarts.tambahMantra(fidelius);
        pertahananHogwarts.tambahMantra(antiApparition);

        // Mengaktifkan seluruh mantra perlindungan
        pertahananHogwarts.aktifkanSemuaMantra();

        // Menonaktifkan seluruh mantra perlindungan
        pertahananHogwarts.nonaktifkanSemuaMantra();
    }
}
