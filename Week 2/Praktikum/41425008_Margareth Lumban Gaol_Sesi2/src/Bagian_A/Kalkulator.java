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


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

/*
1. Pembagian int perlu di-casting ke double agar hasil pembagian dapat 
menampilkan angka desimal. Jika kedua angka bertipe int, hasil pembagian 
juga berupa bilangan bulat, sehingga angka di belakang koma akan dihilangkan. 
Pada kode ((double) a / b), nilai a diubah menjadi double sehingga hasil
pembagian dapat berupa desimal, misalnya 5 / 2 menjadi 2.5.

2. Jika pembagi b = 0, maka akan terjadi error ArithmeticException: / by zero
karena bilangan tidak bisa dibagi dengan nol. Akibatnya, program akan berhenti 
saat menjalankan operasi pembagian.
*/