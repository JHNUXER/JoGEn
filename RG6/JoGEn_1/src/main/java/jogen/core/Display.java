package jogen.core;

import javax.swing.*;
import javax.media.j3d.*;

import japi.window.Window;

public final class Display extends Window {
  DisplayPanel panel;        // Panel where the game's Camera will render to.
  JPanel backPanel;
  
  public static void init() {
    panel = new DisplayPanel();
    backPanel = new JPanel();
    setContentPane(backPanel);
    
    setFullScreen(true);
    setTitle("JoGEn");
    setCloser();
    show();
  }
  
  public static void showGUI(JPanel gui) {
    setContentPane(gui);
  }
  
  public static void clear() {
    setContentPane(backPanel);
  }
}
