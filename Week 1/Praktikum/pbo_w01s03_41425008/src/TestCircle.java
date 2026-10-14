/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARGARETH
 */

// Test driver program for the Circle class
public class TestCircle {   // Save as "TestCircle.java"
    public static void main(String[] args) {    // Execution entry point
        // Construct an instance of the Cirle class called c1
        circle c1 = new circle(2.0, "blue");    // Use 3rd constructor
        System.out.println("Radius is " + c1.getRadius()    // use dot operator to invoke member methods
                + " Color is " + c1.getColor()
                + " Area is " + c1.getArea());
        
        // Construct another instance of the Circle class called c2
        circle c2 = new circle(2.0);        // Use 2nd constructor
        System.out.println("Radius is " + c2.getRadius()
        + " Color is " + c2.getColor()
        + " Area is " + c2.getArea());
        
        // Construct yet another instance of the circle class called c3
        circle c3 = new circle();           // Use 1st constructor
        System.out.println("Radius is " + c3.getRadius()
        + " Color is " + c3.getColor()
        + " Area is " + c3.getArea());
    }
    
}
