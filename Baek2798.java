package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2798 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int cnt = Integer.parseInt(st.nextToken());
    	int max = Integer.parseInt(st.nextToken());
    	int[] ary = new int[cnt];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < cnt; i++) {
    		ary[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int result = cardResult(ary, cnt, max);
    	System.out.println(result);
    }
    
    static int cardResult(int[] ary, int cnt, int max) {
    	int sum = 0;

        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) {
                for (int k = j + 1; k < cnt; k++) {
                    int result = ary[i] + ary[j] + ary[k];

                    if (result <= max && result > sum) {
                        sum = result;
                    }
                }
            }
        }

        return sum;
    }  
}
