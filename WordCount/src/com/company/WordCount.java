import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount{

    public static void main(String[] args) {
    File file = new File("warranty.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int words = 0;
    while(scanner.hasNextLine()) {

        String line = scanner.nextLine();
        words += line.split(" ").length;
    }
    System.out.println("Numbers of words in file "  + words);
    }
}
