package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek13241 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long gcd = gcdCheck(a, b);
		
		sb.append(a * b / gcd);
	
    	System.out.print(sb);
    }
    
    public static long gcdCheck(long a, long b) {
    	if(b == 0)
    		return a;
    	return gcdCheck(b, a % b);
    }
}
