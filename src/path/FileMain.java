package path;

import java.io.File;

public class FileMain {
    public static void main(String[] args) {
        if (args.length <= 0){
            System.err.println("Please provide file name");
            System.exit(3);
        }

        for( String item: args){
            System.out.printf("Processing %s\n", item);
            File file = new File(item);
            System.out.printf("Path: %s\n",file.getAbsoluteFile());
            System.out.printf("Exist: %s\n",file.exists());
            System.out.printf("Is File: %s\n",file.isFile());
        }


        

    }
}
