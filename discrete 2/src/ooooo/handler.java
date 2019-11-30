package ooooo;
import java.util.Scanner;
import java.util.Vector;
import static java.util.Arrays.stream;
public class handler {
    Scanner input = new Scanner(System.in);
    private String command;
    public handler(){
    System.out.println("please enter the process you want by entering the number of it , enter close if you want to end:");
    System.out.println("1.Fast Exponentian");
    System.out.println("2.Extended Euclidean Algorithm");
    System.out.println("3.Chinese Remainder Theorem");
    System.out.println("4.Prime Number Generation");
    command = input.next();
    int n;
    int a, b, d, p;
    int m, k;
    int x, y, z;
    Vector<Integer> primes = new Vector<>();
    Vector<Integer> crt1 = new Vector<>();
    Vector<Integer> crt2 = new Vector<>();
        while (!command.toLowerCase().equals("close")) {
        n=Integer.parseInt(command.toLowerCase());
        switch (n) {
            case 1:
                FastExponentian j=new FastExponentian();
                System.out.println("please enter the three parameters you want as res=(x^y)%z");
                System.out.print("x = ");
                x = input.nextInt();
                System.out.print("y = ");
                y = input.nextInt();
                System.out.print("z = ");
                z = input.nextInt();
                System.out.println("(" + x + "^" + y + ")%" + z + " = " + j.modulo(x, y, z));
                break;
            case 2:
                GCD t=new GCD();
                System.out.println("please enter the two numbers");
                System.out.print("the first number : ");
                a = input.nextInt();
                System.out.print("the second number : ");
                b = input.nextInt();
                d = GCD.gcd(a, b);
                System.out.println("GCD(" + a + " , " + b + ") = " + d);
                break;
            case 3:
                ChineseRemainder l = new ChineseRemainder();
                System.out.println("please enter the two sets you want , press -1 to end entering");
                System.out.print("the first set : ");
                m = input.nextInt();
                while (m != -1) {
                    crt1.add(m);
                    m = input.nextInt();
                }
                System.out.print("the second set : ");
                k = input.nextInt();
                while (k != -1) {
                    crt2.add(k);
                    k = input.nextInt();
                }
                int[] h = new int[crt1.size()];
                for (int i = 0; i < crt1.size(); i++) {
                    h[i] = crt1.elementAt(i);
                }
                int[] r = new int[crt2.size()];
                for (int i = 0; i < crt2.size(); i++) {
                    r[i] = crt2.elementAt(i);
                }
                System.out.println("chinese remainder of " + crt1 + " and " + crt2 + " = " + l.chineseRemainder(h, r));
                break;
            case 4:
                Prime o=new Prime();
                System.out.println("please enter the number you want to generate primes for it");
                p = input.nextInt();
                primes = o.primeNumbersBruteForce(p);
                System.out.println("primes of " + p + " = " + primes);
                break;
            default:
                System.out.println("the number entered is error , please enter again :");
        }
        System.out.println("please enter the process you want by entering the number of it:");
        System.out.println("1.Fast Exponentian");
        System.out.println("2.Extended Euclidean Algorithm");
        System.out.println("3.Chinese Remainder Theorem");
        System.out.println("4.Prime Number Generation");
        command = input.next();
    }}
}
