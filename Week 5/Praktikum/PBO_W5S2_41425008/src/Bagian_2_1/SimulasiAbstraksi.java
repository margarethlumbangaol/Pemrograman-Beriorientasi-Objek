/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_2_1;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;

    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    public abstract void angkutBarang(String namaBarang);
}

class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                "' ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}

public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("----------------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}


/*
Lembar Analisis Abstraksi:

1. Eksperimen 1:
Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris:

KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

Pertanyaan:
Salin pesan error yang dihasilkan oleh Java. Mengacu pada Kotak Insight Konsep, mengapa Java menggagalkan baris kode ini?

Jawaban:
Java menggagalkan baris kode tersebut karena KendaraanEkspedisi merupakan abstract class. Abstract class tidak dapat digunakan untuk membuat object secara langsung menggunakan keyword new. Object harus dibuat dari class turunan yang mewarisi KendaraanEkspedisi.

2. Eksperimen 2:
Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.

Pertanyaan:
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java untuk mengatasi error tersebut!

Jawaban:
Dua opsi solusi yang biasanya ditawarkan oleh IDE adalah:

1. Implementasikan method angkutBarang() pada class MotorKurir dengan melakukan override terhadap method abstract dari KendaraanEkspedisi.

2. Jadikan class MotorKurir sebagai abstract class dengan menambahkan keyword abstract pada deklarasi class.

Kedua solusi tersebut mengatasi masalah karena class MotorKurir mewarisi method abstract angkutBarang() dari KendaraanEkspedisi tetapi belum memberikan implementasinya.
*/