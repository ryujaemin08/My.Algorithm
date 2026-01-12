import java.io.*;
import java.util.*;

public class Main
{
    
    static int n;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		
		int count = 0;
	    
	    for (int i=0 ; i<n ; i++) {
	        
	        if (check(br.readLine())) {
	            
	            count++;
	            
	        }
	    }
	    bw.write(count+"");
	
		bw.close();
		br.close();
	}
	
	public static boolean check(String input) {
	    
	    boolean[] check = new boolean[26];
	    int prev = 0;
	    
	    for (int i=0 ; i<input.length() ; i++) {
	        int ch = input.charAt(i);
	        
	        if (ch != prev) {
	            if (check[ch-'a'] == false) {
	                check[ch-'a'] = true;
	                prev = ch;
	            } else {
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
