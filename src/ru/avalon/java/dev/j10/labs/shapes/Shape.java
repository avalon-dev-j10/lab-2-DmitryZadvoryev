package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

/**
 * Абстрактное представление о геометрической фигуре.
 * <p>
 * Фигура (от лат. figura) — термин, формально применимый к
 * произвольному множеству точек; тем не менее обычно
 * фигурой называют замкнутые множества на плоскости,
 * которые ограничены конечным числом линий. При этом
 * допускаются вырождения, например: угол, луч и точка
 * считаются геометрическими фигурами.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A4%D0%B8%D0%B3%D1%83%D1%80%D0%B0_(%D0%B3%D0%B5%D0%BE%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%8F)">Фигура (геометрия)</a>
 */
public interface Shape {
      /**
     * Возвращает случайный угол
     *
     * @return угол
     */
     default int randomRotation(){         
        int rotation =  new Random().nextInt(361)+0;
        return rotation;
     }
     
     /**
     * Перемещает точку на заданный угол относительно другой точки
     *
     * @return новая точка
     */
     default Point2D movePointByAngle(Point2D point, Point2D relativePoint, double rad){
        float x = point.getX() - relativePoint.getX();
        float y = point.getY() - relativePoint.getY();
        float x1 = (float) (x * Math.cos(rad) - y * Math.sin(rad));
        float y1 = (float) (x * Math.sin(rad) + y * Math.cos(rad));
        float xEnd = x1 + relativePoint.getX();
        float yEnd  = y1 + relativePoint.getY();
        Point2D rotate = new Point2D(xEnd,yEnd);
        return rotate;
    }
    /**
     * Возвращает площадь фигуры.
     * <p>
     * Площадь плоской фигуры — аддитивная числовая
     * характеристика фигуры, целиком принадлежащей одной
     * плоскости. В простейшем случае, когда фигуру можно
     * разбить на конечное множество единичных квадратов,
     * площадь равна числу квадратов.
     *
     * @return площадь фигуры.
     *
     * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D0%BB%D0%BE%D1%89%D0%B0%D0%B4%D1%8C_%D1%84%D0%B8%D0%B3%D1%83%D1%80%D1%8B">Площадь фигуры</a>
     */
    float getArea();

    /**
     * Возвращает угол поворота фигуры.
     * <p>
     * Угол поворота изменяется в диапазоне от 0 до 360
     * градусов.
     * <p>
     * Если фигура не поддерживает вращение, метод всегда
     * возвращает значение {@code 0}.
     *
     * @return угол поворота фигуры.
     */
   default int getRotation() {
        return 0;
    }
}
