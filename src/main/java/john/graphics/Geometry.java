package john.graphics;

public class Geometry extends HashMap<Long,Face> {
  public void add(Face face) {
    super.put((long) super.size(),face);
  }
}
