package jogen.game.world.object;

public class ExampleItem extends Item {
  public String name = "Example Item";
  public String description = "Just an example of item code";
  public void take(InventoryEvent e) {
    this.move(e.getActuator.inventory.emptySlot());
  }
  public void give()
}
