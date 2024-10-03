import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrownFox1
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("brownfox.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
    }
}
