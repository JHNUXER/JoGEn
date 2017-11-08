package john.data2;

public class Variable<E> {
  public String ident;
  public Object value;
  
  public Variable(String ident) {
    this.ident = ident;
  }
  public Variable(String ident,Object value) {
    this.ident = ident;
    this.value = value;
  }
}
