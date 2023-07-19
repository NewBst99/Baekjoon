package testbaek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] cho = str.split("\\s+");
		int sizeR = Integer.parseInt(cho[0]);
		int sizeC = Integer.parseInt(cho[1]); 
			
		int[][] aryA = new int[sizeR][sizeC];
		int[][] aryB = new int[sizeR][sizeC];
		
		for(int i = 0; i < sizeR; i++) {
			String input = br.readLine();
			String[] inputAry = input.split("\\s+");
			for(int j = 0; j < sizeC; j++) {
				aryA[i][j] = Integer.parseInt(inputAry[j]);
			}
		}
		
		for(int i = 0; i < sizeR; i++) {
			String input = br.readLine();
			String[] inputAry = input.split("\\s+");
			for(int j = 0; j < sizeC; j++) {
				aryB[i][j] = Integer.parseInt(inputAry[j]);
			}
		}
		
		for(int i = 0; i < sizeR; i++) {
			for(int j = 0; j < sizeC; j++) {
				aryA[i][j] += aryB[i][j];
				System.out.print(aryA[i][j] + " ");
			}
			System.out.println();
		}
	}
}
