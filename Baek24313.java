package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek24313 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] ary = br.readLine().split("\\s+");
    	int a1 = Integer.parseInt(ary[0]);
    	int a0 = Integer.parseInt(ary[1]);
    	int c = Integer.parseInt(br.readLine());
    	int n = Integer.parseInt(br.readLine());
    	
    	if((a1 * n + a0 <= c * n) && (c >= a1))
    		System.out.println("1");
    	else
    		System.out.println("0");
    }
}
