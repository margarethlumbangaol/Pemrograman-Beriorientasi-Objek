/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */

class CaughtExceptionFinallyNPE {
    public static void main(String args[]) {
        int n = args.length;
        try {
            if (n == 0) {
                System.out.println(3/n);
                System.out.println("This won't be executed");
            } else {
                System.out.println("This will be executed if "
                        + "arguments is not zero");
            }
        } catch (NullPointerException e) {   // sebelumnya: Exception e
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}

/*
Apa hasilnya?
Jawab:
After trying or catching...
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.CaughtExceptionFinallyNPE.main(CaughtExceptionFinallyNPE.java:17)
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

Jelaskan apa yang terjadi jika sebuah exception tidak memiliki sebuah catch yang cocok?
Jawab:
3/0 melempar ArithmeticException.
Java mencocokkannya dengan catch yang ada. Satu-satunya catch adalah NullPointerException,
padahal ArithmeticException bukan NullPointerException dan bukan turunannya.
Jadi tidak ada yang cocok, dan blok catch dilewati.
Blok finally tetap dijalankan, makanya After trying or catching... tercetak.
Karena exception belum tertangani, ia dilempar naik ke pemanggil method main, yaitu JVM.
JVM mencetak stack trace dan menghentikan program secara abnormal (exit code 1).
sama seperti nomor 1 (uncaught exception).
*/