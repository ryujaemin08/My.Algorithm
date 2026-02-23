import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Integer.parseInt(br.readLine());
		
		long sum = 0;
		for (long i = n-1 ; i >0 ; i--) {
		    sum += i;
		}
		
		bw.write(sum+"\n2");
		
		// 1 ~ 6

		//  i : 1 , j : 2
		//  i : 1 , j : 3
		//  i : 1 , j : 4
		//  i : 1 , j : 5
		//  i : 1 , j : 6
		//  i : 1 , j : 7
		//  i : 2 , j : 3
		
		bw.close();
		br.close();
	}
}
