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

public class GradeSystem {

    // Method main adalah bagian utama yang pertama kali dijalankan program
    public static void main(String[] args) {

        // Membuat Scanner untuk membaca nilai yang dimasukkan pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan 5 nilai mahasiswa
        // Array digunakan karena perlu menyimpan beberapa nilai sekaligus
        double[] grades = new double[5];

        // Variabel total digunakan untuk menyimpan jumlah seluruh nilai
        // Nilai awal dibuat 0 karena belum ada nilai yang dimasukkan
        double total = 0;

        
        // Input Nilai
        // Menggunakan for karena proses memasukkan nilai dilakukan perulangan sebanyak 5 kali
        for(int i = 0; i < 5; i++) {

            // Menampilkan nomor nilai yang sedang dimasukkan
            // i dimulai dari 0, sehingga digunakan (i + 1) agar tampil mulai dari 1
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");

            // Membaca nilai dari user dengan tipe data double (desimal) dan menyimpannya ke dalam array
            // grades[i] menunjukkan posisi nilai di dalam array
            grades[i] = scanner.nextDouble();

            // Menambahkan nilai yang baru dimasukkan ke total
            // += berarti total lama ditambah dengan nilai yang baru
            total += grades[i];
        }

        
        // Hitung rata-rata
        // Total dibagi 5 karena ada 5 nilai yang dimasukkan
        double average = total / 5;

        // Menampilkan hasil rata-rata nilai
        System.out.println("Rata-rata nilai: " + average);

        
        // Mengkategorikan nilai
        // char digunakan karena grade hanya membutuhkan satu karakter, yaitu A, B, C, D, atau E
        char grade;

        // Menggunakan if untuk mengecek rata-rata dan menentukan grade
        // Jika rata-rata 85 atau lebih, mahasiswa mendapatkan grade A
        if(average >= 85)
            grade = 'A';

        // Jika syarat sebelumnya tidak terpenuhi,
        // program mengecek apakah rata-rata 70 atau lebih
        else if(average >= 70)
            grade = 'B';

        // Jika rata-rata 60 atau lebih, mendapatkan grade C
        else if(average >= 60)
            grade = 'C';

        // Jika rata-rata 50 atau lebih, mendapatkan grade D
        else if(average >= 50)
            grade = 'D';

        // Jika semua kondisi di atas tidak terpenuhi,
        // berarti rata-rata kurang dari 50 sehingga mendapatkan grade E
        else
            grade = 'E';

        // Menampilkan grade yang sudah ditentukan
        System.out.println("Grade: " + grade);

        
        // Menentukan nilai tertinggi dan terendah
        // Nilai pertama dijadikan nilai awal untuk max dan min
        // karena program membutuhkan nilai pembanding terlebih dahulu
        double max = grades[0];
        double min = grades[0];

        // Mengecek nilai mulai dari indeks ke-1
        // Indeks ke-0 sudah digunakan sebagai nilai awal max dan min
        for(int i = 1; i < 5; i++) {

            // Jika nilai saat ini lebih besar dari max,
            // maka nilai tersebut menjadi nilai tertinggi yang baru
            if(grades[i] > max)
                max = grades[i];

            // Jika nilai saat ini lebih kecil dari min,
            // maka nilai tersebut menjadi nilai terendah yang baru
            if(grades[i] < min)
                min = grades[i];
        }

        // Menampilkan nilai tertinggi
        System.out.println("Nilai tertinggi: " + max);

        // Menampilkan nilai terendah
        System.out.println("Nilai terendah: " + min);
    }
}

/*
1. Jika nilai yang diinput di luar rentang 0-100 maka Program tetap menerima nilai 
tersebut karena tidak terdapat validasi untuk membatasi input antara 0 sampai 100.
Misalnya pengguna memasukkan 120, nilai tersebut tetap dimasukkan ke array dan 
ikut dihitung dalam rata-rata. tetapi, hasil rata-rata dan grade bisa menjadi tidak 
sesuai dengan sistem penilaian yang seharusnya

2. Agar jumlahnya dinamis, pengguna dapat diminta menentukan sendiri jumlah
nilai terlebih dahulu. pengguna dapat memasukkan tanpa perlu mengubah kode program
perulangan menggunakan [jumlahNilai] jadi perhitungannya bisa disesuaikan
*/