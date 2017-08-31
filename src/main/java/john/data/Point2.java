package john.data;

public class Point2<E extends Number> {
  public E x;
  public E y;
  public Class type;
  
  public Point2() {
    this.x = (E) 0;
    this.y = (E) 0;
    sto();
  }
  public Point2(E x,E y) {
    this.x = x;
    this.y = y;
    sto();
  }
  private void sto() {
    this.type = x.getClass();
  }
  
  public java.awt.Point toPoint() {
    java.awt.Point p = new java.awt.Point((int) x,(int) y);
  }
  
  public Point2<E> add(Point2<E> b) {
    this.x += b.x;
    this.y += b.y;
    return this;
  }
  public Point2<E> sub(Point2<E> b) {
    this.x -= b.x;
    this.y -= b.y;
    return this;
  }
  public Point2<E> mul(Point2<E> b) {
    this.x *= b.x;
    this.y *= b.y;
    return this;
  }
  public Point2<E> div(Point2<E> b) {
    this.x /= b.x;
    this.y /= b.y;
    return this;
  }
  public Point2<E> mod(Point2<E> b) {
    this.x %= b.x;
    this.y %= b.y;
    return this;
  }
  
  //public Class getType() {
  //  return this.type;
  //}
}
