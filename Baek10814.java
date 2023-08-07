package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baek10814 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int num = Integer.parseInt(br.readLine());
    	String[][] ary = new String[num][2];
    	
    	
    	for(int i = 0; i < num; i++) {
    		String[] temp = br.readLine().split(" ");
    		ary[i][0] = temp[0];
    		ary[i][1] = temp[1];
    	}
    	
    	Arrays.sort(ary, new Comparator<String[]>() {
    		@Override
    		public int compare(String[] s1, String[] s2) {
    			return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
    		}
    	});

    	for(int i = 0; i < num; i++) {
        	System.out.println(ary[i][0] +" "+ ary[i][1]);
    	}
    }  
}