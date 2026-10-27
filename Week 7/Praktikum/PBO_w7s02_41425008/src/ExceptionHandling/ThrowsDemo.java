/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
class ThrowsDemo {
    static void throwOne() {
        System.out.println("I'm throwing a non Runtime exception that I "
                + "don't handle");
        System.out.println("Without specifying in method declaration");
        throw new IllegalAccesException("demo");
    }

    public static void main (String args[]){
        throwOne();
    }
}


/*
a. Apa yang akan terjadi jika kode program di atas dieksekusi? Mengapa?
Jawab:
Kode asli tidak bisa dikompilasi. Ada typo IllegalAccesException (cannot find symbol).
Setelah typo diperbaiki pun masih error unreported exception, 
karena IllegalAccessException itu checked exception.

b. Apa yang akan terjadi jika IllegalAccessException diganti dengan
ArithmeticException? Mengapa? Perbaiki kode program di atas seperti yang
ditunjukkan di bawah ini:
Jawab:
Dengan ArithmeticException (unchecked) kode bisa dikompilasi, 
tapi saat dijalankan langsung crash. Versi perbaikan memakai throws dan try-catch.
*/