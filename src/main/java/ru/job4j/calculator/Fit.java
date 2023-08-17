package ru.job4j.calculator;

public class Fit {

  public static double manWeight(short heightM) {
    double rsl = (heightM - 100) * 1.15;
    return rsl;
  }

  public static double womanWeight(short heightW) {
    double rsl1 = (heightW - 110) * 1.15;
    return rsl1;
  }

  public static void main(String[] args) {
    short heightM = 180;
    short heightW = 170;
    double man = Fit.manWeight(heightM);
    double woman = Fit.womanWeight(heightW);
    System.out.println("Man 180 is " + man);
    System.out.println("Woman 170 is " + woman);
  }
}
