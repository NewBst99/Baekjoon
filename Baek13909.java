import java.io.*;

public class BOJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 1; i*i <= num; i++){
            cnt++;
        }

        System.out.println(cnt);

        br.close();
    }
}