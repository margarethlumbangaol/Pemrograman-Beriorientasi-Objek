/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week4.element;

/**
 *
 * @author MARGARETH
 */
public class Element {

    private String name;
    private int number;
    private String symbol;
    private double mass;
    private int period;
    private int group;

    public Element(String name, int number, String symbol,
            double mass, int period, int group) {

        this.name = name;
        this.number = number;
        this.symbol = symbol;
        this.mass = mass;
        this.period = period;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getMass() {
        return mass;
    }

    public int getPeriod() {
        return period;
    }

    public int getGroup() {
        return group;
    }
}
