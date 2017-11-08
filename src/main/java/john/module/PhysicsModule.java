public class PhysicsModule extends Module {
  public double mass;
  public Vector3D velocity;
  public Vector3D acceleration;
  public Vector3D netForce;

  public String getModuleType() {
    return "PhysicsBehavior";
  }
}
