package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FitTest {

  @Test
  void whenMan180Then92() {
    short in = 180;
    double expected = 92;
    double out = Fit.manWeight(in);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));
  }

  @Test
  void whenWoman170Then69() {
    short in1 = 170;
    double expected1 = 69;
    double out1 = Fit.womanWeight(in1);
    assertThat(out1).isEqualTo(expected1, withPrecision(0.01));
  }
}
