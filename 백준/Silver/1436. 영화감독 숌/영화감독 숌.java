import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;  // 생성된 종말의 수 개수
        int number = 665;  // 시작 숫자 (666 이전의 수)

        while (count < N) {
            number++;  // 다음 숫자로 증가
            if (String.valueOf(number).contains("666")) {
                count++;  // 종말의 수 개수 증가
            }
        }

        System.out.println(number);
    }
}