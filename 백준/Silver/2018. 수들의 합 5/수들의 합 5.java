import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 1;

        while (start <= N) {
            if (sum < N) {
                sum += end;
                end++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                count++;
                sum += end;
                end++;
            }
        }

        System.out.println(count);
    }
}