import java.util.Scanner;
import java.io.*;

public class Like_wise_adding{

    Scanner SC =new Scanner(System.in);
    Scanner SCAN =new Scanner(System.in);

   void Like_wise_addin(){

          //will show types
          System.out.println("Which type music you wanna to add \n ");
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
         int lineNumber = ans_2;  

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
        System.out.println(" Singers list of which type you selected \n");
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

        System.out.println("Dose your artisi exists here \n");
        System.out.println("1.YES\n2.NO\n"); 
        int decission=0;
        decission=SC.nextInt();

        //1st if 
        if(decission==1){
            System.out.println("Then find and select the singer\n");
            int ans_3=SC.nextInt();

            // will find singer
          
            filePath = (name+".txt");
            lineNumber = ans_3;  

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
             
          }
           catch (IOException e) {
              e.printStackTrace();
          }

          // will show album...

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

          System.out.println("Dose your artisi's Album  exists here \n");
          System.out.println("1.YES\n2.NO\n"); 

          int decission_2=SC.nextInt();

          //2nd if
           if (decission_2==1){
            System.out.println("Then find and select the Album\n");
            int ans_4=SC.nextInt();

            // will find album 
            filePath = (name+".txt");
            lineNumber = ans_4;  

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
             
            }
            catch (IOException e) {
              e.printStackTrace();
            }

          System.out.println("The last song of this album\n");

          //will show the last line 
          filePath = name+".txt";
          String lastLine = "";

           try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
              String line;
              while ((line = br.readLine()) != null) {
                 lastLine = line; // Keep updating with the latest line
             }
              System.out.println("Last song: " + lastLine);
               
          } 
           catch (Exception e) {
              e.printStackTrace();
          }
          System.out.println("Add your song \n");
            //will add songs.....
            Scanner scan=new Scanner(System.in);

            String newline=scan.nextLine();
           
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // `true` enables append mode
            writer.write(newline);
            writer.newLine(); // Write the new content
            System.out.println("Song  appended in the album successfully.\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
          //will creat the song
          System.out.println("Write song details and lyric\n");
          filePath = (newline+".txt");

          Scanner scanner = new Scanner(System.in);
         try (
              FileWriter writer = new FileWriter(filePath, true)) { // `true` enables append mode
 
             System.out.println("Enter lines to write to the file. Type 'exit' to finish:");
             
             while (true) {
                 String inputLine = scanner.nextLine(); // Read a line from the command prompt
                 
                 if ("exit".equalsIgnoreCase(inputLine)) { // Exit condition
                     break;
                 }
                 
                 writer.write(inputLine + System.lineSeparator()); // Write the line and a new line
             }
             
             System.out.println("song written  written successfully to " + filePath);
         } 
         catch (IOException e) {
             e.printStackTrace();
         }
         scan.close();
     }

     //2nd else if
     else if(decission_2==2){
       
        //will add album in singer file 

        System.out.println("Add the album\n");
        filePath = (name+".txt");
        String newline =  SCAN.nextLine();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // `true` enables append mode
        writer.newLine(); // Add a new line
        writer.write(newline); // Write the new content
        System.out.println("album  appended successfully.\n");
      } 
      catch (IOException e) {
         e.printStackTrace();
      }

      //will add song in album file 
      System.out.println("Add the song\n");
         filePath = (newline+".txt");
         newline =  SCAN.nextLine();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // `true` enables append mode
        writer.newLine(); // Add a new line
        writer.write(newline); // Write the new content
        System.out.println("song appended successfully.\n");
      } 
      catch (IOException e) {
         e.printStackTrace();
      }

      //will write song in the song file
      System.out.println("Write song details and lyric\n");
       filePath = (newline+".txt");

      try (Scanner scanner = new Scanner(System.in);
           FileWriter writer = new FileWriter(filePath, true)) { // `true` enables append mode

          System.out.println("Enter lines to write to the file. Type 'exit' to finish:");
          
          while (true) {
              String inputLine = scanner.nextLine(); // Read a line from the command prompt
              
              if ("exit".equalsIgnoreCase(inputLine)) { // Exit condition
                  break;
              }
              
              writer.write(inputLine + System.lineSeparator()); // Write the line and a new line
          }
          
          System.out.println("song written  written successfully to " + filePath);
      } 
      catch (IOException e) {
          e.printStackTrace();
      }


     }

          
    }
    //1st else if
      else if (decission==2){
            System.out.println("Then add singer name\n");

            String  artist = SCAN.nextLine();

            //Will add singer name in singer list
            try {
                FileWriter fileWriter = new FileWriter( name+".txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(artist);
                bufferedWriter.newLine();
                bufferedWriter.close();
                System.out.println("Singer added successfully\n");
                 
              }
               catch (IOException e) {
                e.printStackTrace();
              }
              //will add album in singer file 

              System.out.println("Add the album\n");
              filePath = (artist+".txt");
              String newline =  SCAN.nextLine();

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // `true` enables append mode
              writer.write(newline); // Write the new content
              writer.newLine(); // Add a new line
              System.out.println("album  appended successfully.\n");
            } 
            catch (IOException e) {
               e.printStackTrace();
            }

            //will add song in album file 
            System.out.println("Add the song\n");
               filePath = (newline+".txt");
               newline =  SCAN.nextLine();

          try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // `true` enables append mode
              writer.write(newline);
              writer.newLine(); // Write the new content
              System.out.println("song appended successfully.\n");
            } 
            catch (IOException e) {
               e.printStackTrace();
            }

            //will write song in the song file
            System.out.println("Write song details and lyric\n");
             filePath = (newline+".txt");

            try (Scanner scanner = new Scanner(System.in);
                 FileWriter writer = new FileWriter(filePath, true)) { // `true` enables append mode
    
                System.out.println("Enter lines to write to the file. Type 'exit' to finish:");
                
                while (true) {
                    String inputLine = scanner.nextLine(); // Read a line from the command prompt
                    
                    if ("exit".equalsIgnoreCase(inputLine)) { // Exit condition
                        break;
                    }
                    
                    writer.write(inputLine + System.lineSeparator()); // Write the line and a new line
                }
                
                System.out.println("song written  written successfully to " + filePath);
            } 
            catch (IOException e) {
                e.printStackTrace();
            }

        }
     SC.close();
     SCAN.close();
    }
    
    

}
