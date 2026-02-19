import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
	    int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		for (int i=0 ; i<n ; i++) {
		    int m = Integer.parseInt(st.nextToken());
		    boolean isDecimal = true;
		    for (int j=2 ; j<m ; j++) {
		        if (m%j == 0) {
		            isDecimal = false;
		        }
		    }
		   
		    if (m == 1) {
		        isDecimal = false;
		    }
		    
		    if (isDecimal) {
		        count++;
		    }
		}
		
		bw.write(count+"");
	
		bw.close();
		br.close();
	}
}
