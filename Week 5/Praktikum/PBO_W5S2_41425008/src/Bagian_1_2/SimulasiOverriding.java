/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1_2;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

// Kelas Induk (Parent Class) yang mewakili kurir darat biasa
class KurirReguler {
    protected String nama; // Atribut nama kurir (protected agar dapat diakses subclass)

    // Constructor untuk mengeset nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method pengiriman standar yang nantinya di-override oleh kelas anak
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke alamat " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// Subclass KurirDrone yang mewarisi sifat dari KurirReguler
class KurirDrone extends KurirReguler {
    private String idDrone; // Atribut khusus identifier unit drone

    // Konstruktor menginisialisasi atribut parent via super() dan atribut kelas ini
    public KurirDrone(String nama, String idDrone) {
        super(nama); // Memanggil konstruktor KurirReguler
        this.idDrone = idDrone;
    }

    // Method Overriding: Mengganti perilaku pengiriman khusus untuk drone (jalur udara)
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama + 
                           " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Kelas utama untuk simulasi Method Overriding
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Menginstansiasi objek kurir biasa
        KurirReguler k1 = new KurirReguler("Budi");

        // Polimorfisme: Variabel tipe Parent (KurirReguler) menampung objek Subclass (KurirDrone)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Memanggil kirimBarang() pada k1 -> Mengeksekusi implementasi KurirReguler
        k1.kirimBarang("Jl. Sudirman No. 10");

        // Memanggil kirimBarang() pada k2 -> Mengeksekusi implementasi KurirDrone saat Runtime
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
  Lembar Analisis Overriding:
 
  1. Pada class KurirDrone, hapus atau jadikan komentar baris @Override.
     Kemudian ubah nama method menjadi salah ketik:
     public void kirimbarang(String alamat)
 
     Jawaban:
     Setelah @Override dihapus dan nama method diubah menjadi
     kirimbarang() dengan huruf 'b' kecil, method tersebut tidak lagi
     dianggap sebagai overriding dari method kirimBarang() milik parent.
     Hal ini terjadi karena Java membedakan huruf besar dan huruf kecil
     (case-sensitive).
 
  2. Jalankan SimulasiOverriding.java. Apa output yang tercetak dari
     k2.kirimBarang("Gedung Graha Lt. 5")?
 
     Jawaban:
     Output berubah menjadi method milik class KurirReguler, yaitu:
 
     Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat
     menembus kemacetan.
 
     Hal ini terjadi karena method kirimbarang() yang salah ketik tidak
     menggantikan method kirimBarang() milik parent. Akibatnya, ketika
     k2.kirimBarang() dipanggil, yang digunakan adalah method milik
     KurirReguler.
 
  3. Kembalikan @Override di atas method yang salah ketik, kemudian
     kompilasi ulang. Salin pesan error yang muncul!
 
     Jawaban:
     Compiler akan memberikan pesan error yang menunjukkan bahwa method
     tersebut tidak melakukan override terhadap method dari parent.
     Contoh pesan error:
 
     method does not override or implement a method from a supertype
 
     Error tersebut muncul karena kirimbarang() tidak sama dengan
     kirimBarang(). Perbedaannya hanya huruf 'b', tetapi Java
     memperlakukan keduanya sebagai nama method yang berbeda.
 
  4. Berdasarkan eksperimen di atas, jelaskan fungsi utama @Override
     bagi seorang programmer!
 
     Jawaban:
     @Override berfungsi untuk memberi tahu programmer dan compiler
     bahwa method pada class child dimaksudkan untuk menggantikan
     atau mengubah method yang berasal dari class parent.
     @Override juga membantu menemukan kesalahan penulisan method,
     seperti kesalahan huruf besar dan kecil pada nama method.
*/