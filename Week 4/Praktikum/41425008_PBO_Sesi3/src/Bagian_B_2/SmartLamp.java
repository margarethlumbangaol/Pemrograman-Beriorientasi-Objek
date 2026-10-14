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
   NIM : 41425008
   Prodi : D4 TRPL
*/

// Class SmartLamp digunakan untuk membuat objek lampu pintar.
// Class ini mengimplementasikan dua interface, yaitu
// Switchable dan Connectable.
public class SmartLamp implements Switchable, Connectable {

    // Menyimpan tingkat kecerahan lampu.
    // Dibuat private agar tidak dapat diakses langsung dari luar class.
    private int brightness;

    // Menyimpan status lampu.
    // true berarti lampu menyala, sedangkan false berarti lampu mati.
    private boolean isOn;

    // Constructor digunakan untuk membuat objek SmartLamp
    // sekaligus menentukan tingkat kecerahan awal lampu.
    public SmartLamp(int brightness) {
        this.brightness = brightness;

        // Saat objek pertama kali dibuat, lampu dalam keadaan mati.
        this.isOn = false;
    }

    // Implementasi method turnOn() dari interface Switchable.
    // Method ini digunakan untuk menyalakan lampu.
    @Override
    public void turnOn() {

        // Mengubah status lampu menjadi menyala.
        isOn = true;

        // Menampilkan informasi bahwa lampu berhasil dinyalakan
        // sesuai dengan tingkat kecerahan yang telah ditentukan.
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan "
                + brightness + "%");
    }

    // Implementasi method turnOff() dari interface Switchable.
    // Method ini digunakan untuk mematikan lampu.
    @Override
    public void turnOff() {

        // Mengubah status lampu menjadi mati.
        isOn = false;

        // Menampilkan informasi bahwa lampu telah dimatikan.
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Implementasi method connectToWifi() dari interface Connectable.
    // Method ini digunakan untuk menghubungkan lampu ke jaringan WiFi.
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // Mengecek apakah lampu sedang dalam keadaan mati.
        if (!isOn) {

            // Jika lampu mati, koneksi WiFi tidak dapat dilakukan.
            System.out.println("[Error] Lampu Pintar harus dinyalakan "
                    + "sebelum terhubung ke WiFi.");

        } else {

            // Jika lampu menyala, koneksi WiFi berhasil dilakukan.
            // SSID adalah nama jaringan WiFi dan ipAddress
            // adalah alamat IP perangkat.
            System.out.println("[WiFi Device] Terhubung ke jaringan: "
                    + ssid + " (IP: " + ipAddress + ")");
        }
    }
}
