import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int count = 1; // count가 1인 이유는 end가 N일 때를 미리 고려한 것
        int sum = 1;
        int start = 1;
        int end = 1;
        while(end!=N){
            if(sum==N){ // sum과 N이 같다면
                count++; // count + 1
                end++; // end 옆으로 이동 
                sum = sum+end; // end 이동했으므로 합이 커짐
            } else if(sum > N){ // sum이 N보다 크다면
                sum = sum-start; // 값을 줄여줘야 하기 때문에 
                start++; // start 옆으로 이동
            } else{ // sum이 N보다 작다면
                end++; // 값을 더해줘야 하기 때문에
                sum = sum+end; // end 옆으로 이동
            }
        }
        System.out.println(count);
    }
}