package jogen.game.world.object;

public class GameObject extends PhysicsObject {
  public String name;
  
  public void tick(GameObject object) {
    object.animation.tick();
    object.armature.tick();
    object.geometry.tick();
    object.position.tick();
    object.velocity.tick();
  }
}
