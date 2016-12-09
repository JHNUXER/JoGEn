public class GameObject extends PhysicsObject {
  public void objectTick(GameObject object) {
    PhysicsObject.physicsTick(object);
  }
}
