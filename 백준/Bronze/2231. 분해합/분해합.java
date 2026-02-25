import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

        // 3자리수로 빼지면서 N 에서 뺏을때 그 3자리수가 나와야함

        for (int i=1 ; i<=n ; i++) {
            int disassemblingSum=0;
            int iTemp = i;
            while(true) {  
                disassemblingSum += iTemp%10;
                iTemp = iTemp/10;
                if (iTemp == 0) {
                    break;
                }
            }
            if (disassemblingSum+i == n) {
                bw.write(i+"");
            	bw.close();
		        br.close();
                return;
            }
        }
        bw.write("0");

		bw.close();
		br.close();
	}
}
