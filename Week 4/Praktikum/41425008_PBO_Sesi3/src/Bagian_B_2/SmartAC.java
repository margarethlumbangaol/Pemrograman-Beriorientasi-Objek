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

// Class SmartAC digunakan untuk membuat objek AC pintar.
// Class ini mengimplementasikan dua interface, yaitu
// Switchable dan Connectable.
public class SmartAC implements Switchable, Connectable {

    // Menyimpan suhu AC.
    // Dibuat private agar tidak dapat diakses langsung dari luar class.
    private int temperature;

    // Menyimpan status AC.
    // true berarti AC menyala, sedangkan false berarti AC mati.
    private boolean isOn;

    // Constructor digunakan untuk membuat objek SmartAC
    // sekaligus menentukan suhu awal AC.
    public SmartAC(int temperature) {
        this.temperature = temperature;

        // Saat objek pertama kali dibuat, AC dalam keadaan mati.
        this.isOn = false;
    }

    // Implementasi method turnOn() dari interface Switchable.
    // Method ini digunakan untuk menyalakan AC.
    @Override
    public void turnOn() {

        // Mengubah status AC menjadi menyala.
        isOn = true;

        // Menampilkan informasi bahwa AC berhasil dinyalakan
        // sesuai dengan suhu yang telah ditentukan.
        System.out.println("[AC Pintar] Dinyalakan pada suhu "
                + temperature + " C");
    }

    // Implementasi method turnOff() dari interface Switchable.
    // Method ini digunakan untuk mematikan AC.
    @Override
    public void turnOff() {

        // Mengubah status AC menjadi mati.
        isOn = false;

        // Menampilkan informasi bahwa AC telah dimatikan.
        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Implementasi method connectToWifi() dari interface Connectable.
    // Method ini digunakan untuk menghubungkan AC ke jaringan WiFi.
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // Mengecek apakah AC sedang dalam keadaan mati.
        if (!isOn) {

            // Jika AC mati, koneksi WiFi tidak dapat dilakukan.
            System.out.println("[Error] AC Pintar harus dinyalakan "
                    + "sebelum terhubung ke WiFi.");

        } else {

            // Jika AC menyala, koneksi WiFi berhasil dilakukan.
            // SSID adalah nama jaringan WiFi dan ipAddress
            // adalah alamat IP perangkat.
            System.out.println("[WiFi Device] Terhubung ke jaringan: "
                    + ssid + " (IP: " + ipAddress + ")");
        }
    }
}