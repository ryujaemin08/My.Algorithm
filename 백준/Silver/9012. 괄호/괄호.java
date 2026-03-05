import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
        

        for (int i=0 ; i<n ; i++) {
            String inputs = br.readLine();
            boolean isSkip = false;

            for (int j=0 ; j<inputs.length() ; j++) {
                char input = inputs.charAt(j);
                stack.push(input);

                if (input == ')') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        bw.write("NO\n");
                        isSkip = true;
                        break;
                    }
                    
                    stack.pop();
                }
            }

            if (isSkip) {
                continue;
            }

            //bw.write(" isEmpty? : "+stack.isEmpty());
            //bw.write(" size : "+stack.size());
            //bw.write(" 추가 팝 : "+stack.pop());
            //bw.write(" 추가 팝 : "+stack.pop());

            if (stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
                stack.clear();
            }            
        }
	
		bw.close();
		br.close();
	}
}
