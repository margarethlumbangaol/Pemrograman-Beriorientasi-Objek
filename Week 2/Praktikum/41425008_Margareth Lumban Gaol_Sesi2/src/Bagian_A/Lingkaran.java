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

public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
    
}

/*
Validasi r < 0 diperlukan karena jari-jari lingkaran tidak mungkin bernilai 
negatif. Dengan validasi ini, program dapat mencegah pengguna memasukkan nilai 
yang tidak masuk akal sehingga perhitungan luas dan keliling tetap benar.
Dalam aplikasi nyata, validasi input sangat penting, misalnya pada aplikasi
perbankan, pendaftaran mahasiswa, kasir, dan sistem kesehatan, agar data yang
dimasukkan sesuai dengan aturan dan tidak menyebabkan kesalahan dalam proses program.
*/