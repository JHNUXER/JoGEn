package jogen.physics.world.object;

public class PhysicsObject extends GraphicsObject {
  public Velocity velocity;

  public static void physicsTick(PhysicsObject object) {
    object.velocity.tick();
  }
  public void physicsTick() {
    physicsTick(this);
  }
}
