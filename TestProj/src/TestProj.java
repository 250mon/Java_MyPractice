import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class TestProj {
    public static void main(String args[]) {

        try {
            String[] dirContents = new File("./").list();
            System.out.println(Arrays.toString(dirContents));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        String input = null;
        Path testFilePath = Paths.get("./input_file");
        System.out.println(testFilePath.toAbsolutePath().toString());
        try {
            Scanner inputScanner = new Scanner(testFilePath);
            while (inputScanner.hasNext()) {
                input = inputScanner.next();
            }
        } catch (IOException ex) {
            System.err.println(ex);
            ex.printStackTrace();
        }

        System.out.println(input);
    }
}
