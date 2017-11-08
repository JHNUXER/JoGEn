package jns;

public class Node extends HashMap<Long,Node> {
  public String name;
  public HashMap<String,Object> metadata;
}
