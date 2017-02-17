public class CharacterWindow extends JFrame implements ActionListener {
  public TabBox tabHolder;
  public CharWindowMenuBar menubar;
  
  public CharacterWindow() {
    this.tabHolder = new TabBox();
    this.menubar = new CharWindowMenuBar();
    
    add(tabHolder);
    
    setJMenuBar(menubar);
    setTilte("New Character");
    pack();
    setResizable(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
  }
  
  public void actionPerformed(ActionEvent e) {
    return;
  }
}
