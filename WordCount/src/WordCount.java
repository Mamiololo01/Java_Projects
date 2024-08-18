import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file= new File("ebook.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("The file contains: " + words +" words.");
    }
}
