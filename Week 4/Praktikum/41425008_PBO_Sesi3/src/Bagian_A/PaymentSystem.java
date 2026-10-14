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

// Interface yang menjadi aturan untuk semua metode pembayaran.
interface PaymentMethod {
    
    // Konstanta biaya transaksi sebesar Rp2.500.
    // Nilai ini otomatis bersifat public, static, dan final.
    double TRANSACTION_FEE = 2500.0;
    
    // Method untuk melakukan pembayaran.
    // Setiap class yang implements PaymentMethod wajib membuat method ini.
    void pay(double amount);
    
    // Method untuk mendapatkan informasi metode pembayaran
    String getPaymentDetails();
}

// Class EWalletPayment digunakan untuk pembayaran menggunakan E-Wallet.
// Class ini mengikuti aturan dari interface PaymentMethod.
class EWalletPayment implements PaymentMethod {
    
    // Menyimpan nomor telepon yang digunakan pada akun E-Wallet.
    // Dibuat private agar data tidak dapat diakses langsung dari luar class.
    private String phoneNumber;
    
    // Constructor digunakan untuk menerima dan menyimpan nomor telepon E-Wallet.
    public EWalletPayment(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Implementasi method pay() dari interface PaymentMethod.
    // Method ini menghitung total pembayaran dengan menambahkan biaya transaksi.
    @Override
    public void pay(double amount) {
        
        // Menghitung total pembayaran:
        // jumlah pembayaran + biaya transaksi.
        double total = amount + TRANSACTION_FEE;
        
        // Menampilkan jumlah pembayaran, biaya admin, dan total yang harus dibayar.
        System.out.println("(E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }
    
    // Implementasi method getPaymentDetails().
    // Method ini mengembalikan informasi bahwa metode yang digunakan adalah E-Wallet.
    @Override
    public String getPaymentDetails() {
        return "Metode: E-wallet (" + phoneNumber + ")";
    }
}

// Class CreditCardPayment digunakan untuk pembayaran menggunakan kartu kredit.
// Class ini juga mengikuti aturan dari interface PaymentMethod.
class CreditCardPayment implements PaymentMethod {
    
    // Menyimpan nomor kartu kredit secara private
    // agar data kartu tidak dapat diakses langsung dari luar class.
    private String cardNumber;
    
    
     // Constructor digunakan untuk menerima dan menyimpan nomor kartu kredit.
    public CreditCardPayment (String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    // Implementasi method pay() dari interface PaymentMethod.
    // Method ini digunakan untuk memproses pembayaran dengan kartu kredit.
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card " + cardNumber + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }
    
    // Implementasi method getPaymentDetails().
    // Method ini mengembalikan informasi mengenai metode pembayaran.
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

// Class utama yang digunakan untuk menjalankan program.
public class PaymentSystem {
    public static void main(String[] args) 
    {
        
        // Membuat objek EWalletPayment.
        // Variabel payment1 bertipe PaymentMethod,
        // tetapi objek yang dibuat adalah EWalletPayment.
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        
        // Membuat objek CreditCardPayment.
        // Variabel payment2 bertipe PaymentMethod,
        // tetapi objek yang dibuat adalah CreditCardPayment.
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");
        
        // Memanggil method pay() milik EWalletPayment.
        // Pembayaran sebesar Rp50.000 akan ditambah biaya transaksi Rp2.500.
        payment1.pay(50000);
        
        // Memanggil method pay() milik CreditCardPayment.
        // Pembayaran sebesar Rp150.000 diproses menggunakan kartu kredit.
        payment2.pay(150000);
    }
}
