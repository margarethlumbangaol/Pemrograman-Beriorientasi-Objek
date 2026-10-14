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

public class DataDiri {
    public static void main(String[] args) {
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}


/*
Perbedaan nilai asli double dengan hasil casting int:
Nilai asli double yaitu 165.8 masih menyimpan angka desimal, sedangkan setelah
dilakukan casting ke int menjadi 165 karena tipe int hanya menyimpan bilangan
bulat. Casting (int) tidak membulatkan angka, tetapi hanya menghilangkan angka
di belakang koma. Jadi, nilai `165.8` berubah menjadi 165.
*/

