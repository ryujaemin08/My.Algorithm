import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            int temp = n % b;
            n /= b;

            if (temp >= 10) {
                result.append((char)(temp - 10 + 'A'));
            } else {
                result.append(temp);
            }
        }

        bw.write(result.reverse().toString());

        bw.close();
        br.close();
    }
}
