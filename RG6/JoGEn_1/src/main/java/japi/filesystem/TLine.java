package japi.filesystem;

public class TLine {
  public String line;
  public String[] words;
  public String[] characters;
  
  public TLine(String line) {
    this.line = line;
    this.words = line.split(" ");
    this.characters = line.split("");
  }
  
  public String[] wordsAfterFirst() {
    String[] array = new String[this.words.length-1];
    for (int i = 1; i < this.words.length; i++) {
      array[i-1] = this.words[i];
    }
    return array;
  }
}
