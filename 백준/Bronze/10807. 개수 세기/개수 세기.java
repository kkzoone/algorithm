import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(findNum == array[i]){
                count ++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}