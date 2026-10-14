/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author MARGARETH
 */
class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        MahasiswaAktif m1 = new MahasiswaAktif();

        m1.nama = "Dina";
        m1.nim = "123456";
        m1.semester = 5;

        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);

        m1.belajar();
    }
}
