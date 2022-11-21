package ru.job4j.condition;

public class Point {
  public static double distance(int x1, int y1, int x2, int y2) {
    double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    return rsl;
  }

  public static void main(String[] args) {
    double result = Point.distance(0, 0, 2, 0);
    System.out.println("result (0, 0) to (2, 0) " + result);
    double resultOne = Point.distance(3, 4, 3, 7);
    System.out.println("result (3, 4) to (3, 7) " + resultOne);
    double resultTwo = Point.distance(-1, 2, 4, 1);
    System.out.println("result (-1, 2) to (4, 1) " + resultTwo);
  }
}
