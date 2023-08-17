package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek7785 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<String, String> map = new HashMap<String, String>();
    	
    	int rpt = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < rpt; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String name = st.nextToken();
    		String com = st.nextToken();
    		
    		if(com.equals("enter")) {
    			map.put(name, com);
    		} else {
    			map.remove(name);
    		}
    	}
    	
    	ArrayList<String> sortlist = new ArrayList<>(map.keySet());
    	Collections.sort(sortlist, Collections.reverseOrder());
    	
    	for(String name : sortlist) {
    		System.out.println(name);
    	}
    	
    }
}

