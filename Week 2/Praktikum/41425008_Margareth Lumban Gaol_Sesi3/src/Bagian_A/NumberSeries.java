/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;


/**
 *
 * @author MARGARETH
 */

/*
NIM: 41425008
Nama: Margareth Lumban Gaol
Motto: Grow through what you go through
*/

// Mengimpor Scanner agar program bisa menerima input dari keyboard
import java.util.Scanner;

public class NumberSeries {
    
    // Method main adalah bagian utama yang pertama kali dijalankan program
    public static void main(String[] args) {

        // Membuat Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);
        
        // Meminta user menentukan jumlah angka Fibonacci yang ingin ditampilkan
        System.out.print("Masukkan jumlah deret Fibonacci: ");

        // Menyimpan jumlah deret yang dimasukkan pengguna ke variabel n
        int n = scanner.nextInt();
        
        // Generate Fibonacci series
        // Menampilkan judul sebelum deret Fibonacci
        System.out.println("Deret Fibonacci: ");

        // Menentukan dua angka awal Fibonacci, yaitu 0 dan 1
        int a = 0, b = 1;

        // Menggunakan for karena Fibonacci perlu dihitung berulang
        // Perulangan dilakukan sebanyak n kali sesuai jumlah yang diminta pengguna
        for(int i = 0; i < n; i++) {

            // Menampilkan angka Fibonacci saat ini
            System.out.print(a + " ");

            // Menghitung angka Fibonacci berikutnya
            // Angka berikutnya diperoleh dari penjumlahan a dan b
            int next = a + b;

            // Memindahkan nilai b ke a
            // Agar a menjadi angka Fibonacci berikutnya
            a = b;

            // Memindahkan nilai next ke b
            // Agar b menjadi angka yang digunakan pada perhitungan berikutnya
            b = next;
        }

        // Pindah ke baris baru setelah deret Fibonacci selesai ditampilkan
        System.out.println();
        
        // Check prime number
        // Meminta user memasukkan bilangan yang ingin diperiksa
        System.out.print("Masukkan bilangan untuk dicek prima: ");

        // Menyimpan bilangan yang dimasukkan pengguna ke variabel num
        int num = scanner.nextInt();

        // Membuat variabel boolean untuk menentukan apakah bilangan prima
        // Nilai awal true karena bilangan dianggap prima sebelum diperiksa
        boolean isPrime = true;
        
        // Mengecek apakah bilangan kurang dari atau sama dengan 1
        // Bilangan 1, 0, dan bilangan negatif bukan bilangan prima
        if(num <= 1) {

            // Jika num <= 1, maka isPrime diubah menjadi false
            isPrime = false;

        } else {

            // Mengecek apakah num dapat dibagi oleh bilangan lain
            // Dimulai dari 2 sampai akar kuadrat dari num
            // Math.sqrt(num) digunakan agar pengecekan lebih efisien
            for(int i = 2; i <= Math.sqrt(num); i++) {

                // Operator % digunakan untuk melihat sisa pembagian
                // Jika sisanya 0, berarti num memiliki pembagi selain 1 dan dirinya sendiri
                if(num % i == 0) {

                    // Jika memiliki pembagi, berarti num bukan bilangan prima
                    isPrime = false;

                    // Menghentikan perulangan karena sudah ditemukan pembagi
                    break;
                }
            }
        }

        // Menampilkan hasil pengecekan bilangan
        // Jika isPrime true, tampil "adalah bilangan prima"
        // Jika false, tampil "bukan bilangan prima"
        System.out.print(num +
                (isPrime ? " adalah bilangan prima" : " bukan bilangan prima"));
    }
}

/*
Cara mengoptimalkan algoritma Fibonacci untuk jumlah besar
Fibonacci dengan perulangan karena setiap angka dihitung satu kali.
tetapi untuk jumlah yang sangat besar, penggunaan int dapat menyebabkan
overflow sehingga dapat menggunakan long atau tipe data yang lebih besar
*/
