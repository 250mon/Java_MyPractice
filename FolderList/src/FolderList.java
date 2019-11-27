import java.io.File;
import java.util.Arrays;

public class FolderList {
    public static void main(String args[]) {

        try {
            String[] dirContents = new File("./").list();
            System.out.println(Arrays.toString(dirContents));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
