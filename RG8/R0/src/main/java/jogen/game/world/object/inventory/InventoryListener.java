package jogen.game.world.object.inventory;

import jogen.game.world.object.inventory.InventoryEvent;

public interface InventoryListener {
  public void inventoryActionPerformed(InventoryEvent e);
}
