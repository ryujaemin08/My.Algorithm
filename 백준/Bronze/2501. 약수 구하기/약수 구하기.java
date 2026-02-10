import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
	    
	    int count = 1;
	    int result = 0;
	    
	    for (int i = 1 ; i<=n ; i++) {
            if (n%i == 0) {
                if (count == k) {
                    result = i;
                    break;
                } else {
                    count++;
                }
            }
	    }
	    
	    bw.write(result+"");
	    
		bw.close();
		br.close();
	}
}
