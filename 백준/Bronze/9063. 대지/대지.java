import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        // 가장 작은 X 와 가장 큰 X 의 차, 가장 작은 Y 와 가장 큰 Y 의 차를 곱한다.
		
		
		int n = Integer.parseInt(br.readLine());

        if (n==0) {
            bw.write(0+"");
            br.close();
            bw.close();
            return;
        }

        int mx = 10000;
        int Mx = -10000;

        int my = 10000;
        int My = -10000;


        for (int i=0 ; i<n ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int xi = Integer.parseInt(st.nextToken());
            int yi = Integer.parseInt(st.nextToken());

            if (Mx < xi) {
                Mx = xi;
            }
            if (mx > xi) {
                mx = xi;
            }

            if (My < yi) {
                My = yi;
            }

            if (my > yi) {
                my = yi;
            }
        }

        int result = (Mx - mx) * (My - my);
        bw.write(result+"");

		bw.close();
		br.close();
	}
}
