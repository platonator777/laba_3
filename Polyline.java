package ru.kapustin.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polyline implements Measurable, HasPolygonalChain{
    private List<Point> points;

    protected List<Point> getPoints() {
        return points;
    }

    protected void setPoints(List<Point> points) {
        this.points = points;
    }

    public Polyline() {
        this.points = new ArrayList<>();
    }

    public Polyline(Point[] points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }

    void addPoints(Point[] points) {
        for (Point point : points) {
            this.points.add(point);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Линия [");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void shiftEndPoint(int dx, int dy) {
        if (points.size() > 0) {
            Point lastPoint = points.get(points.size() - 1);
            lastPoint.setX(lastPoint.getX() + dx);
            lastPoint.setY(lastPoint.getY() + dy);
        }
    }

    public double calculateLength() {
        double length = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на идентичность объектов
        if (obj == null || getClass() != obj.getClass()) return false; // Проверка на null и совпадение классов

        Polyline other = (Polyline) obj;

        // Сравнение точек
        if (this.points.size() != other.points.size()) return false; // Если размеры списков точек разные
        for (int i = 0; i < this.points.size(); i++) {
            if (!Objects.equals(this.points.get(i), other.points.get(i))) {
                return false;
            }
        }

        return true; // Если все точки совпадают
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    public Polyline getPolygonalChain() {
        return this;
    }
}


