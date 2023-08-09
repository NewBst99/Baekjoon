package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baek18870 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
    	
    	int num = Integer.parseInt(br.readLine());
    	int[] ary = new int[num];
    	int[] sortary = new int[num];
    	int rank = 0;

    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < num; i++) {
    		sortary[i] = ary[i] = Integer.parseInt(st.nextToken());
    	}

    	Arrays.sort(sortary);
    	
    	for(int c : sortary) {
    		if(!rankMap.containsKey(c)) {
    			rankMap.put(c, rank);
        		rank++;
    		}
    	}
    	
    	for(int k : ary) {
    		rank = rankMap.get(k);
    		sb.append(rank).append(" ");
    	}
    	System.out.println(sb);
    }
}