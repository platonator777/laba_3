package ru.kapustin.geometry;

public class Square extends Rectangle implements HasPolygonalChain{
    public Square(Point topLeft, int sideLength) {
        super(topLeft, sideLength, sideLength);
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны квадрата должна быть больше 0");
        }
    }

    public Square(int x, int y, int sideLength) {
        this(new Point(x, y), sideLength);
    }


    public Polyline getPolyline() {
        return new Polyline(vertices);
    }

    public String toString() {
        return "Квадрат в точке " + vertices[0] + " со стороной " + width;
    }

    public Polyline getPolygonalChain() {
        return getPolyline();
    }
}
