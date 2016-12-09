package jogen.game.world;

public class World implements InventoryListener {
  public String name;
  public Player clientPOV;
  
  public ArrayList<Player> players = new ArrayList<Player>();
  public ArrayList<Character> characters = new ArrayList<Character>();
  public ArrayList<Item> items = new ArrayList<Item>();
  public ArrayLIst<GameObject> objects = new ArrayList<GameObject>();
  
  public World(String name) {
    this.name = name;
  }
  
  public void inventoryActionPerformed(InventoryEvent e) {
    
  }
}
