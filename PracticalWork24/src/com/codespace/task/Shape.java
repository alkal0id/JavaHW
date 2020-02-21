package com.codespace.task;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "class="+ this.getClass().getSimpleName() +" " +
                "color=" + color ;
    }

    @Override
    public String draw() {
        return this.toString()+", area="+this.calcArea()+".";
    }

    @Override
    public int compareTo(Object o) {
//        if (this.calcArea() > ((Shape)o).calcArea()) return 1;
//        if (this.calcArea() < ((Shape)o).calcArea()) return -1;
//        return 0;
        return Double.compare(this.calcArea(), ((Shape)o).calcArea());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();
        shape.color = new String(this.color);
        return shape;
    }
}
