/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
public class HandlingException {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }
}

/*

2. Handling the Exception
a. Ganti ex dengan ex.getMessage() dan ex.getStackTrace(). Coba juga untuk
mengeksekusi statement ex.printStackTrace() dan lihat apa hasilnya.
Jawab:
- ganti ex dengan ex.getMessage()
Error / by zero
BUILD SUCCESSFUL (total time: 0 seconds)
- ganti ex dengan ex.getStackTrace()
Error [Ljava.lang.StackTraceElement;@10f87f48
BUILD SUCCESSFUL (total time: 0 seconds)
- ganti ex dengan ex.printStackTrace()
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - 'void' type not allowed here
	at ExceptionHandling.HandlingException.main(HandlingException.java:1)
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\ACER\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 2 seconds)

b. Ganti AtirhmeticException dengan Exception. Apa hasilnya? Jelaskan.
Jawab:
Error java.lang.ArithmeticException: / by zero
BUILD SUCCESSFUL (total time: 0 seconds)

Hasilnya sama, karena Exception adalah superclass dari ArithmeticException.

*/
