package com.alpha.work2;

public class Runner {
    Shape[] shapes = {new Rectangle("red", 5, 7),
            new Rectangle("yellow", 3, 5),
            new Rectangle("black", 7, 2),
            new Rectangle("red", 4, 4),
            new Circle("white", 12),
            new Circle("black", 3),
            new Circle("gray", 9),
            new Triangle("blue", 3,4, 5),
            new Triangle("green", 5,6, 8)};

    public double getAreaSumm(){
        double areas = 0;
        for (Shape shape : shapes){
            areas += shape.calcArea();
        }
        return areas;
    }

    public double getAreaSumm(String shapeName){
        double areas = 0;
        for (Shape shape : shapes){
            if (shape.getClass().getSimpleName().equals(shapeName)){
                System.out.println(shape.calcArea());
                areas += shape.calcArea();
            }
        }
        return areas;
    }

    public void run(){
        System.out.println(this.getAreaSumm());
        System.out.println(this.getAreaSumm("Circle"));
    }

}
