package john.geometry;

import java.util.*;

public class Face {
  public ArrayList<Point3D> vertices = new ArrayList<Point3D>();
  public Material material;

  public Face(Point3D[] verts,Material mat) {
    for (int i = 0; i < verts.length; i++) {
      this.vertices.add(verts[i]);
    }
    this.material = mat;
  }
  
  public Point3D[] toPoint3DArray() {
    return vertices.toArray(new Point3D[]);
  }
}
