package ru.kapustin.geometry;

// Класс ru.kapustin.geometry.Rectangle (Прямоугольник), наследуется от ru.kapustin.geometry.Quadrilateral
public class Rectangle extends Quadrilateral {
    protected int width, height;

    public Rectangle(Point topLeft, int width, int height) {
        super(new Point[]{
                topLeft,
                new Point(topLeft.getX() + width, topLeft.getY()),
                new Point(topLeft.getX() + width, topLeft.getY() - height),
                new Point(topLeft.getX(), topLeft.getY() - height)
        });
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Ширина и высота должны быть больше 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной " + width + " и высотой " + height +
                ", верхний левый угол: " + vertices[0];
    }
}
