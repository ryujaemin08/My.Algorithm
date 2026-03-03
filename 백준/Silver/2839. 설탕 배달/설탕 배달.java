import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        // 5로 나누다가 -1 나올거 같으면 3으로 나누기
        
        // n -3 하기
        // 뺀거 5로 나누기 끝까지 안나눠 지는거면 -1

		int n = Integer.parseInt(st.nextToken());
        
        int i=0;
        int count=0;
        while (true) {
            int temp = n;
            temp-=3*i;
            if (temp%5 == 0) {
                count += temp/5;
                count += i;
                bw.write(count+"");
                break;
            }

            if (temp == 0) {
                bw.write(i+"");
                break;
            }

            if (temp < 0) {
                bw.write("-1");
                break;
            }

            i++;
        }

		bw.close();
		br.close();
	}
}
