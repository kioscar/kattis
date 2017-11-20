
import java.util.Scanner;
import java.math.BigInteger;
public class powers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        BigInteger sal = new BigInteger("0");
        for (int i = 1; i <= a; i++) {
            BigInteger nn = new BigInteger(String.valueOf(i));
            nn = nn.pow(b);
            sal = sal.add(nn);
        }
        BigInteger n2 = new BigInteger(String.valueOf(a));
        System.out.println(sal.remainder(n2));
    }
}
