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

public class Main {

    public static void main(String[] args) {

        // Membuat objek SmartLamp dengan tingkat kecerahan sebesar 80%.
        SmartLamp lampu = new SmartLamp(80);

        // Membuat objek SmartAC dengan suhu yang diatur sebesar 22 derajat.
        SmartAC ac = new SmartAC(22);

        // Menyalakan lampu pintar.
        lampu.turnOn();

        // Menghubungkan lampu pintar ke jaringan WiFi.
        // Parameter pertama adalah nama WiFi (SSID),
        // sedangkan parameter kedua adalah alamat IP perangkat.
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        // Menyalakan AC pintar.
        ac.turnOn();

        // Menghubungkan AC pintar ke jaringan WiFi.
        // AC menggunakan IP yang berbeda dari lampu.
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");

        // Mematikan AC pintar.
        ac.turnOff();
    }
}
