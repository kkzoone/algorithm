import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String command = br.readLine();
        int count = 0;
        int countL = 0, countS = 0;
        for (int i = 0; i < n; i++) {
            char curr = command.charAt(i);
            if (curr >= '1' && curr <= '9') count++;
            else if (curr == 'L') countL++;
            else if (curr == 'S') countS++;
            else if (curr == 'R') {
                if (countL > 0) {
                    count++;
                    countL--;
                }
                else break;
            } else if (curr == 'K') {
                if (countS > 0) {
                    count++;
                    countS--;
                }
                else break;
            }
        }
        System.out.println(count);
    }
}
