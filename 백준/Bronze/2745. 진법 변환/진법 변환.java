import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	    String n = st.nextToken();
		int b = Integer.parseInt(st.nextToken());
	    
	    int temp = 0;
	    for (int i = n.length()-1; i>=0 ; i--) {
	        char input = n.charAt(n.length()-i-1);
	        
	        if ('A' <= input && input <= 'Z') {
	            temp += (input - 'A' + 10) * Math.pow(b,i); 
	        } else {
	            temp += (input - '0') * Math.pow(b,i);  
	        }
	    }
	    
	    bw.write(temp+"");
	    
		bw.close();
		br.close();
	}
}
