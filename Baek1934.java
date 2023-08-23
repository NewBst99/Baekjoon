package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek1934 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int gcd = gcdCheck(a, b);
    		
    		sb.append(a * b / gcd).append(" \n");
    	}
    	
    	System.out.print(sb);
    }
    
    public static int gcdCheck(int a, int b) {
    	if(b == 0)
    		return a;
    	return gcdCheck(b, a % b);
    }
}
