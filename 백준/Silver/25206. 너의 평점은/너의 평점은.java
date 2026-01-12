import java.io.*;
import java.util.*;

public class Main
{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Double> map = new HashMap();

		map.put("A+",4.5);
		map.put("A0",4.0);
		map.put("B+",3.5);
		map.put("B0",3.0);
		map.put("C+",2.5);
		map.put("C0",2.0);
		map.put("D+",1.5);
		map.put("D0",1.0);
		map.put("F",0.0);

        double total = 0;
        double schoolScoreTotal = 0;


		for (int i=0 ; i<20 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
		    double schoolScore = Double.parseDouble(st.nextToken());
		    
		    String input = st.nextToken();
		    if (input.equals("P")) {
		        continue;
		    }
		    
			double subjectScore = map.get(input);
			
			total += schoolScore * subjectScore;
			schoolScoreTotal += schoolScore;
		}
        double result = total / schoolScoreTotal;

        bw.write(result+"");

		bw.close();
		br.close();
	}
}
