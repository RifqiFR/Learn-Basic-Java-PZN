package javaDasar;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = 100;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Augmented assigments
        c+=10;
        System.out.println(c);

        c-=10;
        System.out.println(c);

        c*=10;
        System.out.println(c);

        // Unary Operator
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

    }
}
