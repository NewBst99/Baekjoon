package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = 0;
		int x, y;
		boolean[][] ary = new boolean[100][100];
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String coor = br.readLine();
			String save[] = coor.split("\\s+");
			
			x = Integer.parseInt(save[0]);
			y = Integer.parseInt(save[1]);
			
			for(int j = x; j < x + 10; j++) {
				for(int k = y; k < y + 10; k++) {
					if(ary[j][k] != true) {
						ary[j][k] = true;
						size++;
					}
				}
			}
		}
		System.out.print(size);
		
	}
}
