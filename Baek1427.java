package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek1427 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String num = br.readLine();
    	char[] digitary = new char[num.length()];
    	int start, end;
    	
    	for(int i = 0; i < num.length(); i++) {
    		digitary[i] = num.charAt(i);
    	}
    	
    	Arrays.sort(digitary);
    	
    	start = 0;
    	end = digitary.length - 1;
    	
    	while(start < end) {
    		char temp = digitary[start];
    		digitary[start] = digitary[end];
    		digitary[end] = temp;
    		start++;
    		end--;
    	}
    	
    	for(int i = 0; i < num.length(); i++) {
    		System.out.print(digitary[i]);
    	}
    }  
}
