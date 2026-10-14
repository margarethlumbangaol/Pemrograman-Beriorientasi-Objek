/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overloading;

/**
 *
 * @author MARGARETH
 */

/*
Nama : Margareth Lumban Gaol
NIM  : 41425008
*/

import java.util.*;

public class Mantra {
    
    // Method ucapkan() dengan satu parameter
    // Menampilkan nama mantra yang diucapkan tanpa informasi kekuatan atau target
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload: method ucapkan() dengan dua parameter (String, String)
    // Menampilkan nama mantra yang ditujukan langsung ke target tertentu tanpa nilai kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: Mantra diarahkan tepat ke " + target + "!");
    }

    // Overload: method ucapkan() dengan dua parameter (String, int)
    // Menampilkan nama mantra beserta kekuatannya, lalu menentukan efek berdasarkan nilai kekuatan
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        
        // Cek kondisi kekuatan: jika lebih dari 10, efeknya lawan terlempar
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            // Jika kekuatan 10 atau kurang, efeknya hanya melepas senjata lawan
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload: method ucapkan() dengan tiga parameter (String, int, String)
    // Menampilkan nama mantra, kekuatan, dan spesifik target yang dituju
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        
        // Cek kondisi kekuatan untuk menentukan efek spesifik terhadap target
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Method utama (main) untuk menjalankan/mengeksekusi program
    public static void main(String[] args) {
        // Membuat objek 'mantra' dari kelas Mantra
        Mantra mantra = new Mantra();

        // Memanggil method ucapkan() versi 1 parameter (hanya nama mantra)
        mantra.ucapkan("Expelliarmus");

        // Memanggil method ucapkan() versi 2 parameter baru (nama mantra dan target)
        mantra.ucapkan("Expelliarmus", "Malfoy");

        // Memanggil method ucapkan() versi 2 parameter (nama mantra dan nilai kekuatan)
        mantra.ucapkan("Expelliarmus", 5);

        // Memanggil method ucapkan() versi 3 parameter (nama mantra, kekuatan, dan nama target)
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}

/*
Pertanyaan:
1. Apa yang terjadi jika salah satu method overloading dihapus (misalnya method 2 parameter)?
Jika program dipanggil menggunakan argumen yang sesuai dengan method yang dihapus,
compiler akan menampilkan error (compile-time error) karena Java tidak menemukan method yang cocok 
dengan jumlah dan tipe parameter yang diberikan. Namun, jika dalam method main tidak ada kode
yang memanggil versi 2 parameter tersebut, program akan tetap berjalan normal tanpa error.

2. Bisakah membuat method overloading dengan urutan parameter yang berbeda?
Bisa. Java membedakan method overloading berdasarkan parameter signature 
(jumlah, tipe data, atau urutan tipe data parameter). Mengubah urutan tipe data parameter 
(misalnya dari (String, int) menjadi (int, String)) dianggap sebagai method yang berbeda dan valid.
*/