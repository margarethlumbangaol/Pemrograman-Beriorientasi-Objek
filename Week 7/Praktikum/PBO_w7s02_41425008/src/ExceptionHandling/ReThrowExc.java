/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
class ReThrowExc {
    static void demoThrow() {
        try {
            System.out.println("I'm throwing an exception from demoThrow " 
                    + "method");
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]");
            System.out.println("But I'll throw it again...\n");
            throw e;
        }
    }

    public static void main(String args[]) {
        try {
            demoThrow();
        } catch (NullPointerException e) {
            System.out.println("I'm catching the exception [" + e + "]\n "
                    + "thrown from demoThrow method");
        }
    }
}

/*
a. Apakah exception masih akan ditangkap dari dalam main jika tidak dilempar ulang (rethrown)?
Tidak, jika exception e tidak dilempar kembali (rethrown) dari method demoThrow,
maka exception tersebut tidak akan ditangkap di dalam fungsi main.
Hal ini karena exception tersebut sudah berhasil ditangkap dan diselesaikan di dalam blok catch milik method demoThrow() itu sendiri. 
Tanpa adanya perintah throw e; exception dianggap sudah ditangani secara lokal 
sehingga tidak diteruskan ke fungsi pemanggilnya (main).

b. Apa yang bisa Anda simpulkan dari kode program di atas?
Kesimpulan dari kode program ReThrowExc adalah:
 Program ini mendemonstrasikan konsep rethrowing exception (melempar ulang exception) di Java.
 Suatu exception yang terjadi di dalam sebuah method (demoThrow) dapat ditangkap oleh blok catch lokal untuk melakukan tindakan tertentu 
(seperti mencetak pesan informasi), lalu dilempar kembali ke method pemanggilnya (main) 
menggunakan keyword throw e;.
 Mekanisme ini memungkinkan penanganan exception secara bertingkat atau berlapis, 
di mana method tingkat bawah dapat merespons error terlebih dahulu sebelum menyerahkan
penanganan lanjutan kepada fungsi di level yang lebih tinggi (seperti fungsi main).
*/