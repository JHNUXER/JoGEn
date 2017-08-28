package john.physics;

import john.data.Vector3D;

public interface IPhysical {
  public double mass();
  public double volume();
  public Vector3D force();
  public double density();
  public Vector3D velocity();
  public Vector3D accelleration();
}
