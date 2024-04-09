import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ {
    public static boolean[] primeAry;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);

        primeAry = new boolean[num2 + 1];
        isPrime();

        for(int i = num1; i < num2+1; i++){
            if(!primeAry[i]) System.out.println(i);
        }

        br.close();
    }

    public static void isPrime(){
        primeAry[0] = primeAry[1] = true;
        for(int i = 2; i*i <= primeAry.length; i++){
            if(primeAry[i]) continue;
            for(int k = i*i; k < primeAry.length; k += i){
                primeAry[k] = true;
            }
        }
    }
}