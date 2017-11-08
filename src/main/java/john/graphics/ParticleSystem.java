package john.graphics;

import john.math.Point3D;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class ParticleSystem {
  public Point3D position;
  public Color color;
  public double[] lifetime;
  public BufferedImage texture;
  
  public Particle emit() {
    Particle p = new Particle();
    p.color = this.color;
    p.lifetime = JMath.rand(lifetime[0],lifetime[1]);
    p.texture = this.texture;
  }
}
