/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandling;

/**
 *
 * @author MARGARETH
 */

/* Custom exception untuk menangani nilai mahasiswa yang tidak valid */
public class NilaiTidakValidException extends Exception {

    /* Constructor untuk mengirim pesan kesalahan */
    public NilaiTidakValidException(String pesan) {
        super(pesan);
    }
}
