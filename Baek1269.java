package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek1269 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<Integer> setA = new HashSet<Integer>();
    	HashSet<Integer> setB = new HashSet<Integer>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int cnt = 0;
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		setA.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int j = 0; j < m; j++) {
    		setB.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	for(int k : setA) {
    		if(!setB.contains(k)) {
    			cnt++;
    		}
    	}
    	
    	for(int k : setB) {
    		if(!setA.contains(k)) {
    			cnt++;
    		}
    	}
    	
    	System.out.print(cnt);
    }
}
