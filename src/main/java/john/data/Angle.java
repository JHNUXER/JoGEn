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
}
