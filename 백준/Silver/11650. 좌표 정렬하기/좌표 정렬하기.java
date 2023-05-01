import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 반복 횟수;

        int[][] arr = new int[count][2]; // x , y 좌표 담을 공간

        for (int i = 0; i < count; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[i][0] = x;
            arr[i][1] = y;

        }

        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < count; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}