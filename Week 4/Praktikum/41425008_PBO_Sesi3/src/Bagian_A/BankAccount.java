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

public class BankAccount {

    // Menyimpan nomor rekening dan saldo sebagai atribut private
    // agar data tidak dapat diakses atau diubah langsung dari luar class.
    private String accountNumber;
    private double balance;

    // Constructor digunakan untuk membuat objek BankAccount
    // dengan nomor rekening dan saldo awal.
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        // Memastikan saldo awal tidak boleh bernilai negatif.
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            // Jika saldo awal negatif, saldo diatur menjadi 0.
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter untuk mengambil nomor rekening.
    // Method ini tidak menyediakan setter sehingga nomor rekening bersifat read-only.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter untuk mengambil nilai saldo rekening.
    public double getBalance() {
        return balance;
    }

    // Method deposit digunakan untuk menambahkan uang ke saldo rekening.
    public void deposit(double amount) {

        // Memastikan jumlah setoran harus lebih besar dari 0.
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            // Jika jumlah setoran tidak valid, saldo tidak diubah.
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Method withdraw digunakan untuk melakukan penarikan uang.
    public void withdraw(double amount) {

        // Mengecek apakah jumlah penarikan valid.
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");

        // Mengecek apakah saldo mencukupi untuk melakukan penarikan.
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");

        // Jika jumlah valid dan saldo mencukupi, uang dikurangi dari saldo.
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main digunakan untuk menjalankan dan menguji program.
    public static void main(String[] args) {

        // Membuat objek BankAccount dengan nomor rekening ACC-001
        // dan saldo awal sebesar Rp500.000.
        BankAccount acc = new BankAccount("ACC-001", 500000);

        // Mencoba melakukan setoran dengan nilai negatif.
        // Operasi ini akan ditolak karena jumlah setoran harus > 0.
        acc.deposit(-100000);

        // Mencoba menarik Rp700.000.
        // Operasi ditolak karena saldo hanya Rp500.000.
        acc.withdraw(700000);

        // Menarik Rp200.000 karena saldo masih mencukupi.
        // Saldo menjadi Rp300.000.
        acc.withdraw(200000);

        // Menampilkan nomor rekening dan saldo akhir.
        System.out.println("Saldo akhir akun "
                + acc.getAccountNumber()
                + ": Rp"
                + acc.getBalance());
    }
}
