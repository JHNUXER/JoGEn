package john.graphics;

import java.awt.Point;

import static john.math.Trig.*;

public class Projector {
  public void Project(Mesh m,Camera c,Graphics g) {
    ArrayList<Point> points = new ArrayList<Point>();
    Point3<Double> a = m.position.toPoint(new Double("1.0").getClass());
    Point3<Double> c = c.position.toPoint(new Double("1.0").getClass());
    Angle3 th = c.orientation;
    Point3<Double> e = new Point3<Double>(0.0,0.0,0.0);
    
    Matrix<Double> X = new Matrix<Double>(new String[] {"[0,0]:1","[0,1]:0","[0,2]:0","[1,0]:0","[1,1]:"+cos(th.x),"[1,2]:"+sin(th.x),"[2,0]:0","[2,1]:"+(-sin(th.x)),"[2,2]:"+cos(th.x)});
    Matrix<Double> Y = new Matrix<Double>(new String[] {"[0,0]:"+cos(th.y),"[0,1]:0","[0,2]:"+(-sin(th.y)),"[1,0]:0","[1,1]:1","[1,2]:0","[2,0]:"+sin(th.y),"[2,1]:0","[2,2]:"+cos(th.y)});
    Matrix<Double> Z = new Matrix<Double>(new String[] {"[0,0]:"+cos(th.z),"[0,1]:"+sin(th.z),"[0,2]:0","[1,0]:"+(-sin(th.z)),"[1,1]:"+cos(th.z),"[1,2]:0","[2,0]:0","[2,1]:0","[2,2]:0"});
    Matrix<Double> zzz = a.toMatrix().sub(c.toMatrix());
    Matrix<Double> r = X.mul(Y).mul(Z).mul(zzz);
    
    Vector3 d = new Vector3<Double>(r.get(0,0),r.get(1,0),r.get(2,0));
    Point2<Double> b = new Point2<Double>((e.z/d.z)*d.x-e.x,(e.z/d.z)*d.y-e.y);
    points.add(b.toPoint());
  }
}
