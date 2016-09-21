package japi.math;

import java.util.Random;

public class JMath {
  public static String rand(String[] values) {
    return values[new Random().nextInt(values.length-1)];
  }
}
