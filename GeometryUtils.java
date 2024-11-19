package ru.kapustin.geometry;

import java.util.ArrayList;
import java.util.List;

public class GeometryUtils {
    public static double calculateTotalLength(List<Measurable> objects) {
        double totalLength = 0.0;
        for (Measurable obj : objects) {
            totalLength += obj.calculateLength();
        }
        return totalLength;
    }

    public static Polyline mergePolygonalChains(List<HasPolygonalChain> objects) {
        List<Point> mergedPoints = new ArrayList<>();
        for (HasPolygonalChain obj : objects) {
            mergedPoints.addAll(obj.getPolygonalChain().getPoints());
        }
        return new Polyline(mergedPoints.toArray(new Point[0]));
    }
}


