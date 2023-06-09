package com.progra.geometry;

public class ColoredCircle extends Circle {

    private int color;

    public ColoredCircle(int color) {
        super(0, 0, 0);
        this.color = color;
        this.magicNumber = this.magicNumber * 2;
    }

    public void setColor(int color) {
        this.color = color;
    }


}

