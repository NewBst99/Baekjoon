package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Baek1764 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<String> map = new HashSet<String>();
    	ArrayList<String> sortlist = new ArrayList<>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int cnt = 0;
    	
    	for(int i = 0; i < n + m; i++) {
    		String temp = br.readLine();
    		if(i < n) {
    			map.add(temp);
    		} else {
    			if(map.contains(temp)) {
    				sortlist.add(temp);
    				cnt++;
    			}
    		}
    	}
    	
    	Collections.sort(sortlist);
    	
    	System.out.println(cnt);
    	for(String i : sortlist) {
    		System.out.println(i);
    	}
    	
    }
}

