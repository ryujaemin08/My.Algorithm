import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());// :5
		int B = Integer.parseInt(st.nextToken());// :1
	    int V = Integer.parseInt(st.nextToken());// :10

	    int temp1 = V - A; // 5
	    int temp2 = A - B; // 3
        

        int temp3 = (temp1 + temp2 -1 )/ temp2;
	    
	    int result = temp3+1;
	    
	    bw.write(result+"");
  
		bw.close();
		br.close();
	}
}
