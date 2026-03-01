import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 666 이 무조건 들어가야함.
        // 666 이 무조건 들어가는 수중에서 n 번째로 작은 수를 찾아야함.
        
		int n = Integer.parseInt(st.nextToken());
        int count=0;
        for (int i=666 ; i<Integer.MAX_VALUE ; i++) {
            String str = String.valueOf(i);
            if (str.contains("666")) {
                count++;
                if (count==n) {
                    bw.write(i+"");
                    break;
                }
            }
        }
	
		bw.close();
		br.close();
	}
}
