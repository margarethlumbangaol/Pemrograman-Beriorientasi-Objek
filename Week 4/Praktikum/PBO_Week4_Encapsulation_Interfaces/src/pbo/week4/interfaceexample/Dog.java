/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.interfaceexample;

/**
 *
 * @author MARGARETH
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof... Woof...");
    }

    @Override
    public void move() {
        System.out.println("Dog runs happily.");
    }
}
