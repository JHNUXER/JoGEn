package jogen.game.world.object.inventory;

import java.awt.event.*;

public class InventoryEvent extends EventObject {
  private ItemStack items;
  private Type type;
  
  public InventoryEvent(ItemStack items) {
    this.items = items;
  }
  
  public enum Type {
    PICK_UP,
    DROP,
    MOVE,
    GIVE;
  }
}
