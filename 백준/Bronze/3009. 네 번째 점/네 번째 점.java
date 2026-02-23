import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		



        int x = 0;
        int y = 0;
        for (int i=0 ; i< 3 ; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
		    int xi = Integer.parseInt(st.nextToken());
		    int yi = Integer.parseInt(st.nextToken());

            x = x^xi;
            y = y^yi;
        }
		
        bw.write(x+" "+y);
	
		bw.close();
		br.close();
	}
}
