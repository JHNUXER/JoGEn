package japi.filesystem;

import japi.filesystem.*;

public final class LineGetter {
  public static TLine[] get(String[] lines) {
    TLine[] ret = new TLine[lines.length];
    for (int i = 0; i < lines.length; i++) {
      ret[i] = new TLine(lines[i]);
    }
    return ret;
  }
}
