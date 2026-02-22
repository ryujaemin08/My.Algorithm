import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        // 현재 위치에서 사각형 양끝까지 가로끼리 비교, 세로끼리 비교 하여 가장 짧은걸 도출
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int min = 1001;
        
        if (min > x)
        min = x;

        if (min > y)
        min = y;

        if (min > w-x)
        min = w-x;

        if (min > h-y)
        min = h-y;

        bw.write(min+"");
	
		bw.close();
		br.close();
	}
}
