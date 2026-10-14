/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_D;

/**
 *
 * @author MARGARETH
 */

/*
NIM: 41425008
Nama: Margareth Lumban Gaol
Motto: Grow through what you go through
*/

// Mengimpor Scanner untuk menerima input dari pengguna
import java.util.Scanner;

// Membuat class dengan nama PalindromeVokal
public class PalindromeVokal {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah kata
        System.out.print("Masukkan kata: ");

        // Menyimpan kata yang dimasukkan ke dalam variabel kata
        String kata = input.nextLine();

        // Mengecek apakah kata merupakan palindrome

        // Membuat variabel kosong untuk menyimpan kata yang dibalik
        String balik = "";

        // Melakukan perulangan dari karakter terakhir sampai karakter pertama
        for (int i = kata.length() - 1; i >= 0; i--) {

            // Menambahkan setiap karakter ke variabel balik
            balik += kata.charAt(i);
        }

        // Membandingkan kata asli dengan kata yang sudah dibalik
        // equalsIgnoreCase() digunakan agar huruf besar dan kecil dianggap sama
        if (kata.equalsIgnoreCase(balik)) {

            // Jika sama, kata tersebut adalah palindrome
            System.out.println("Kata tersebut adalah palindrome.");

        } else {

            // Jika berbeda, kata tersebut bukan palindrome
            System.out.println("Kata tersebut bukan palindrome.");
        }

        // Menghitung jumlah huruf vokal

        // Membuat variabel untuk menyimpan jumlah huruf vokal
        int jumlahVokal = 0;

        // Mengecek setiap karakter dalam kata
        for (int i = 0; i < kata.length(); i++) {

            // Mengubah karakter menjadi huruf kecil
            char huruf = Character.toLowerCase(kata.charAt(i));

            // Mengecek apakah karakter merupakan huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' ||
                huruf == 'e' || huruf == 'o') {

                // Jika merupakan vokal, jumlahVokal bertambah 1
                jumlahVokal++;
            }
        }

        // Menampilkan jumlah huruf vokal yang ditemukan
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}

/*
Pertama-tama membalik kata menggunakan perulangan for, kemudian 
membandingkan kata asli dengan kata yang sudah dibalik. Jika keduanya sama, 
berarti kata tersebut palindrome. Setelah itu, program memeriksa setiap karakter
dan menghitung karakter yang termasuk huruf vokal (a, i, u, e, o). 
equalsIgnoreCase() digunakan agar perbandingan palindrome tidak membedakan huruf
besar dan kecil.
*/