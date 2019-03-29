package ru.avalon.java.dev.j10.labs.shapes;

import java.util.Random;

public class RandomPoint {
    
   /**
 * Возвращает случайную точку со значениями от 0 до 50
 *
 * @return случайная точка
 */

  public static Point2D getRandomPoint(){
      Random r = new Random();
      return new Point2D(r.nextInt(50),r.nextInt(50));
    }
}
   