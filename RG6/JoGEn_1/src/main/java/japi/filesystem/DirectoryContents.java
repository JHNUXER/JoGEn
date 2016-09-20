package japi.filesystem;

import java.io.File;

public class DirectoryContents {
  public ArrayList<File> directories = new ArrayList<File>();
  public ArrayList<File> files = new ArrayList<File>();
  
  public DirectoryContents(JFile file) {
    try {
      if (!new File(file.path).isDirectory()) {
        throw new Exeption("Folder (Directory) expected, Got File.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    File[] fileList = file.listFiles();
    
    for (int i = 0; i < fileList.length; i++) {
      if (fileList[i].isFile()) {
        files.add(fileList[i]);
      } else if (fileList[i].isDirectory()) {
        directories.add(fileList[i]);
      }
    }
  }
  public DirectoryContents(String file) {
    try {
      if (!new File(file).isDirectory()) {
        throw new Exeption("Folder (Directory) expected, Got File.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    File[] fileList = new File(file).listFiles();
    
    for (int i = 0; i < fileList.length; i++) {
      if (fileList[i].isFile()) {
        files.add(fileList[i]);
      } else if (fileList[i].isDirectory()) {
        directories.add(fileList[i]);
      }
    }
  }
  
  public int getSpaceConsumed() {
    int j = 0;
    for (int i = 0; i < files.length; i++) {
      j += files.get(i).getTotalSpace();
    }
  }
}
