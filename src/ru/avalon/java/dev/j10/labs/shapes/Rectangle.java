package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Shape{
    
   private Point2D a;
   private Point2D b;
   private Point2D c;
   private Point2D d;
   private Point2D center;
   private int rotation;
   
      /**
     * Создание прямоугольника по двум точкам
     *
     */
   public Rectangle(Point2D a, Point2D c){
        this.rotation = randomRotation();
        double radians = Math.toRadians(rotation);// градусов в радианы
        Point2D pointA = a;
        Point2D pointB = new Point2D(Math.abs(c.getX() + a.firstСathetus(c)),
                Math.abs(a.getY() - a.secondСathetus(c)));
        Point2D pointD = new Point2D(Math.abs(a.getX() + c.firstСathetus(a)), 
                Math.abs(c.getY() + a.secondСathetus(c)));
        Point2D pointC = c;
        this.center = getCenterOfGravity(a,c);
        this.a = movePointByAngle(pointA, center, radians); 
        this.b = movePointByAngle(pointB, center, radians);
        this.c = movePointByAngle(pointC, center, radians);
        this.d = movePointByAngle(pointD, center, radians);
   }
    @Override
    public float getArea() {
        return a.distanceTo(b)* b.distanceTo(c);
    }   
    /**
    @return  Возвращает угол
    */
    public int getRotation() { 
        return rotation;
    }
    /**
    @return  Возвращает точку центра тяжести прямоугольника
    */
    public Point2D getCenterOfGravity(Point2D a, Point2D c){
       return new Point2D((a.getX() + c.getX()) / 2,(a.getY() + c.getY()) / 2);
    }
    
}
