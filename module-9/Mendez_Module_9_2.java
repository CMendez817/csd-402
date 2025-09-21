//Cameron Mendez
//09/20/2025
//Module-9_2

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Mendez_Module_9_2 {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random rand = new Random();

        try {
            boolean isNewFile = file.createNewFile(); //creates file if it doesn't exist
            FileWriter fw = new FileWriter(file, true); //true for append mode
            for (int i = 0; i < 10; i++) {
                int number = rand.nextInt(100) + 1; //random number 1-100
                fw.write(number + " ");
            }
            fw.close();
            System.out.println("Numbers written to " + (isNewFile ? "new file." : "existing file."));

            //read and display file contents
            Scanner fileReader = new Scanner(file);
            System.out.println("Contents of data.file:");
            while (fileReader.hasNext()) {
                String token = fileReader.next();
                int num = Integer.parseInt(token); //Auto-unboxing from Integer if needed
                System.out.print(num + " ");
            }
            System.out.println();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
