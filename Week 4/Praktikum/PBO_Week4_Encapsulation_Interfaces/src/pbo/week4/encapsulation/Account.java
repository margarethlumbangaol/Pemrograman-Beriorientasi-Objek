/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.encapsulation;

/**
 *
 * @author MARGARETH
 */

public class Account {

    private String ownerName;
    private double balance;

    public Account(String name, double startingBalance) {
        this.ownerName = name;
        this.balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount!");
        }
    }
}