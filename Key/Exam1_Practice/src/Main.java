import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("12 / 3 + 5 + 3 * -2 = " + (12/3+5+3*-2));
        System.out.println("1 + 1 + \"(1 + 1)\" + 1 + 1 = " + (1 + 1 + "(1 + 1)" + 1 + 1));
        System.out.println("13 / 2 - 38 / 5 / 2.0 + (15 / 10.0) = " + (13 / 2 - 38 / 5 / 2.0 + (15 / 10.0)));
        System.out.println("11 < 3 + 4 || !(5 / 2 == 2) = " + (11 < 3 + 4 || !(5 / 2 == 2)));
        System.out.println("20 % 6 + 6 % 20 + 6 % 6 = " + (20 % 6 + 6 % 20 + 6 % 6));
        System.out.println();

        testDigitsInARow(345696777);    // 3 digits in a row ("777")
        testDigitsInARow(388999566);
        testDigitsInARow(389999566);
        testDigitsInARow(0);            // 1 digit in a row
        testDigitsInARow(456);          // 1 digit in a row
        testDigitsInARow(9907);         // 2 digits in a row ("99")

        drawFootball();
    }

    private static void testDigitsInARow(int x) {
        System.out.println("\"" + x + "\" has " + digitsInARow(x) + " digits in a row");
    }

    private static int digitsInARow(int x) {
        if (x < 0) x *= -1;
        if (x < 10) return 1; // 0 - 9

        int maxCount = 1;
        int count = 1;
        while ( x > 10 ) {
            int d1 = x % 10;
            int d2 = ( x / 10 ) % 10;
            if (d1 == d2) {
                count++;
                if (maxCount < count) maxCount = count;
            }
            else {
                count = 1;
            }
            x /= 10;
        }
        return maxCount;
    }

    private static void drawFootball() {
        DrawingPanel panel = new DrawingPanel(250,250);
        Graphics g = panel.getGraphics();

        int xFootballTopLeft = 10;
        int yFootballTopLeft = 30;
        int xFootballBottomRight = 210;
        int yFootballBottomRight = 230;

        // draw 21 lines (which includes all four borders
        // …the first lines (where i=0) are the left and bottom borders
        // …the last two lines (where i=20) are the top and right borders
        for (int i = 0 ; i < 21 ; i ++ ) {
            g.drawLine(xFootballTopLeft, yFootballBottomRight - 10 * i, xFootballTopLeft + 10 * i, yFootballTopLeft);
            g.drawLine(xFootballTopLeft + i * 10, yFootballBottomRight, xFootballBottomRight, yFootballBottomRight - i * 10);
        }
    }
}