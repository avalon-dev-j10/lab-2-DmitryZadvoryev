package ru.avalon.java.dev.j10.labs.shapes;
import java.util.Random;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
    private Point2D a;
    private Point2D b;
    

    public Circle(Point2D a, Point2D b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public float getLength() {
       return (float) a.distanceTo(b);
    }
    @Override
    public float getArea() {
        return (float)Math.PI * getLength()*getLength();
    }
    @Override
    public int getRotation() {
        return 0;
    }
    /**
     * Возвращает точку центра окружности
     *
     * @return центр окружности
     */
    public Point2D getCenterOfGravity() {
       return a;
    }
}
