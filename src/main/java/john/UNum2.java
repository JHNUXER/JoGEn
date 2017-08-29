public class UNum<E extends Number> extends Number {
  public static final String[] prefixes = {
    "yocto y -24",
    "zepto z -21",
    "atto a -18",
    "femto f -15",
    "pico p -12",
    "nano n -9",
    "micro µ -6",
    "milli m -3",
    "% % 0",
    "kilo k 3",
    "Mega M 6",
    "Giga G 9",
    "Tera T 12",
    "Peta P 15",
    "Exa E 18",
    "Zetta Z 21",
    "Yotta Y 24"
  };

  privae E value;
  private Unit unit;
  public byte prefix;
  
  private int pfndx() {
    return ((int) prefix) + ((prefixes.length - 1) / 2);
  }
  private String pfxls(int n) {
    return prefixes[pfndx()].split(" ")[n];
  }
  public String pfx(boolean full) {
    return pfxls(full?0:1);
  }
  public String toString() {
    return toString(false);
  }
  public String toString(boolean b) {
    return value + pfx(b) + unit.toString(b);
  }
  public short shortValue() {return (short) prefix;}
  public int intValue() {return (int) prefix;}
  public long longValue() {return (long) prefix;}
  public float floatValue() {return (float) prefix;}
  public double doubleValue() {return (double) prefix;}
  public E value() {return value;}
  public UNum<E> setValue(E x) {this.value = x;return this;}
  public UNum<E> add(E x) {this.value += x;doCheck();return this;}
  public UNum<E> sub(E x) {this.value -= x;doCheck();return this;}
  public UNum<E> mul(E x) {this.value *= x;doCheck();return this;}
  public UNum<E> div(E x) {this.value /= x;doCheck();return this;}
  public UNum<E> mod(E x) {this.value %= x;doCheck();return this;}
}
