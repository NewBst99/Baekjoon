package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek10816 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	int m, key;
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		key = Integer.parseInt(st.nextToken());
    		if(map.get(key) == null){
    			map.put(key, 1);
    		} else {
    			map.put(key,  map.get(key) + 1);
    		}
    	}
    	
    	m = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	
    	for(int j = 0; j < m; j++) {
    		key = Integer.parseInt(st.nextToken());
    		if(map.get(key) == null) {
    			sb.append(0).append(" ");
    		} else {
    			sb.append(map.get(key)).append(" ");
    		}
    	}
    	
    	System.out.print(sb);
    }
}

