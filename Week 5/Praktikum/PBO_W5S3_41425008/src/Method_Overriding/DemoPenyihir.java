/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

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
Superclass (kelas induk) yang mendefinisikan perilaku dasar seorang penyihir.
 */
class Penyihir {
    // Method standar untuk mengucapkan mantra (dapat di-override oleh subclass)
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

/*
Subclass (kelas anak) yang mewarisi sifat dari Penyihir.
 */
class HarryPotter extends Penyihir {
    // Mengubah (override) implementasi method ucapkanMantra() khusus untuk Harry Potter
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

/*
Subclass lain yang mewarisi sifat dari Penyihir.
 */
class Hermione extends Penyihir {
    // Mengubah (override) implementasi method ucapkanMantra() khusus untuk Hermione
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

/*
Subclass baru yang mewarisi sifat dari Penyihir khusus untuk Ron Weasley.
 */
class RonWeasley extends Penyihir {
    // Mengubah (override) implementasi method ucapkanMantra() sesuai karakteristik Ron (sedikit ragu/tongkat patah)
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan sedikit ragu menggunakan tongkatnya.");
    }
}

/*
Class utama untuk mengeksekusi program dan mendemonstrasikan Polimorfisme.
*/
public class DemoPenyihir {
    public static void main(String[] args) {
        // Polimorfisme: membuat objek HarryPotter, Hermione, dan RonWeasley menggunakan referensi bertipe Penyihir
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();

        // Memanggil method yang sudah di-override sesuai karakteristik masing-masing objek
        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
        penyihir3.ucapkanMantra(); // Output: Ron Weasley mengucapkan mantra dengan sedikit ragu menggunakan tongkatnya.
    }
}

/*
Pertanyaan:

1. Apa yang terjadi jika tidak menggunakan annotation @Override? Apakah kode masih berjalan?
Kode tetap berjalan normal.Penggunaan annotation @Override bersifat opsional bagi compiler.
Selama nama method, tipe data kembalian (return type), dan parameter pada subclass sama persis 
dengan yang ada pada superclass, proses method overriding tetap terjadi.
Risiko tanpa @Override:@Override berfungsi sebagai fitur keamanan/validasi dari compiler.
Jika terdapat salah ketik (typo) pada nama method atau kesalahan parameter di subclass, tanpa @Override
compiler akan menganggapnya sebagai method baru biasa (bukan overriding). Dengan menggunakan @Override,
compiler akan langsung memberi peringatan error jika terjadi kesalahan tersebut.

2. Apa keuntungan menggunakan polimorfisme (polymorphism) dalam contoh ini?
Fleksibilitas dan Kemudahan Pengelolaan Data:Variabel referensi bertipe superclass(Penyihir)
dapat digunakan untuk menampung berbagai objek dari subclass-nya (HarryPotter, Hermione, dan RonWeasley).
Kemudahan Ekspansi Kode (Extensibility):Jika ingin menambahkan karakter penyihir baru 
(misalnya Dumbledore), cukup membuat kelas baru yang menurunkan Penyihir. Struktur pemanggilan di method main 
atau kelas lain tidak perlu diubah secara mendasar.
Penyederhanaan Eksekusi Perilaku (Dynamic Binding):Pemanggilan method yang sama (ucapkanMantra()) 
secara otomatis mengeksekusi perilaku yang spesifik sesuai dengan jenis objek yang ditunjuk secara 
runtime tanpa memerlukan pengondisian manual (if-else atau switch-case).
*/