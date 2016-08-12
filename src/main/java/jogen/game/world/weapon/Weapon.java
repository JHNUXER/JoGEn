package jogen.game.world.weapon;

import jogen.game.world.weapon.data.damage.*;

public abstract class Weapon extends GameObject, Item {
  public Damage damage;
  
  public void swing();
}
