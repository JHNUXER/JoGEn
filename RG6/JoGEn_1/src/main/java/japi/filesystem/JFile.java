package japi.filesystem;

import java.io.*;

import japi.filesystem.TLine;

public class JFile {
  public String path;
  
  public JFile(String path) {
    this.path = path;
  }
  
  public int lines() {
    BufferedReader reader = new BufferedReader(new FileReader(path));
    int lines = 0;
    while (reader.readLine() != null) lines++;
    reader.close();
    return lines;
  }
  
  public static int lines(JFile file) {
    return file.lines();
  }
  
  public static int lines(String file) {
    return new JFile(file).lines();
  }
  
  public String[] read() {
    String line = null;
    ArrayList<String> tLines = new ArrayList<String>();
    String[] lines;
    
    try {
      FileReader readerA = new FileReader(path);
      BufferedReader reader = new BufferedReader(readerA);
      while((line = bufferedReader.readLine()) != null) {
        tLines.add(line);
      }
      reader.close();
      lines = new String[tLines.size()];
      for (int i = 0; i < lines.length; i++) {
        lines[i] = tLines.get(i);
      }
      return lines;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static String[] read(JFile file) {
    return file.read();
  }
  public static String[] read(String file) {
    return new JFile(file).read();
  }
  
  public TLine[] readTLines() {
    String[] aLines = read();
    TLine[] tLines = new TLine[aLines.length];
    for (int i = 0; i < aLines.length; i++) {
      tLines[i] = new TLine(aLines[i]);
    }
    return tLines;
  }
  
  public static TLine[] readTLines(JFile file) {
    return file.readTLines();
  }
  
  public static TLine[] readTLines(String file) {
    return new JFile(file).readTLines();
  }
  
  public void write(String[] lines) {
    try {
      FileWriter fWriter = new FileWriter(path);
      BufferedWriter writer = new BufferedWriter(fWriter);
      for (int i = 0; i < lines.length; i++) {
        writer.write(lines[i] + "\n");
      }
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static void write(JFile file, String[] lines) {
    file.write(lines);
  }
  public static void write(String file, String[] lines) {
    write(new JFile(file), lines);
  }
}
