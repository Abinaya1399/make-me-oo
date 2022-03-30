package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void ShouldReturnZeroWhenDistanceBetweenTwoPointsHavingSameXAndYCoordinatesIsCalculated() {
        Point origin = new Point(0, 0);
        assertEquals(0, origin.distance(origin));
    }

    @Test
    void ShouldReturnOneWhenDistanceBetweenOriginAndPointsOnUnitCircleIsCalculated() {
        Point origin = new Point(0, 0);
        Point fromPoint = new Point(1, 0);
        Point toPoint = new Point(0, 1);

        assertEquals(1, origin.distance(fromPoint));
        assertEquals(1, origin.distance(toPoint));
    }

    @Test
    void ShouldReturnTwoWhenDistanceBetweenTwoOppositePointsOnUnitCircleIsCalculated() {
        Point fromPoint = new Point(1, 0);
        Point toPoint = new Point(-1, 0);

        assertEquals(2, fromPoint.distance(toPoint));
    }

    @Test
    void ShouldReturnZeroWhenDirectionBetweenOriginAndPointOnPositiveXAxisIsCalculated() {
        Point origin = new Point(0, 0);
        Point fromPoint = new Point(1, 0);
        Point toPoint = new Point(3, 0);

        assertEquals(0, origin.direction(fromPoint));
        assertEquals(0, origin.direction(toPoint));
    }

    @Test
    void ShouldReturnPiWhenDirectionBetweenOriginAndPointOnNegativeXAxisIsCalculated() {
        Point origin = new Point(0, 0);
        Point fromPoint = new Point(-1, 0);
        Point toPoint = new Point(-3, 0);

        assertEquals(Math.PI, origin.direction(fromPoint));
        assertEquals(Math.PI, origin.direction(toPoint));
    }

    @Test
    void ShouldReturnHalfPiWhenDirectionBetweenOriginAndPointOnYAxisIsCalculated() {
        Point origin = new Point(0, 0);
        Point fromPoint = new Point(0, 1);
        Point toPoint = new Point(0, 3);

        assertEquals(Math.PI / 2, origin.direction(toPoint));
        assertEquals(Math.PI / 2, origin.direction(fromPoint));
    }
}
