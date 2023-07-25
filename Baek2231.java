package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2231 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	int cal, sum, ans = 0;
    	
    	for(int i = 0; i < num; i++){
    		cal = i;
    		sum = 0;
    		
    		while(cal != 0) {
    			sum += cal % 10;
    			cal /= 10;
    		}
    		
    		if(sum + i == num) {
    			ans = i;
    			break;
    		}
    	}
    	
    	System.out.println(ans);
    }  
}
