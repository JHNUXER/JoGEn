package john.game.object;

import john.geometry.*;
import john.graphics.*;
import john.physics.*;
import john.data.*;

public class GObject implements IPhysical,IIdentity {
  private String sid;
  public Mesh geom;
  private Vector3D force;
  private Vector3D accel;
  private Vector3D veloc;
  private double mass;
  private double volume;
  private double density;

  public GObject(String sid,Mesh geom,Vector3D force,Vector3D accel,Vector3D veloc,double mass,double volume,double density) {
    this.sid = sid;
    this.geom = geom;
    this.force = force;
    this.accel = accel;
    this.veloc = veloc;
    this.mass = mass;
    this.volume = volume;
    this.density = density;
  }

  public String getName() {
    return Locale.get(getSID());
  }
  public String getSID() {
    return sid;
  }
  public Vector3D force() {
    return this.force;
  }
  public Vector3D accelleration() {
    return this.accel;
  }
  public Vector3D velocity() {
    return this.veloc;
  }
  public double mass() {
    return this.mass;
  }
  public double volume() {
    return this.volume;
  }
  public double density() {
    return this.density;
  }
}
