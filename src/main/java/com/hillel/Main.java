package com.hillel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String x = "Hello World!!!";
        System.out.println(x);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.print("Enter first dimension: ");
        Scanner scanner2 = new Scanner(System.in);
        int dim1 = scanner2.nextInt();

        System.out.println(dim1);

        // Arrays.copyOf()
    }
}

enum Size {
    SX,
    XL,
    XXL
}

/*
class Shape {
    public void draw(Graphics g, int x, int y) {}
}
class Circle extends Shape {
    public void draw(Graphics g, float x, float y) {}
    // Circle.draw overloads the inheried Shape.draw
    // -- argument types for 'x' and 'y' are different here.
}

class ShapeFactory {
    public Shape newShape(Integer i) {
        return new Shape();
    }
}
class CircleFactory extends ShapeFactory {
    public Circle newShape(Number i) {
        // your code from the source file
        return new Circle();
    }
}*/
