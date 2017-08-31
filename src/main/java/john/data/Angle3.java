package john.data;

public class Angle3 extends Point3<Angle> {
  public void doCheck() {
    this.x.doCheck();
    this.y.doCheck();
    this.z.doCkeck();
  }
  
  public Angle3() {
    this(0f,0f,0f);
  }
  public Angle3(Angle x,Angle y,Angle z) {
    this(x.value,y.value,z.value);
  }
  public Angle3(float x,float y,float z) {
    this.x = new Angle(x);
    this.y = new Angle(y);
    this.z = new Angle(z);
    this.type = new Angle(0f).getClass();
  }
  
  public Angle3 add(Angle3 b) {
    this.x.add(b.x);
    this.y.add(b.y);
    this.z.add(b.z);
    return this;
  }
  public Angle3 sub(Angle3 b) {
    this.x.sub(b.x);
    this.y.sub(b.y);
    this.z.sub(b.z);
    return this;
  }
  public Angle3 mul(Angle3 b) {
    this.x.mul(b.x);
    this.y.mul(b.y);
    this.z.mul(b.z);
    return this;
  }
  public Angle3 div(Angle3 b) {
    this.x.div(b.x);
    this.y.div(b.y);
    this.z.div(b.z);
    return this;
  }
  public Angle3 mod(Angle3 b) {
    this.x.mod(b.x);
    this.y.mod(b.y);
    this.z.mod(b.z);
    return this;
}
