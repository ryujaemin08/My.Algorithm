import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		int x = Integer.parseInt(br.readLine());
		
		int line = 1;
		int count = 1;
		
		while(count < x) {
		    line++;
		    count += line;
		}
		
		int start = count - line + 1;
		int idx = x - start;
		
		int bunja;
		int bunmo;
		
		if (line % 2 == 1) {
		    bunja = line - idx;
		    bunmo = idx + 1;
		} else {
		    bunmo = line - idx;
		    bunja = idx + 1;
		}
		
		bw.write(bunja+"/"+bunmo);
		
	
		bw.close();
		br.close();
	}
}
