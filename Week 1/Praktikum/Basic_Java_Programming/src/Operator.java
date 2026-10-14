/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARGARETH
 */
public class Operator {
    // Contoh penggunaan
    int sum = 3 + 4; // 7
    int diff = 10 - 3; // 7
    int prod = 7 * 3; // 21
    double q = 20.0 / 3; // 6.666...
    int r = 7 % 3; // 1
    
    // Compound assignment: +=, -=, *=, /=, %=
    int x = 10;
    x += 5; // x = 15
    
    // Dampak tipe data:
    double d = 10.0/3; // 3.333...
    int i = 10/3; // 3 (truncation)
    
    // pada ekspresi campuran. tipe lebih kecil dipromosikan
    // (mis. int -> double). Math utility:
    double p = Math.pow(2, 3); // 8.0
    double s = Math.sqrt(64); // 8.0
    
    //Operator == != > < >= -> hasil boolean
    int a = 5;
    boolean ok = (a == 5); // true
    
    // operator: && (AND), || (OR), ! (NOT)
    boolean r1 = (5 > 3) && (7 < 10); // true
    boolean r2 = (5 < 3) || (7 < 10); // true
    boolean r3 = !(5 > 3);            // false
    
    // operator Bitwise (untuk integer): & | ^ ~ << >>
    int and = 5 & 3; // 1
    int or = 5 | 3; // 7
    int xor = 5 ^ 3; // 6
    
    
}
