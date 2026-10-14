/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_B_2;

/**
 *
 * @author MARGARETH
 */

/* Nama : Margareth Lumban Gaol
   NIM  : 41425008
   Prodi : D4 TRPL
*/

// Interface yang menjadi aturan untuk class yang dapat
// terhubung ke jaringan WiFi.
public interface Connectable {

    // Method untuk menghubungkan perangkat ke WiFi.
    // Parameter ssid digunakan untuk menyimpan nama jaringan WiFi,
    // sedangkan ipAddress digunakan untuk menyimpan alamat IP perangkat.
    void connectToWifi(String ssid, String ipAddress);
}
