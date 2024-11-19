package ru.kapustin.geometry;

// Промежуточный класс для четырёхугольников
abstract class Quadrilateral extends Shape {
    protected Point[] vertices;

    public Quadrilateral(Point[] vertices) {
        if (vertices.length != 4) {
            throw new IllegalArgumentException("Четырехугольник должен иметь ровно 4 вершины");
        }
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Четырехугольник с вершинами: " +
                vertices[0] + ", " + vertices[1] + ", " +
                vertices[2] + ", " + vertices[3];
    }
}
