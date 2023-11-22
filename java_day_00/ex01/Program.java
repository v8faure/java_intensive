
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        int     prime;
        int     count = 1;
        boolean status = true;

        Scanner fromShell = new Scanner(System.in);
        prime = fromShell.nextInt();

        if (prime == 0 || prime == 1 || prime < 0) {
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        else {
            for(int i = 2; i*i <= prime; i++) {
                if (prime%i == 0) {
                    status = false;
                    break;
                }
                status = true;
                count++;
            }
            System.out.println(status + " " + count);
        }
        fromShell.close();
    }
}
