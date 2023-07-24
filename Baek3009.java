package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int coorX[][] = {{0, 0}, {0, 0}};
        int coorY[][] = {{0, 0}, {0, 0}};
        int x, y;
        int cnt = 0;
        
        for(int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine());
        	x = Integer.parseInt(st.nextToken());
        	y = Integer.parseInt(st.nextToken());
        	
        	if(cnt == 0) {
        		coorX[0][0] = x;
        		coorX[1][0]++;
        		coorY[0][0] = y;
        		coorY[1][0]++;
        	} else {
	        	if(x == coorX[0][0]) {
	        		coorX[1][0]++;
	        	} else {
	        		coorX[0][1] = x;
	        		coorX[1][1]++;
	        	}
	        	
	        	if(y == coorY[0][0]) {
	        		coorY[1][0]++;
	        	} else {
	        		coorY[0][1] = y;
	        		coorY[1][1]++;
	        	}
        	}
        	cnt++;
        }
      
        if(coorX[1][0] == 1)
        	x = coorX[0][0];
        else 
        	x = coorX[0][1];
      
        if(coorY[1][0] == 1)
        	y = coorY[0][0];
        else 
        	y = coorY[0][1];
        
        System.out.println(x + " " + y);
       
    }
}
