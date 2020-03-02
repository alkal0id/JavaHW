package com.codespace.task3;

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

    public void run(){
        this.view();
        System.out.printf("Total area shapes = %.2f%n", this.getAreaSumm());
        System.out.println(this.getAreaSumm("Circle"));
    }

}
