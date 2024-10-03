import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrownFox2
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("brownfox.txt"));
        while (input.hasNext()) {
            String token = input.next();
            System.out.println(token);
        }
    }
}
