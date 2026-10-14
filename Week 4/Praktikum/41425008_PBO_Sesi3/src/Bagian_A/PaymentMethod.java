/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bagian_A;

/**
 *
 * @author MARGARETH
 */

/* Nama : Margareth Lumban Gaol
   NIM  : 41425008
   Prodi : D4 TRPL
*/

// Interface yang menjadi aturan atau kontrak
// untuk semua jenis metode pembayaran.
public interface PaymentMethod {

    // Konstanta biaya transaksi sebesar Rp2.500.
    // Pada interface, variabel secara otomatis bersifat public, static, dan final.
    double TRANSACTION_FEE = 2500.0;

    // Method untuk melakukan pembayaran.
    // Setiap class yang menggunakan interface ini wajib
    // menyediakan implementasi dari method pay().
    void pay(double amount);

    // Method untuk mendapatkan informasi mengenai
    // metode pembayaran yang digunakan.
    String getPaymentDetails();
}
