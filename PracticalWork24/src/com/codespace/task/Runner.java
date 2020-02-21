package com.codespace.task;

import java.util.Arrays;

public class Runner {
    public Shape[] createShapes(){
        return new Shape[]{
            new Rectangle("red", 5, 7),
            new Rectangle("yellow", 3, 5),
            new Rectangle("black", 7, 2),
            new Rectangle("red", 4, 4),
            new Circle("white", 12),
            new Circle("black", 3),
            new Circle("gray", 9),
            new Triangle("blue", 3,4, 5),
            new Triangle("green", 5,6, 8)
        };
    }

    public void view(){
        for (Shape shape : createShapes()){
            System.out.println(shape.toString());
        }
    }

    public void drow(Shape[] shapes){
        for (Shape shape : shapes){
            System.out.println(shape.draw());
        }
    }

    public double getAreaSumm(){
        double areas = 0;
        for (Shape shape : createShapes()){
            areas += shape.calcArea();
        }
        return areas;
    }

    public double getAreaSumm(String shapeName){
        double areas = 0;
        for (Shape shape : createShapes()){
            if (shape.getClass().getSimpleName().equals(shapeName)){
                System.out.println(shape.calcArea());
                areas += shape.calcArea();
            }
        }
        return areas;
    }

    public void run() throws CloneNotSupportedException {
        this.view();
        System.out.printf("Total area shapes = %.2f%n", this.getAreaSumm());
        System.out.println(this.getAreaSumm("Circle"));
        System.out.println("============TASK=1=2==================");
        Shape[] shapes = this.createShapes();
        this.drow(shapes);
        System.out.println("============TASK=1=3==================");
        System.out.println((new Rectangle("black", 2, 4)).compareTo(new Rectangle("red", 5, 3)));
        Arrays.sort(shapes);
        this.drow(shapes);
        System.out.println("============TASK=1=4==================");
        Arrays.sort(shapes, new MyComparatorColor());
        this.drow(shapes);
        System.out.println("============TASK=1=5==================");
        Shape shape1 = new Rectangle("black", 2, 4);
        Shape shape2 = (Shape) shape1.clone();
        if (shape1 != shape2) System.out.println("shape 1 and shape 2 are different objects");
        System.out.println(shape1);
        System.out.println(shape2);
    }

}
