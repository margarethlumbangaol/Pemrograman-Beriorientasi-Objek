/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_A;

/**
 *
 * @author MARGARETH
 */

/*
NIM: 41425008
Nama: Margareth Lumban Gaol
Motto: Grow through what you go through
*/

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

/*
Jika nama yang diinput memiliki lebih dari satu spasi, program tetap dapat 
menerima dan memprosesnya karena nextLine() membaca seluruh baris yang 
dimasukkan, termasuk spasi. Setiap spasi juga akan dihitung sebagai karakter 
oleh length(). Sementara itu, contains(" ") tetap menghasilkan true selama 
terdapat setidaknya satu spasi dalam nama. Jadi, banyaknya spasi tidak 
menyebabkan error, tetapi akan memengaruhi panjang string yang ditampilkan.
*/