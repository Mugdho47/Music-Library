import java.io.*;
public class Lyric  {
  String search;
    void Lyric_m(String search) {

      this.search=search;
    try {
      FileReader fileReader = new FileReader(search);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;

      while ((line = bufferedReader.readLine()) != null) {
         System.out.println(line);
     }
   bufferedReader.close();
     }
      catch (IOException e) {
         e.printStackTrace();
    }
  }
}
