package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2750 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int temp;
    	int num = Integer.parseInt(br.readLine());
    	int[] ary = new int[num];
    	
    	for(int i = 0; i < num; i++) {
    		ary[i] = Integer.parseInt(br.readLine());
    	}
    	
    	for(int j = 0; j < num; j++) {
    		for(int m = j + 1; m < num; m++) {
    			if(ary[j] > ary[m]) {
        			temp = ary[j];
        			ary[j] = ary[m];
        			ary[m] = temp;
        		}
    		}
    	}
    	
    	for(int k = 0; k < num; k++) {
    		System.out.println(ary[k]);
    	}
    	
    }  
}
