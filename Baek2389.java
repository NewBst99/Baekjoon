package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2389 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int weight = Integer.parseInt(br.readLine());
    	int five, three = 0;
    	
    	while(true) {
    		if(weight % 5 == 0) {
    			five = weight / 5;
    			System.out.println(five + three);
    			break;
    		} else {
    			weight -= 3;
    			three++;
    		}
    		
    		if(weight < 0) {
    			System.out.println("-1");
    			break;
    		}
    	}
    }  
}
