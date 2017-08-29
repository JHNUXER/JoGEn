package john.data;

public class Point3D {
  public double x;
  public double y;
  public double z;

  public Point3D(double x,double y,double z) {
    this.x;this.y;this.z;
  }

  public Vector3D toVector() {
    return new Vector3D(this.x,this.y,this.z);
  }
}
