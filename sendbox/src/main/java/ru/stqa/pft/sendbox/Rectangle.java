package ru.stqa.pft.sendbox;

/**
 * Created by tw on 17.08.2017.
 */
public class Rectangle {
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double a;
    public double b;

    public double area(){
        return this.a*this.b;
    }
}
