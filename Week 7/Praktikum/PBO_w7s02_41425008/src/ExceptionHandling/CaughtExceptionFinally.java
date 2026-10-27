/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */
class CaughtExceptionFinally {
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
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        } finally {
            System.out.println("After trying or catching...");
        }
    }
}
    
 /*
 a. Coba eksekusi program di atas tanpa arguments. Apa hasilnya?
Jawab:
Output:
Catching exception: java.lang.ArithmeticException: / by zero
After trying or catching...
BUILD SUCCESSFUL (total time: 0 seconds)
b. Coba eksekusi program di atas dengan arguments. Apa hasilnya?
Jawab:
This will be executed if arguments is not zero
After trying or catching...
BUILD SUCCESSFUL (total time: 0 seconds)
c. Jelaskan kesimpulan Anda dari pertanyaan a dan b setelah menjalankan program.
Jawab:
Tanpa argument, exception tertangkap lalu finally jalan.
Dengan argument, tidak ada exception, tapi finally tetap jalan.
Kesimpulannya, finally selalu dieksekusi.
*/

