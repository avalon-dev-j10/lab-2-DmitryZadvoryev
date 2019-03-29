package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Point2D;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import static ru.avalon.java.dev.j10.labs.shapes.RandomPoint.getRandomPoint;


public class Main {

    public static void main(String[] args) {
   
   
        Shape[] shapes = new Shape[10];
        
        shapes[0] = new Circle(getRandomPoint(),getRandomPoint());
        shapes[1] = new Circle(getRandomPoint(),getRandomPoint());
        shapes[2] = new Circle(getRandomPoint(),getRandomPoint());
        shapes[3] = new Rectangle(getRandomPoint(),getRandomPoint());
        shapes[4] = new Rectangle(getRandomPoint(),getRandomPoint());
        shapes[5] = new Rectangle(getRandomPoint(),getRandomPoint());
        shapes[6] = new Triangle(getRandomPoint(),getRandomPoint(),getRandomPoint());
        shapes[7] = new Triangle(getRandomPoint(),getRandomPoint(),getRandomPoint());
        shapes[8] = new Triangle(getRandomPoint(),getRandomPoint(),getRandomPoint());
        shapes[9] = new Circle(getRandomPoint(),getRandomPoint());
       
        float max = maxArea(shapes);
      
    }
    
    public static float maxArea(Shape[] shapes){
        float max = 0;
       
        for (int i = 0; i < shapes.length; i++) {     
            if (shapes[i].getArea() > max){
                max = shapes[i].getArea();           
            }      
        }
        return max;
    } 
  
}
