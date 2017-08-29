package john.data;

import java.util.HashMap;

public class Unit {
  public String name;
  public Measure measure;
  public String abbrev;
  public HashMap<Unit,Double> conversions = new HashMap<Unit,Double>();
  
  public Unit(Measure measure,String name) {
    this.name = name;
    this.measure = measure;
    this.pfx = ""+name.charAt(0);
  }
  public Unit(Measure measure,String name,String pfx) {
    this.name = name;
    this.measure = measure;
    this.abbrev = pfx;
  }
  
  public String toString() {
    return toString(false);
  }
  public String toString(boolean full) {
    return full?name:abbrev;
  }
}
