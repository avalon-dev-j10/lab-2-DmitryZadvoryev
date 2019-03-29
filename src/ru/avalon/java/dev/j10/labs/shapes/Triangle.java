package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.shapes.RandomPoint;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    
    private Point2D a;
    private Point2D b;
    private Point2D c;
    private Point2D center;
    private int rotation;
     /**
     * Создание треуголька
     *
     */
    public Triangle(Point2D a, Point2D b, Point2D c) {
        this.rotation = randomRotation();
        double radians = Math.toRadians(rotation);
        Point2D pointA = a;
        Point2D pointB = b;
        Point2D pointC = c;
        this.center = getCenterOfGravity(a,b,c);
        this.a = movePointByAngle(pointA, center, radians); 
        this.b = movePointByAngle(pointB, center, radians);
        this.c = movePointByAngle(pointC, center, radians); 
        
    }
    @Override
    public float getArea() {
       return (float) Math.sqrt(getPerimeter() * (getPerimeter()-a.distanceTo(b)) * (getPerimeter()-b.distanceTo(c))*(getPerimeter()-c.distanceTo(a)));
    }
    @Override
    public int getRotation() {
        return rotation;
    }
    
      /**
     * Возвращает центр тяжести фигуры
     *
     * @return центр
     */
    public Point2D getCenterOfGravity(Point2D a, Point2D b, Point2D c) {
      return new Point2D((a.getX()+b.getX()+c.getX()/3), (a.getY()+b.getY()+c.getY())/3);
    }
    @Override
    public float getPerimeter() {
       float perimeter = (a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a))/3;
       return perimeter;
    }
   
}
