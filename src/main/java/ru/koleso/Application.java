package ru.koleso;

import ru.koleso.impl.Circle;
import ru.koleso.impl.Rectangle;
import ru.koleso.impl.Triangle;
import ru.koleso.multidimensional.Cube;
import ru.koleso.multidimensional.Sphere;
import ru.koleso.utils.GeometryUtils;

public class Application {
    public static void main(String[] args) {
        GeometricShapes circle = new Circle(10.0);
        System.out.printf("Circle area: %.2f\n", circle.getArea());
        System.out.printf("Circle perimeter: %.2f\n\n", circle.getPerimeter());

        GeometricShapes rectangle = new Rectangle(10.0,10.0);
        System.out.printf("Rectangle area: %.2f\n", rectangle.getArea());
        System.out.printf("Rectangle perimeter: %.2f\n\n", rectangle.getPerimeter());

        GeometricShapes triangle = new Triangle(10.0,10.0,10.0);
        System.out.printf("Triangle area: %.2f\n", triangle.getArea());
        System.out.printf("Triangle perimeter: %.2f\n\n", triangle.getPerimeter());

        System.out.printf("Centimeters to meters: %.2f\n", GeometryUtils.centimetersToMeters(100.00));
        System.out.printf("Meters to centimeters: %.2f\n", GeometryUtils.metersToCentimeters(100.00));
        System.out.printf("Have equals area: %s\n", GeometryUtils.haveEqualArea(circle, circle));
        System.out.printf("Large shape are: %.2f\n\n", GeometryUtils.getLargerShape(circle, rectangle).getArea());

        GeometricShapes cube = new Cube(10.0);
        System.out.printf("Cube area: %.2f\n", cube.getArea());
        System.out.printf("Cube perimeter: %.2f\n\n", cube.getPerimeter());

        GeometricShapes sphere = new Sphere(10.0);
        System.out.printf("Sphere area: %.2f\n", sphere.getArea());
        System.out.printf("Sphere perimeter: %.2f\n\n", sphere.getPerimeter());
    }
}
