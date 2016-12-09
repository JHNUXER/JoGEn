package jogen.game.world.object.inventory;

public class SuperGiveEvent extends InventoryEvent {
  private Player actuator;
  private Player recipient;

  public SuperGiveEvent(ItemStack items,Player actuator,Player recipient) {
    super(items);
    this.actuator = actuator;
    this.recipient = recipient;
  }
  
  public Player getActuator() {
    return actuator;
  }
  public Player getRecipient() {
    return recipient;
  }
  public ItemStack getItems() {
    return items;
  }
}
