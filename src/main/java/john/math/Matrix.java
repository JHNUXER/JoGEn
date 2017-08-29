public class Matrix<E extends Number> {
  public E[][] m;
  
  public Matrix(int w,int h) {
    m = new Object[w][h];
  }
  
  public E[][] value() {
    return m;
  }
}
