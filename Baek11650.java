package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baek11650 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	int[][] ary = new int[num][2];
    	
    	
    	for(int i = 0; i < num; i++) {
    		String[] temp = br.readLine().split(" ");
    		ary[i][0] = Integer.parseInt(temp[0]);
    		ary[i][1] = Integer.parseInt(temp[1]);
    	}

    	Arrays.sort(ary, new Comparator<int[]>() {
    		@Override
    		public int compare(int[] num1, int[] num2) {
    			if(num1[0] == num2[0]) {
    				return Integer.compare(num1[1], num2[1]);
    			} else {
    				return Integer.compare(num1[0], num2[0]);
    			}
    		}
    	});

    	for(int i=0; i<num; i++) {
        	System.out.println(ary[i][0] +" "+ ary[i][1]);
    	}
    }  
}
