/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.element;

/**
 *
 * @author MARGARETH
 */
public class MainElement {

    public static void main(String[] args) {

        Element oxygen = new Element(
                "Oxygen",
                8,
                "O",
                15.999,
                2,
                16
        );

        System.out.println("Name   : " + oxygen.getName());
        System.out.println("Number : " + oxygen.getNumber());
        System.out.println("Symbol : " + oxygen.getSymbol());
        System.out.println("Mass   : " + oxygen.getMass());
        System.out.println("Period : " + oxygen.getPeriod());
        System.out.println("Group  : " + oxygen.getGroup());
    }
}
