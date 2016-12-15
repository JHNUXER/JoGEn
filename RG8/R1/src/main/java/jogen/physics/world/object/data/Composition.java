package jogen.physics.world.object.data;

import java.util.ArrayList;

import jogen.physics.world.object.data.constituent;

public class Composition {
  public ArrayList<Constituent> constitutents = new ArrayList<Constituent>();
  
  public Composition() {
    
  }
  
  public void add(Constituent c) {
    constituents.add(c);
  }
}
