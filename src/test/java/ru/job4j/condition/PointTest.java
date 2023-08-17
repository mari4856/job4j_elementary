package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
  @Test
  void when00to20then2() {
    double expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));
  }

  @Test
  void when34to37then3() {
    double expected = 3;
    int x1 = 3;
    int y1 = 4;
    int x2 = 3;
    int y2 = 7;
    double out = Point.distance(x1, y1, x2, y2);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));
  }

  @Test
  void whenMinus12to43then5() {
    double expected = 5.0990195135927845;
    int x1 = -1;
    int y1 = 2;
    int x2 = 4;
    int y2 = 3;
    double out = Point.distance(x1, y1, x2, y2);
    assertThat(out).isEqualTo(expected, withPrecision(0.01));
  }
}
