package jogen.game.world.object;

import jogen.game.world.object.GameObject;
import jogen.game.world.object.modifiers.Pocketable;

public class Item extends GameObject implements Pocketable {
  public String description;
  public Character maker;
}
