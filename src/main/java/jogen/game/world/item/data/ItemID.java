package jogen.game.world.item.data;

public class ItemID {
  public String stringId;
  public String uniqueId;
  
  public boolean compare(ItemID b) {
    return (this.stringId == b.stringId && this.uniqueId == b.uniqueId);
  }
  public static boolean compare(ItemID a, ItemID b) {
    return a.compare(b);
  }
}
