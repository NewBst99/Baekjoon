package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek14425 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int cnt = 0;
    	
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
    	
    	for(int i = 0; i < n; i++) {
    		map.put(br.readLine(), 1);
    	}
    	
    	for(int j = 0; j < m; j++) {
    		if(map.containsKey(br.readLine())) cnt++;
    	}
    	
    	System.out.print(cnt);
    }
}

