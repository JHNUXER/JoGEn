package john.graphics;

import john.math.*;

public class VMT {
  public static Point2<Integer> gpf3dp(Point3<Double> a,Point2<Double> offs) {
    Matrix<Double> scaleMatrix = new Matrix<Double>(3,2);
    scaleMatrix.assign("1,0,0,0,0,1");
    Matrix<Double> coordMatrix = new Matrix<Double>(1,3);
    coordMatrix.assign(a.x+","+a.y+","+a.z);
    Matrix<Double> offsMatrix = new Matrix<Double>(1,2);
    offsMatrix.assign(offs.x,offs.y);

    Matrix<Double> m0 = scaleMatrix.product(coordMatrix);
    m0.add(offsMatrix);
    return new Point2<Integer>(m0);
  }
}
