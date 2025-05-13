import java.util.Scanner;

public class J0513 {
     public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("몇까지?");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (!(i % 2 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
