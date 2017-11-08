package john.graphics;

public class ParticleSystem {
  private Particle template;
  
  public void setParticleData(Particle p) {
    this.template = p;
  }
  
  public void setParticleData(Color c,BufferedImage texture) {
    this.template.color = c;
    this.template.texture = texture;
  }
}
