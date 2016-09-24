// ================================================================
// I just realized this file became depricated some time after I 
// stopped working on my name generator projects. Might be usefull
// for somebody though.
// ----------------------------------------------------------------

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
