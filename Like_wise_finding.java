import java.util.Scanner;
import java.io.*;
import javax.sound.sampled.*;

public class Like_wise_finding extends Play_in_like_wise  {
    Scanner SC=new Scanner(System.in);

      void Like_wise_finding()throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        



        //will show types
        System.out.println("Which type music you finding\n ");
        try {
            FileReader fileReader = new FileReader("Type of music.txt");
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
        

         int ans_2=SC.nextInt();

         // will find type
         String name=" ";
         String filePath = "Type of music.txt";
         int lineNumber = ans_2; // Change this to the line number you want to read

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentLine = 0;
            while ((line = br.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    name= line;
                    break;
                }
            }
             
        } catch (IOException e) {
            e.printStackTrace();
        }
        



        //will show artist
        System.out.println("Find your favourite artist  ");
        try {
            FileReader fileReader = new FileReader(name+".txt");
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


        
         int ans_3=SC.nextInt();

         //will find artist
         
         filePath = name+".txt";
         lineNumber = ans_3; // Change this to the line number you want to read

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentLine = 0;
            while ((line = br.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    name=   line;
                    break;
                }
            }
             
        } catch (IOException e) {
            e.printStackTrace();
        }


        // will show album

         System.out.println("Find your favourite album  ");
         try {
             FileReader fileReader = new FileReader(name+".txt");
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
          
           int ans_4=SC.nextInt();

           //will find album

           filePath = name+".txt";
           lineNumber = ans_4; // Change this to the line number you want to read
  
          try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
              String line;
              int currentLine = 0;
              while ((line = br.readLine()) != null) {
                  currentLine++;
                  if (currentLine == lineNumber) {
                      name=   line;
                      break;
                  }
              }
               
          } catch (IOException e) {
              e.printStackTrace();
          }

          // will show songs

         System.out.println("Find your favourite song  ");
         try {
             FileReader fileReader = new FileReader(name+".txt");
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

           int ans_5=SC.nextInt();

            //will find song

            filePath = name+".txt";
            lineNumber = ans_5; // Change this to the line number you want to read
   
           try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
               String line;
               int currentLine = 0;
               while ((line = br.readLine()) != null) {
                   currentLine++;
                   if (currentLine == lineNumber) {
                       name=   line;
                       break;
                   }
               }
                
           } catch (IOException e) {
               e.printStackTrace();
           }

           Play_in_like_wise p=new Play_in_like_wise();
             p.Play(name);
 

    }

}

