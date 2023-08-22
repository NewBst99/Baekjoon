package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baek11478 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashSet<String> set = new HashSet<>();
    	String sen = br.readLine();
    	
    	for(int i = 0; i < sen.length(); i++) {
    		for(int j = i + 1; j <= sen.length(); j++) {
    			set.add(sen.substring(i, j));
    		}
    	}
    	
    	System.out.print(set.size());
    }
}
