import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0 ; i<t ; i++) {
		    int n = Integer.parseInt(br.readLine());
		    
		    int Q = 0;
		    int D = 0;
		    int N = 0;
		    int P = 0;
		    
		    
		        if (n/25 >= 1) {
		            Q = n/25;
		            n = n%25;
		        }
		        if (n/10 >= 1) {
		            D = n/10;
		            n = n%10;
		        }
		        if (n/5 >= 1) {
		            N = n/5;
		            n = n%5;
		        }
		        if (n/1 >= 1) {
		            P = n/1;
		            n = n%1;
		        }
		        
		        bw.write(Q+" "+D+" "+N+" "+P+"\n");
		}
	
		bw.close();
		br.close();
	}
}
