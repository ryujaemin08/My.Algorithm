import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;
        
        boolean isfirst = true;
        for (int i=m ; i<=n ; i++) {
            boolean isDecimal = true;
            for (int j=2 ; j<i ; j++) {
                if (i%j == 0) {
                    isDecimal = false;
                }
            }
            if (i == 1) {
                isDecimal = false;
            }
            if (isDecimal) {
                if (isfirst) {
                    min = i;
                    isfirst = false;
                } 
                sum += i;
            }
            
        }
        if(min == 0) {
            bw.write(-1+"");
        } else {
            bw.write(sum+"\n"+min);
        }

		bw.close();
		br.close();
	}
}
