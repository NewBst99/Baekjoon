package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2485 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int count, result;
    	
    	count = Integer.parseInt(br.readLine());
    	int[] ary = new int[count];
    	 
    	for(int i = 0; i < count; i++) {
    		ary[i] = Integer.parseInt(br.readLine());
    	}
    	
    	int gcd = 0;
    	for(int j = 0; j < count - 1; j++) {
    		int temp = ary[j+1] - ary[j];
    		gcd = GCD(temp, gcd);	
    	}
    	
    	result = ((ary[count-1] - ary[0]) / gcd) + 1 - ary.length;
    	System.out.println(result);
    }
    
    static int GCD(int a, int b) {
    	if(b == 0) {
    		return a;
    	}
    	return GCD(b, a % b);
    }
}

