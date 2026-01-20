import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
	
	    int result = (int)(Math.pow(Math.pow(2,n)+1, 2));
	    bw.write(result+"");
	        
		bw.close();
		br.close();
	}
}
