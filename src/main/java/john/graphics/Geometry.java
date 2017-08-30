package john.graphics;

import john.data.*;

public interface Geometry {
  public Mesh getMesh();
  public Vector3<Double> position();
  public Vector3<Double> rotation();
  public Vector3<Double> scale();
}
