/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class CreditCardPayment implements PaymentMethod {

    // Menyimpan nomor kartu kredit secara private
    // agar data kartu tidak dapat diakses langsung dari luar class.
    private String cardNumber;

    // Constructor digunakan untuk menerima dan menyimpan nomor kartu kredit
    // ketika objek CreditCardPayment dibuat.
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implementasi method pay() dari interface PaymentMethod.
    // Method ini digunakan untuk memproses pembayaran menggunakan kartu kredit.
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber
                + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }

    // Implementasi method getPaymentDetails() dari interface PaymentMethod.
    // Method ini mengembalikan informasi mengenai metode pembayaran yang digunakan.
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}
