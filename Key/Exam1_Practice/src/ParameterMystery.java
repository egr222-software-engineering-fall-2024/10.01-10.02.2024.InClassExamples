public class ParameterMystery {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int c = 3;
        int three = a;
        int one = b + 1;

        axiom (a, b, c);
        axiom (c, three, 10);
        axiom (b + c, one + three, a + one);
        a++;
        b = 0;
        axiom (three, 2, one);
    }

    public static void axiom(int c, int b, int a) {
        System.out.println(a + " + " + c + " = " + b);
    }
}
