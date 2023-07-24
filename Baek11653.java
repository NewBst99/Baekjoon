package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 2;
        int num = Integer.parseInt(br.readLine());
        
        while(num != 1) {
        	if(num % i == 0) {
        		num /= i;
        		System.out.println(i);
        	} else {
        		i++;
        	}
        }
    }
}
