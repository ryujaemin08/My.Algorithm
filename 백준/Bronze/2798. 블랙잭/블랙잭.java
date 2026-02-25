import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] inputs = new int[n];
        for (int i=0 ; i<n ; i++) {
            
            inputs[i] = Integer.parseInt(st1.nextToken());
        }  


        int difference = 300000;
        for (int i=0 ; i<n ; i++) {
            int x = inputs[i];
            for (int j=0 ; j<n ; j++) {
                if (j == i) {
                    continue;
                }
                int y = inputs[j];

                for (int k=0 ; k<n ; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int z = inputs[k];
                    if (m - (x+y+z) >= 0) {
                        if (m - (x+y+z) < difference) {
                            difference = m - (x+y+z);
                        }
                    }
                }
            }
        }

        bw.write(m-difference+"");


		bw.close();
		br.close();
	}
}
