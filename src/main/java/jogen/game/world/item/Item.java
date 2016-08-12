package jogen.game.world.item;

import jogen.game.world.item.data.ItemID;

public class Item {
  public String name;
  public ItemID id;
  public String description;
  
  public boolean compare(Item b) {
    return ItemID.compare(this.id, b.id);
  }
  public boolean compare(Item a, Item b) {
    return ItemID.compare(a.id, b.id);
  }
}
