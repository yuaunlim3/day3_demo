package path;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOMain {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        File file = new File(args[0]);
        InputStream fis = new FileInputStream(file);

        DataInputStream dis = new DataInputStream(fis);

        int totalWords = 0;

        while(true){
            String line = dis.readLine();
            System.out.printf(">>> line: %s\n",line);
            if (line == null){
                break;
            }
            String[] words = line.split(" ");
            totalWords += words.length;
        }
        System.out.printf("Total Words: %d" , totalWords);

        //Create Buffer
        //byte[] buffer = new byte[1000];

        //Read file
        //int byteRead = 0;

       // while((byteRead = is.read(buffer)) >= 0 ){
        //    System.out.printf(">>> bytes %d\n", byteRead);
        //}


        //is.close();
        

    }
}
