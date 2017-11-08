package john.data;

public class Point3<E extends Number> {
  public E x;
  public E y;
  public E z;
  
  public Point3() {this.x = 0;this.y=0;this.z=0;}
  public Point3(E x,E y,E z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public Point3<E> add(Point3<E> x) {
    this.x += x.x;
    this.y += x.y;
    this.z += x.z;
    return this;
  }
  public Point3<E> sub(Point3<E> n) {
    this.x -= n.x;
    this.y -= n.y;
    this.z -= n.z;
    return this;
  }
  public Point3<E> mul(Point3<E> n) {
    this.x *= n.x;
    this.y *= n.y;
    this.z *= n.z;
  }
  public Point3<E> div(Point3<E> n) {
    this.x /= n.x;
    this.y /= n.y;
    this.z /= n.z;
    return this;
  }
  public Point3<E> mod(Point3<E> n) {
    this.x %= n.x;
    this.y %= n.y;
    this.z %= n.z;
  }
  public Matrix<E> toMatrix() {
    return new Matrix<E>(new String[] {"[0,0]:"+this.x,"[1,0]:"+this.y,"[2,0]:"+this.z});
  }
}
