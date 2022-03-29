package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PointTest {
    @Test
    void ShouldReturnDistanceOfZeroWhenTwoPointsWithSameXAndYCoordinates() {
        Point origin = new Point(0, 0);
        Assertions.assertEquals(0, origin.distance(origin));
    }

    @Test
    void ShouldReturnOneWhenDistanceBetweenOriginAndPointsOnUnitCircle() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        Assertions.assertEquals(1, origin.distance(point1));
        Assertions.assertEquals(1, origin.distance(point2));
    }

    @Test
    void ShouldReturnTwoWhenDistanceBetweenTwoOppositePointsOnUnitCircle() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        Assertions.assertEquals(2, point1.distance(point2));
    }

    @Test
    void ShouldReturnZeroRadiansAwayWhenOriginAndPointOnPositiveXAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        Assertions.assertEquals(0, origin.direction(point1));
        Assertions.assertEquals(0, origin.direction(point2));
    }

    @Test
    void ShouldReturnPiRadiansAwayWhenOriginAndPointOnNegativeXAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        Assertions.assertEquals(Math.PI, origin.direction(point1));
        Assertions.assertEquals(Math.PI, origin.direction(point2));
    }

    @Test
    void ShouldReturnHalfPiRadiansAwayWhenOriginAndPointOnYAxis() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        Assertions.assertEquals(Math.PI / 2, origin.direction(point2));
        Assertions.assertEquals(Math.PI / 2, origin.direction(point1));
    }
}
