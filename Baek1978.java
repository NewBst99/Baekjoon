package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); // 처음 입력한 숫자
        int[] ary = new int[num];
        int count = 0;

        // 여러 개의 숫자를 입력받아 배열에 저장
        String[] numAry = br.readLine().split("\\s+");
        for (int i = 0; i < num; i++) {
            ary[i] = Integer.parseInt(numAry[i]);
        }

        for (int i = 0; i < num; i++) {
            if (ary[i] > 1) {
                boolean isPrime = true;
                for (int j = 2; j * j <= ary[i]; j++) {
                    if (ary[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
