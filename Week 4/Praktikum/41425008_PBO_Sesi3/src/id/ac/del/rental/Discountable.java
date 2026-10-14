/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author MARGARETH
 */

/* Nama : Margareth Lumban Gaol
   NIM : 41425008
   Prodi : D4 TRPL
*/

// Interface yang menjadi aturan untuk class
// yang dapat menghitung jumlah potongan harga (discount).
public interface Discountable {

    // Method untuk menghitung jumlah diskon berdasarkan
    // jumlah atau total pembayaran yang diberikan.
    // Parameter amount berisi jumlah pembayaran sebelum diskon.
    // Method mengembalikan nilai diskon dalam bentuk double.
    double calculateDiscount(double amount);
}
