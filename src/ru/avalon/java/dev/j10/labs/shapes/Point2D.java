package ru.avalon.java.dev.j10.labs.shapes;

public class Point2D implements Point{
    
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }  
    public float firstСathetus(Point2D that){
     return this.x - that.x;
    }
    public float secondСathetus(Point2D that){
     return this.y - that.y;
    }        
     /**
     * Возвращает расстояние между точками
     *
     * @return расстояние
     */
    public float distanceTo(Point2D that){
        float a = firstСathetus(that);
        float b = secondСathetus(that);
        return (float)Math.sqrt(a * a + b * b);      
    }
    @Override
    public float getX() {
       return x;
    }
    @Override
    public float getY() {
        return y;
    }
}
