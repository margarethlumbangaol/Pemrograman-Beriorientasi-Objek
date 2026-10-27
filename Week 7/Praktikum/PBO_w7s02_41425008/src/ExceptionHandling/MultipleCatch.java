/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
class MultipleCatch {
    public static void main(String args[]) {
        int n = args.length;
        int a = 1;
        int c[] = new int[1];
        try {
            if (n == 0)
                a = a / (a - 1);
            else
                c[21] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Ups, seem out we have an Arithmetic "
                    + "Exception here...");
        } catch (Exception e) {
            System.out.println("Let the other exception handler here...");
        }
    }
}

/*
a. Coba eksekusi program tanpa arguments. Catch statement mana yang dieksekusi?
Jawab:
Output:
Ups, seem out we have an Arithmetic Exception here...
BUILD SUCCESSFUL (total time: 0 seconds)

Tanpa argument, catch ArithmeticException yang jalan.

b. Coba eksekusi program dengan sebuah argument. Catch statement mana yang dieksekusi?
Jawab:
Output:
Let the other exception handler here...
BUILD SUCCESSFUL (total time: 0 seconds)

Dengan satu argument, c[21] memicu ArrayIndexOutOfBoundsException, jadi catch Exception yang jalan.

c. Sekarang, ganti ArithmeticException dengan Excception sepeti yang ditunjukkan di
bawah ini:
Apa yang terjadi? Mengapa? Jelaskan
Output:
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - exception java.lang.ArithmeticException has already been caught
	at ExceptionHandling.MultipleCatch.main(MultipleCatch.java:1)
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 2 seconds)

Compile error: exception ArithmeticException has already been caught.
Catch yang lebih spesifik harus ditulis sebelum yang lebih umum
*/
