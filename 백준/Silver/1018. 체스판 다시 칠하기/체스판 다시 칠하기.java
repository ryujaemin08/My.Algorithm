import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());

       char inputs[][] = new char[n][m];
        for (int i=0 ; i<n ; i++) {
            String inputLine = br.readLine();
            for (int j=0 ; j<m ; j++) {
                inputs[i][j] = inputLine.charAt(j);
                //System.out.print(inputs[i][j]+"");
            }
            //System.out.println();
        }

		
		// 저번처럼 W 먼저 시작 or B 먼저 시작 으로 둘다 브루드 포스로 탐색, 0,0 에서8,8 까지
		// 패턴에 안맞으면 count++; 함
		// 그다음 윈도우를 한컨 옆으로 옮겨서 1,0 ~ 9,8, 1,1 ~ 9,9 이런식으로 옮겨서 다시 반복 
		// 최종적으로 count 가 가장 낮게 나온걸 출력함.



        char color1 = 'W';
        char color2 = 'B';
        
        int count1 = 0;
        int count2 = 0;
        int min = Integer.MAX_VALUE;
        for (int wy=8 ; wy<=n ; wy++) {
            for (int wx=8 ; wx<=m ; wx++) {
                count1 = 0;
                count2 = 0;
                for (int i=wy-8  ; i<wy ; i++) {
                    for (int j=wx-8 ; j<wx ; j++) {
                        char input = inputs[i][j];
                        if (color1 != input) {
                            //bw.write("color1 :"+color1);
                            //bw.write(" input :"+input+"\n");
                            count1++;
                        } else {
                            count2++;
                        }
                        
                        if (color1 == 'W') {
                            color1 = 'B';
                            color2 = 'W';
                        } else {
                            color1 = 'W';
                            color2 = 'B';
                        }
                    }
                        if (color1 == 'W') {
                            color1 = 'B';
                            color2 = 'W';
                        } else {
                            color1 = 'W';
                            color2 = 'B';
                        }
                }
                if (min > count1) {
                    //bw.write("카운터1 : "+count1+"\n");
                    min = count1;
                }
                
                if (min > count2) {
                    //bw.write("카운터2 : "+count2+"\n");
                    min = count2;
                }
            }
        }
        bw.write(min+"");
	
		bw.close();
		br.close();
	}
}
