package japi.math;

import java.util.Random;

public class JMath {
  public static int average(int[] values) {
    int sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    return sum / values.length;
  }
  public static float average(float[] values) {
    float sum = 0.0f;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
  }
  public static double average(double[] values) {
    double sum = 0.0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
  }
  public static short average(short[] values) {
    short sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
  }
  public static long average(long[] values) {
    long sum = 0;
    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
  }
  
  public static Object rand(Object[] values) {
    return values[new Random().nextInt(values.length-1)];
  }
  
  public static String rand(String[] values) {
    return values[new Random().nextInt(values.length-1)];
  }
}
