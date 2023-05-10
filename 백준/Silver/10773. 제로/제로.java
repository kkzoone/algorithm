import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(br.readLine());
            if (value != 0) {
                stack.add(value);
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        }
        else{
            int sum = 0;
            for (int i = 0; i < stack.size(); i++) {
                sum+=stack.get(i);
            }
            System.out.println(sum);
        }
    }
}