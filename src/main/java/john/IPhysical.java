package john;

public interface IPhysical {
  public Vector3<Double> acceleration();
  public Vector3<Double> velocity();
  public Vector3<Double> force();
  public double density();
  public double volume();
  public double mass();
}
