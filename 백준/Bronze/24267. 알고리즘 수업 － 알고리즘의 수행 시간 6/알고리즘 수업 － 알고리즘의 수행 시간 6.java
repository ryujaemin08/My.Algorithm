import java.io.*;
import java.util.*;

public class Main
{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Integer.parseInt(br.readLine());
        
		long sum = 0;
		for (long i=n-2 ; i>0 ; i--) {
            sum += i*(i+1)/2;
		}


		bw.write(sum+"\n3");

		bw.close();
		br.close();
	}
}
