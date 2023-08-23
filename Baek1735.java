package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1735 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nA = Integer.parseInt(st.nextToken());
		int nB = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int mA = Integer.parseInt(st.nextToken());
		int mB = Integer.parseInt(st.nextToken());
		
		int sumA = nA * mB + mA * nB;
		int sumB = nB * mB;
		
		int gcd = gcdCheck(sumA, sumB);
		sb.append(sumA / gcd).append(" ").append(sumB / gcd);
    	System.out.print(sb);
    }
    
    public static int gcdCheck(int a, int b) {
    	if(b == 0)
    		return a;
    	return gcdCheck(b, a % b);
    }
}
