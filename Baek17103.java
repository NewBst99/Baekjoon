import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] primeArray = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[] ary = new int[cnt];
        int part = 0;

        isPrime();

        for(int i = 0; i < cnt; i++){
            ary[i] = Integer.parseInt(br.readLine());
        }

        for(int k = 0; k < cnt; k++) {
            part = 0;
            for (int j = 2; j <= ary[k]/2; j++) {
                if(!primeArray[j]){
                    if(!primeArray[ary[k] - j]){
                        part++;
                    }
                }
            }
            System.out.println(part);
        }
    }

    public static void isPrime(){
        primeArray[0] = primeArray[1] = true;
        for(int i = 2; i*i <= 1000000; i++){
            if(primeArray[i]) continue;
            for(int k = i*i; k <= 1000000 && k >= 0; k += i){
                primeArray[k] = true;
            }
        }
    }
}