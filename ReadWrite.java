import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
  public static void main(String[] args) {
    File file = new File("mifiles.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("File created.");
      } else {
        System.out.println("File already exists.");
      }
      FileWriter writer = new FileWriter(file, true);
      writer.write("This is read and write programming\n");
      writer.write("Programming is too hard\n");
      writer.close();
      System.out.println("Written to file.");

      FileReader reader = new FileReader(file);
      BufferedReader br = new BufferedReader(reader);
      String line;
      while ((line = br.readLine()) != null) 
      {
        System.out.println(line);
      }
      br.close();
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
