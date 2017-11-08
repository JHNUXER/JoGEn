public class Mesh extends ArrayList<Face> {
  public int countFaces() {
    return super.size();
  }
  
  @Override
  public double size() {
    double v = 0d;
    for (int i = 0; i < countFaces(); i++) {
      Point3D xxz = get(i).toPoint3DArray();
      for (int j = 0; j < xxz.length; i++) {
        v+ = Math.abs(xxz[j].x) + Math.abs(xxz[j].y) + Math.abs(xxz[j].z);
      }
    }
    return v;
  }
}
