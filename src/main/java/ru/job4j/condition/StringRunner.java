package ru.job4j.condition;

public class StringRunner {
  public static void main(String[] args) {
    String idea = "I like Java!";
    String newbie = " But I am a newbie. ";
    System.out.println(idea);
    idea += newbie;
    int year = 2022;
    idea += year;
    System.out.println(idea);
  }
}