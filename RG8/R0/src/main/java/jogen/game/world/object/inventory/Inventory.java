package jogen.game.world.object.inventory;

public class Inventory {
  public String name;
  public InventorySlot[] slots;
  
  public Inventory() {
    this("Unnamed Inventory",36);
  }
  public Inventory(int slots) {
    this("Unnamed Inventory",slots);
  }
  public Inventory(InventorySlot[] slots) {
    this("Unnamed Inventory",slots.length);
    this.slots = slots;
  }
  public Inventory(String name,int slots) {
    this.name = name;
    this.slots = new InventorySlot[slots];
  }
}
