import java.util.Random;

public class RandomExamples {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("random ODD number ranging from 101 to 199 inclusive");
        for (int count=0; count < 25; count++) {
            int randomOddNumber = rand.nextInt(50) * 2 + 101;
            System.out.print(randomOddNumber + "  ");
        }
        System.out.println();
        System.out.println();

        System.out.println("random EVEN number ranging from -20 to 40 inclusive");
        // random EVEN number ranging from -20 to 40 inclusive
        for (int count=0; count < 25; count++) {
            int randomOddNumber = rand.nextInt(31) * 2 - 20;
            System.out.print(randomOddNumber + "  ");
        }
        System.out.println();
        System.out.println();

        System.out.println("random DECIMAL number ranging from -3.5 inclusive to 4.5 exclusive");
        for (int count=0; count < 25; count++) {
            double randomDouble = rand.nextDouble() * 7.5 - 3.5;
            System.out.printf("%2.1f%s",randomDouble, "   ");
        }
    }
}
