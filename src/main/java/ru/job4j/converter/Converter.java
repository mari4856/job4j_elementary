package ru.job4j.converter;

public class Converter {

  public static float rubleToEuro(float value) {
    float rsl = value / 100;
    return rsl;
  }

  public static float rubleToDollar(float value) {
    float rsl = value / 90;
    return rsl;
  }

  public static void main(String[] args) {
    float inOne = 200;
    float inTwo = 180;
    float expectedOne = 2;
    float expectedTwo = 2;
    float outOne = Converter.rubleToEuro(inOne);
    float outTwo = Converter.rubleToDollar(inTwo);
    boolean passedOne = expectedOne == outOne;
    boolean passedTwo = expectedTwo == outTwo;
    System.out.println("200 rubles are 2. Test result : " + passedOne);
    System.out.println("180 rubles are 2. Test result : " + passedTwo);
  }
}
