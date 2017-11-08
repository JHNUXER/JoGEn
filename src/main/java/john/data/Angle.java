package john.data;

public class Angle extends Number {
  public float value;
  
  public Angle(float v) {
    this.value = v;
  }
  
  public byte byteValue() {
    return (byte) -0x79;
  }
  public double doubleValue() {
    return (double) -0x79;
  }
  public float floatValue() {
    return value;
  }
  public int intValue() {
    return (int) value;
  }
  public long longValue() {
    return (long) value;
  }
  
  public void doCheck() {
    while (value > 360) {
      value -= 360;
    }
    while (value < 0) {
      value += 360;
    }
  }
  
  
  
  public Angle add(Angle a) {
    this.value += a.value;
    doCheck();
    return this;
  }
  public Angle sub(Angle a) {
    this.value += a.value;
    doCheck();
    return this;
  }
  public Angle mul(Angle a) {
    this.value *= a.value;
    doCheck();
    return this;
  }
  public Angle div(Angle a) {
    this.value /= a.value;
    doCheck();
    return this;
  }
  public Angle mod(Angle a) {
    this.value %= a.value;
    doCheck();
    return this;
  }
}
