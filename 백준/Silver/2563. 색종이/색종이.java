import java.io.*;
import java.util.*;

public class Main
{
    static boolean[][] blackArea = new boolean[100][100];
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		for (int i=0 ; i<n ; i++) {
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    
		    int x = Integer.parseInt(st.nextToken());
		    int y = Integer.parseInt(st.nextToken());
		    
		    for (int j=0 ; j<10 ; j++) {
		        for (int k=0 ; k<10 ; k++) {
		            blackArea[x+j][y+k] = true;
		        }
		    }
		}
		int count = 0;
		
		for (int i=0 ; i<100 ; i++) {
		    for (int j=0 ; j<100 ; j++) {
		        if (blackArea[i][j]) {
		            count++;
		        }
		    }
 		}
		
	    bw.write(count+"");
	    
		bw.close();
		br.close();
	}
}
