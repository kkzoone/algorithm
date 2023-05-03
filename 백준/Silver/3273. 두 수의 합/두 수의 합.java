import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int count = 0;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(x - arr[i])) {
                count++;
            }
            set.add(arr[i]);
        }

        System.out.println(count);
    }
}