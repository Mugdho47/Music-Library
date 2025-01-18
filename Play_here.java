 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Play_here extends Lyric{


  public void Play() throws UnsupportedAudioFileException, IOException, LineUnavailableException{

  Scanner scanner=new Scanner(System.in);

  //search the song with full name & wav extention 
  System.out.println("search a song: ");
  String search;
  String source;

  source = scanner .nextLine();
  search=(source+".wav");
  File file = new File( search);
  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
  Clip clip = AudioSystem.getClip();
  clip.open(audioStream);
  
  
  //playing process.....
  String response = " ";
  
  // lyric method calling
  Lyric_m(source+".txt");

   while(!response.equals("Q")) {
   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
   System.out.print("Enter your choice: ");
   
   response = scanner.next();
   response = response.toUpperCase();
   
   switch(response) {
    case ("P"): clip.start();
    break;
    case ("S"): clip.stop();
    break;
    case ("R"): clip.setMicrosecondPosition(0);
    break;
    case ("Q"): clip.close();
    break;
    default: System.out.println("Not a valid response");
   }
   
  }
  System.out.println("Byeeee!"); 
 }
}