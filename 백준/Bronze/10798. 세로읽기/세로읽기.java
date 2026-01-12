import java.io.*;
import java.util.*;

public class Main
{
   
    static char[][] inputs; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		inputs = new char[5][15];
		for (int i=0; i<5; i++) {
		    String input = br.readLine();
		    for (int j=0 ; j<input.length() ; j++) {
		        inputs[i][j] = input.charAt(j);
		    }
		}
		
		for (int i=0; i<15; i++) {
		    for (int j=0 ; j<5 ; j++) {
		        char input = inputs[j][i];
		        if (input != '\0') {
		            sb.append(input);
		        }
		    }
		}
		bw.write(sb.toString());
	
		bw.close();
		br.close();
	}
}


