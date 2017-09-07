package ru.stqa.pft.sendbox;

/**
 * Created by tw on 17.08.2017.
 */
public class Square {
    public double l;

    public Square(double l) {
        this.l = l;
    }

    public double area(){
        return this.l*this.l;
    }
}
