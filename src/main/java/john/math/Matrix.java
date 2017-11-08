public class Matrix<E extends Number> {
  public E[][] m;
  
  public Matrix(int w,int h) {
    m = new Object[w][h];
  }
  
  public E[][] value() {
    return m;
  }
  
  public Matrix<E> add(Matrix<E> b) {
    for (int x = 0; x < m.length; x++) {
      for (int y = 0; y < m[x].length; y++) {
        for (int h = 0; h < b.m.length; h++) {
          for (int k = 0; k < b.m[h].length; k++) {
            this.m[x][y] += b.m[h][k];
          }
        }
      }
    }
  }
}
