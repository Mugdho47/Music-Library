import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class MusicLibrary {

  public static void main(String[] args)throws UnsupportedAudioFileException, IOException, LineUnavailableException{

    Scanner SC= new Scanner(System.in);

    System.out.println(" \n  <*><*><*><*><*><*><*><*><*><*><*>\n");
    System.out.println("   Hello user. Welcome to Library \n  ");
    System.out.println("  <*><*><*><*><*><*><*><*><*><*><*>\n");

    int ans=0;

    while(ans!=4){
    System.out.println("\nHow do you would like to find music: ");
    System.out.println("1.Like wise finding");
    System.out.println("2.Direct search with name");
    System.out.println("3.Add Music ");
    System.out.println("4.Exit Library ");

    ans=SC.nextInt();
    
    if(ans==1){

        Like_wise_finding Like=new Like_wise_finding();
        Like.Like_wise_finding();
    }

    else if (ans==2){
        Play_here p=new Play_here();
        p.Play();
    }
    else if(ans==3){
        Like_wise_adding ADD=new Like_wise_adding();
        ADD. Like_wise_addin();

    }
    else if(ans>4){
        System.out.println("Sorry. Wrong respons");
    }

   }
   System.out.println("BYE BYE");
   System.out.println(" \n  <*><*><*><*><*><*><*><*><*><*><*>\n");
   System.out.println("  <*> Hello user. Stay tuned with us <*> \n  ");
   System.out.println("  <*><*><*><*><*><*><*><*><*><*><*>\n");
    
   SC.close();
  
}
}