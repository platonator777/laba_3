package ru.kapustin.geometry;


public class Triangle extends Shape implements HasPolygonalChain {
    private Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double getArea() {
        // Формула площади треугольника через координаты
        return Math.abs(
                (p1.getX() * (p2.getY() - p3.getY()) +
                        p2.getX() * (p3.getY() - p1.getY()) +
                        p3.getX() * (p1.getY() - p2.getY())) / 2.0);
    }


    public String toString() {
        return "Треугольник с вершинами в " + p1 + ", " + p2 + ", " + p3;
    }

    public Polyline getPolygonalChain() {
        return new Polyline(new Point[]{p1, p2, p3, p1});
    }
}
