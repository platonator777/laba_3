package ru.kapustin.main;
import java.util.ArrayList;
import java.util.List;
import ru.kapustin.geometry.*;
import ru.kapustin.structures.Node;

import static java.lang.Integer.parseInt; // Статический импорт для преобразования строки в число
import static java.lang.Math.pow;
public class Main {

    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr); // Преобразование строки X в целое число
        int y = parseInt(yStr); // Преобразование строки Y в целое число
        return pow(x, y);       // Возведение X в степень Y
    }

    public static void main(String[] args) {
        //ЗАДАНИЕ 1

//        Square square = new Square(5, 3, 23);
//        System.out.println(square);
//
//        Polyline polyline = square.getPolyline();
//        System.out.println("Ломаная для углов квадрата: " + polyline);
//
//        System.out.println("Длина ломаной: " + polyline.calculateLength());
//
//        polyline.shiftEndPoint(15, 25);
//        System.out.println("Ломаная после сдвига последней точки: " + polyline);
//
//        System.out.println("Новая длина ломаной: " + polyline.calculateLength());

        //ЗАДАНИЕ 2

//        Node root = new Node();
//
//        root.addValue(3);
//        root.addValue(5);
//        root.addValue(4);
//        root.addValue(7);
//        root.addValue(1);
//        root.addValue(2);
//
//        // Выводим дерево в строковом представлении
//        System.out.println("Дерево: " + root);

//        ЗАДАНИЕ 3
//
//        Point[] points = {new Point(0, 0), new Point(3, 0), new Point(3, 4)};
//        ClosedPolyline closedPolyline = new ClosedPolyline(points);
//
//        System.out.println(closedPolyline);
//        ru.kapustin.geometry.Point[] points1 = {new Point(4, 5),new Point(-1, 0)};
//        closedPolyline.addPoints(points1);
//        System.out.println(closedPolyline);

        //ЗАДАНИЕ 4

//        Shape circle = new Circle(new Point(0, 0), 5);
//        Shape squ = new Square(new Point(0, 0), 4);
//        Shape rectangle = new Rectangle(new Point(0, 0), 4, 6);
//        Shape triangle = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
//
//        ru.kapustin.geometry.Shape[] shapes = {circle, squ, rectangle, triangle};
//        for (ru.kapustin.geometry.Shape shape : shapes) {
//            System.out.println(shape);
//            System.out.println("Площадь: " + shape.getArea());
//        }

        //Задание 6

//        Polyline line1 = new Polyline(new Point[]{
//                new Point(0, 1),
//                new Point(1, 1),
//                new Point(2, 2)
//        });
//
//        Polyline line2 = new Polyline(new Point[]{
//                new Point(0, 1),
//                new Point(1, 1),
//                new Point(2, 2)
//        });
//
//        System.out.println("line1 равно line2: " + line1.equals(line2));

        //ЗАДАНИЕ 7.3

//        if (args.length < 2) {
//            System.out.println("Необходимо передать два числа в качестве аргументов командной строки.");
//            return;
//        }
//
//        try {
//            String xStr = args[0];
//            String yStr = args[1];
//
//            double result = power(xStr, yStr);
//
//            System.out.println("Результат: " + result);
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка: аргументы должны быть целыми числами.");
//        }

        //ЗАДАНИЕ 5.5

//        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
//        Line line2 = new Line(5, 10, 25, 10);
//
//        System.out.println(line1 + ", длина: " + line1.calculateLength());
//        System.out.println(line2 + ", длина: " + line2.calculateLength());
//
//        Point[] points = {new Point(0, 0), new Point(3, 4), new Point(6, 0)};
//        Polyline polyline = new Polyline(points);
//
//        System.out.println(polyline + ", длина: " + polyline.calculateLength());
//
//        List<Measurable> objects = new ArrayList<>();
//        objects.add(line1);
//        objects.add(line2);
//        objects.add(polyline);
//
//        double totalLength = GeometryUtils.calculateTotalLength(objects);
//        System.out.println("Суммарная длина всех объектов: " + totalLength);

        //ЗАДАНИЕ 5.7

        Triangle triangle = new Triangle(new Point(0, 0), new Point(3, 0), new Point(3, 4));
        Square square = new Square(new Point(5, 5), 4);
        Line line = new Line(new Point(10, 10), new Point(15, 15));
        Polyline polyline = new Polyline(new Point[]{new Point(20, 20), new Point(25, 25)});

        List<HasPolygonalChain> objects = new ArrayList<>();
        objects.add(triangle);
        objects.add(square);
        objects.add(line);
        objects.add(polyline);

        Polyline merged = GeometryUtils.mergePolygonalChains(objects);

        System.out.println("Объединенная ломаная: " + merged);

        //ЗАДАНИЕ 8

//        Point original = new Point(5, 10);
//        Point clone = original.clone();
//
//        System.out.println("Оригинал: " + original);
//        System.out.println("Клон: " + clone);
//
//        System.out.println("Сравнение ссылок: " + (original == clone)); // false
//        System.out.println("Сравнение объектов: " + original.equals(clone)); // true
//
//
//        clone.setX(15);
//        System.out.println("Оригинал после изменения клона: " + original);
//        System.out.println("Клон после изменения: " + clone);
    }

}