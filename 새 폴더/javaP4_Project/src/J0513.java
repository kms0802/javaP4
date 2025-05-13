import java.util.Scanner;

public class J0513 {
     public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("숫자로 입력하세요.");
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            if (!(i % 2 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println("홀수합 계산 완료 : [" + sum + "]");
    }
}
