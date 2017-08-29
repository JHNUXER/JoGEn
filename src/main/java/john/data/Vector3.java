package john.data;

public class Vector3<E extends Number> extends Point3<E extends Number> {
  public E dot(Vector3<E> b) {  // dot prod
    return this.x*b.x+this.y*b.y+this.z*b.z;
  }
  public Vector3<E> cross(Vector3<E> b) {
    return new Vector3<E>(this.y*b.z-this.z*b.y,this.z*b.x-this.x*b.z,this.x*b.y-this.y*b.x);
  }
}
