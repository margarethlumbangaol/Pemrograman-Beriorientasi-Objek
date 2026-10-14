/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.interfaceexample;

/**
 *
 * @author MARGARETH
 */
public class MainInterface {

    public static void main(String[] args) {

        Animal a1 = new Cat();

        a1.makeSound();
        a1.move();

        Animal a2 = new Dog();

        a2.makeSound();
        a2.move();
    }
}
