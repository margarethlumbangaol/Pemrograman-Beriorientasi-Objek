/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.encapsulation;

/**
 *
 * @author MARGARETH
 */

public class MainEncapsulation {

    public static void main(String[] args) {

        // Pengujian Account
        Account acc = new Account("Margareth", 500000);

        System.out.println("Saldo awal: " + acc.getBalance());

        acc.setBalance(-100000);

        System.out.println("Saldo setelah perubahan: "
                + acc.getBalance());

        // Pengujian Employee
        Employee employee = new Employee();

        employee.setAge(-5);
        employee.setAge(30);

        System.out.println("Umur employee: "
                + employee.getAge());
    }
}
