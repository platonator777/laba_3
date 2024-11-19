package ru.kapustin.geometry;

public class Line implements Measurable, HasPolygonalChain {
    private Point start;
    private Point end;

    // Конструктор с точками
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор с координатами
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public String toString() {
        return "Линия [начало=" + start + ", конец=" + end + "]";
    }

    public Polyline getPolygonalChain() {
        return new Polyline(new Point[]{start, end});
    }
}

