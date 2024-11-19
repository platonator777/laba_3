package ru.kapustin.geometry;

import java.util.List;

public class ClosedPolyline extends Polyline {

    public ClosedPolyline() {
        super();
    }

    public ClosedPolyline(Point[] points) {
        super(points);
        ensureClosure();
    }

    public void addPoint(Point point) {
        List<Point> points = getPoints();
        if (points.size() > 0) {
            Point first = points.get(0);
            // Удаляем последнюю точку, если она совпадает с первой (точка замыкания)
            if (points.get(points.size() - 1).getX() == points.get(0).getX() &&
                    points.get(points.size() - 1).getY() == points.get(0).getY()) {
                points.remove(points.size() - 1);
            }
        }
        points.add(point);
        ensureClosure();
    }

    // Переопределяем метод добавления точек
    public void addPoints(Point[] newPoints) {
        List<Point> points = getPoints(); // Получаем список точек через геттер

        if (points.size() > 2) {
            Point first = points.get(0);
            // Удаляем последнюю точку, если она совпадает с первой (точка замыкания)
            if (points.get(points.size() - 1).getX() == points.get(0).getX() &&
                    points.get(points.size() - 1).getY() == points.get(0).getY()) {
                points.remove(points.size() - 1);
            }
        }

        // Добавляем новые точки
        for (Point point : newPoints) {
            points.add(point);
        }
        System.out.println(points);
        setPoints(points);
        // Проверяем и восстанавливаем замыкание
        ensureClosure();
    }

    // Убедимся, что ломаная замкнута
    private void ensureClosure() {
        List<Point> points = getPoints(); // Получаем список точек через геттер

        if (points.size() > 1) {
            Point first = points.get(0);
            Point last = points.get(points.size() - 1);

            // Добавляем точку замыкания, если последняя точка не совпадает с первой
            if (!last.equals(first)) {
                points.add(new Point(first.getX(), first.getY()));
            }
        }
        setPoints(points);
    }




    public String toString() {
        return "Замкнутая " + super.toString();
    }
}
