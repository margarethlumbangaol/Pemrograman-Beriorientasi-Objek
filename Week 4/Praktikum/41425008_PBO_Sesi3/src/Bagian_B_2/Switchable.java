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

// Interface yang menjadi aturan untuk perangkat
// yang dapat dinyalakan dan dimatikan.
public interface Switchable {

    // Method untuk menyalakan perangkat.
    // Class yang mengimplementasikan interface ini
    // wajib menyediakan isi dari method turnOn().
    void turnOn();

    // Method untuk mematikan perangkat.
    // Class yang mengimplementasikan interface ini
    // wajib menyediakan isi dari method turnOff().
    void turnOff();
}
