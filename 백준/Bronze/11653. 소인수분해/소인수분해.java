import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());

        // 2 ~ n 중 가장 작은 소수찾기 -> n 을 그 소수로 나눌수 있을때까지 나누기 -> 안나누어 지면 그다음으로 큰 소수 찾아서 나누기.
        if (n == 1) {
    		bw.close();
		    br.close();
            return ;
        }

        for (int i=2 ; i<=n ; i++) {
            boolean isDecimal = true;
                while (true) {
                    if (n % i == 0) {
                        n /= i;
                        bw.write(i+"\n");
                    } else {
                        break;
                    }
            }
        }

	
		bw.close();
		br.close();
	}
}
