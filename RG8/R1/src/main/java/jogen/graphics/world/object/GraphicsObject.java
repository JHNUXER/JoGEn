package jogen.graphics.world.object;

public abstract class GraphicsObject {
  public Position position;
  public Rotation rotation;
  public ArrayList<GeometryWithOffset> geometries = new ArrayList<GeometryWithOffset>();
  
  public static void tick(GraphicsObject object) {
    object.position.tick();
    object.rotation.tick();
  }
  public void tick() {
    tick(this);
  }
}
