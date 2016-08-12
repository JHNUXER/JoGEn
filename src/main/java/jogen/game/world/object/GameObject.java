package jogen.game.world.object;

import jogen.game.world.object.data.position.*;
import jogen.game.world.object.data.rotation.*;

public class GameObject {
  public Position position;
  public Rotation rotation;
  public RenderClass render;
  public Composition madeOf;
  
  public float getVelocity() {
    return JMath.avg({this.position.velocity.x, this.position.velocity.y, this.position.velocity.z});
  }
  public float getRotationSpeed() {
    return JMath.avg({this.rotation.velocity.x, this.rotation.velocity.y, this.rotation.velocity.z});
  }
}
