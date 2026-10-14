/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B;

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

// Membuat class dengan nama GanjilGenap
public class GanjilGenap {

    // Method utama yang pertama kali dijalankan oleh program
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan bilangan: ");

        // Menyimpan bilangan yang dimasukkan ke dalam variabel bilangan
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan habis dibagi 2
        if (bilangan % 2 == 0) {

            // Jika sisa pembagian adalah 0, maka bilangan tersebut genap
            System.out.println(bilangan + " adalah bilangan Genap");

        } else {

            // Jika tidak habis dibagi 2, maka bilangan tersebut ganjil
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
