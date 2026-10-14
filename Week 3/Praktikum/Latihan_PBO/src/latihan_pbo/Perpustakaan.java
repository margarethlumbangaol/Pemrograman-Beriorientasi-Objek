/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pbo;

/**
 *
 * @author MARGARETH
 */
public class Perpustakaan {
    // Atribut
    int idBuku;
    String judulBuku;

    // Constructor
    Perpustakaan(int id, String judul) {
        idBuku = id;
        judulBuku = judul;
    }

    // Method pertama
    void tampilkanBuku() {
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Judul Buku: " + judulBuku);
    }

    // Method kedua
    void pinjamBuku() {
        System.out.println("Buku " + judulBuku + " sedang dipinjam.");
    }

    public static void main(String[] args) {
        // Membuat object sekaligus mengisi data
        Perpustakaan buku1 = new Perpustakaan(101, "Pemrograman Java");

        // Memanggil method
        buku1.tampilkanBuku();
        buku1.pinjamBuku();
    }
}