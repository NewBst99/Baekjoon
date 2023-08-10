package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek10815 {
	static int num1, sang[];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	int search;
    	
    	//보유한 카드
    	num1 = Integer.parseInt(br.readLine());
    	sang = new int[num1];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < num1; i++) {
    		sang[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(sang);
    	
    	//판단할 카드
    	int num2 = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	for(int j = 0; j < num2; j++) {
    		search = BinarySearch(Integer.parseInt(st.nextToken()));
    		if(search != -1)
    			sb.append(1).append(" ");
    		else
    			sb.append(0).append(" ");
    	}
    	
    	System.out.println(sb);
    }
    
    private static int BinarySearch(int card) {
    	int left = 0;
    	int right = num1 - 1;
    	int mid;
    	
    	while(left <= right) {
    		mid = (left + right) / 2;
    		if(sang[mid] < card)
    			left = mid + 1;
    		else if(sang[mid] > card)
    			right = mid - 1;
			else
    			return mid;
    	}
		return -1;
    	
    }
}