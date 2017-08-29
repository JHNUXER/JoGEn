package john.graphics;

import java.awt.*;
import java.awt.image.*;

public class ViewRenderer {
  private KViewer viewer;
  
  public BufferedImage render() {
    if (viewer == null || context == null) return;
    BufferedImage img0 = new BufferedImage(viewer.width,viewer.height,BufferedImage.TYPE_INT_ARGB);
    
    return img0;
  }
  
  public ViewRenderer setViewer(KViewer v) {
    this.viewer = v;
    return this;
  }
  public KViewer getViewer() {
    return this.viewer;
  }
}
