/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
class UncaughtException {
    public static void main(String args[]) {
        System.out.println(3/0);
    }
}

/* 

1. Uncaught Exception
a. Analisis apa yang akan terjadi ketika program di atas di eksekusi.
Jawab:
3/0 melempar ArithmeticException: / by zero. Exception tidak ditangkap, jadi JVM 
mencetak stack trace dan program berhenti.
b. Apa Outputnya?
Jawab:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.UncaughtException.main(UncaughtException.java:13)
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

*/
