package ru.kapustin.geometry;

import java.util.Objects;

public class Point implements Cloneable {
    private int x;
    private int y;

    // Конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Сеттеры
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    // Переопределение toString
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }

    // Переопределение метода clone
    @Override
    public Point clone() {
        try {
            return (Point) super.clone(); // Вызов метода клонирования у Object
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }
}
