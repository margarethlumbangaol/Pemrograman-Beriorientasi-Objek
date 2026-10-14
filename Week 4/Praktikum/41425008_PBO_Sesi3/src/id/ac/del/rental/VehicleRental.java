/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

// Class VehicleRental digunakan untuk menyimpan data
// dan melakukan perhitungan biaya penyewaan kendaraan.
public class VehicleRental {

    // Menyimpan nomor plat kendaraan.
    // public berarti atribut ini dapat diakses dari class lain.
    public String plateNumber;

    // Menyimpan tarif sewa kendaraan per hari.
    // protected dapat diakses oleh class dalam package yang sama
    // atau oleh class turunan (subclass).
    protected double rentalRatePerDay;

    // Menyimpan jumlah hari kendaraan disewa.
    // private berarti hanya dapat diakses langsung dari class VehicleRental.
    private int rentalDays;

    // Menyimpan persentase atau nilai diskon.
    // Karena tidak memiliki access modifier, atribut ini bersifat package-private.
    // Artinya hanya dapat diakses dari class dalam package yang sama.
    double discountRate;

    // Constructor digunakan untuk membuat objek VehicleRental
    // sekaligus mengisi nomor plat dan tarif sewa per hari.
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    // Setter digunakan untuk mengisi atau mengubah jumlah hari penyewaan.
    // Method ini digunakan karena rentalDays dibuat private.
    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    // Method digunakan untuk menghitung total biaya penyewaan
    // setelah dikurangi jumlah diskon.
    // Parameter discount menerima objek yang mengimplementasikan
    // interface Discountable.
    public double getTotalCost(Discountable discount) {

        // Menghitung biaya sewa sebelum diskon.
        // Tarif sewa per hari dikalikan jumlah hari penyewaan.
        double amount = rentalRatePerDay * rentalDays;

        // Menghitung jumlah diskon dengan memanggil
        // method calculateDiscount() dari objek discount.
        double discountAmount = discount.calculateDiscount(amount);

        // Mengembalikan biaya akhir setelah dikurangi diskon.
        return amount - discountAmount;
    }
}
