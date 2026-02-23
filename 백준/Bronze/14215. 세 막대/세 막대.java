import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
	    int z = Integer.parseInt(st.nextToken());
	    
	    int max = 0;
	    int flag = 1;
	    
	    if (max < x) {
	        max = x;
	        flag = 1;
	    }
	    if (max < y) {
	        max = y;
	        flag = 2;
	    }
	    if (max < z) {
	        max = z;
	        flag = 3;
	    }
	    
	    if (max < x + y + z - max) {
	        bw.write(x+y+z+"");
	    } else {
	        max = (x + y + z - max) -1;
	        if (flag == 1) {
	            bw.write(max + y + z +"");
	        } else if (flag == 2) {
	            bw.write(x + max + z+"");
	        } else {
	            bw.write(x+y+max+"");
	        }
	    }
	    
		bw.close();
		br.close();
	}
}
