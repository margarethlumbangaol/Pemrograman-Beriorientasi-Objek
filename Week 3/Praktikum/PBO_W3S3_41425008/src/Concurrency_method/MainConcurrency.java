/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency_method;

/**
 *
 * @author MARGARETH
 */

class AntreanShared {
    private String data;
    private boolean adaData = false;
    
    // Method untuk memproduksi data
    public synchronized void kirimPesan(String pesan) {
        while (adaData) {
            try {
                // Menunggu hingga pesan sebelumnya diambil/dikonsumsi
                wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
        this.data = pesan;
        this.adaData = true;
        System.out.println("Pesan dikirim: " + pesan);
        
        // Memberitahu thread konsumen bahwa data sudah siap
        notify();
}
    
    // method untuk mengambil data
    public synchronized String ambilPesan() {
        while (!adaData) {
            try {
                // menunggu hingga pesan tersedia
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;
        System.out.println("Pesan diterima: " + data);
        
        // memberitahu thread produsen bahwa tempat sudah kosong
        notify();
        return data;
    }
}
public class MainConcurrency {
    public static void main(String[] args) {
        AntreanShared antrean = new AntreanShared();
        
        // Thread Produsen
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"Halo", "Belajar java", "Selesai"};
            for (String p : listPesan) {
                antrean.kirimPesan(p);
            }
        });
        
        // Thread Konsumen
        Thread konsumen = new Thread(() -> {
        for (int i = 0; i < 3; i++) {
            antrean.ambilPesan();
        }
    });
    
    produsen.start();
    konsumen.start();
    }
}
