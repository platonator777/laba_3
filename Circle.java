package ru.kapustin.geometry;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с центром в " + center + " и радиусом " + radius;
    }
}
