/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_C;

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

        input.close();
    }
}

/*
Validasi dilakukan dengan if (r < 0) untuk mengecek apakah jari-jari yang 
dimasukkan bernilai negatif. Jika negatif, program menampilkan pesan error dan
tidak melakukan perhitungan. Jika nilai jari-jari tidak negatif, program akan 
menghitung dan menampilkan luas serta keliling lingkaran.
*/