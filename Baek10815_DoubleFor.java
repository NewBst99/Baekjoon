package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek10815_DoubleFor {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	//보유한 카드
    	int num1 = Integer.parseInt(br.readLine());
    	int[] sang = new int[num1];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < num1; i++) {
    		sang[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//판단할 카드
    	int num2 = Integer.parseInt(br.readLine());
    	int[] judge = new int[num2];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int j = 0; j < num2; j++) {
    		judge[j] = Integer.parseInt(st.nextToken());
    	}
    	
    	int check = 0;
    	for(int k : judge) {
    		for(int c : sang) {
    			if(k == c) {
    				check = 1;
    				break;
    			}
    			else {
    				check = 0;
    			}
    		}
    		sb.append(check + " ");
    	}
    	System.out.println(sb);
    }
}