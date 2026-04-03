import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		Stack<Integer> stack = new Stack<Integer>();
		int n = Integer.parseInt(br.readLine());
	    int inputs[] = new int[n];	
	    int sortedInputs[] = new int[n];
	    int result[] = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0 ; i<n ; i++) {
		    int input = Integer.parseInt(st.nextToken());
        	inputs[i] = input;
        	sortedInputs[i] = input;
		}
		
		Arrays.sort(sortedInputs);
		    
		    int a=0;
	
		    // 현재 줄 서있는곳에서 밑에 스택에 넣을때마다 계속 최솟값 구하고
		    for (int i=0 ; i<n ; i++) {
		        //bw.write("min : "+min+"\n");
		        
		        
		        // 현재 가장 앞에 있는 애 or 보조 스택의 가장 앞에 있는애가 최솟값이 아니면 및의 스택에 넣어버림
		        
		        //bw.write("inputs "+i+" 번 째: "+inputs[i]+"\n");
		        if (inputs[i] == sortedInputs[a]) { // 현재 줄의 애가 최소값일 때.
		            result[a++] = inputs[i];
		        } else {
		            stack.push(inputs[i]);
		        }
		        
		        while (!stack.isEmpty() && stack.peek() == sortedInputs[a]) {
		            result[a++] = stack.pop();
		        }
		    }
		    
		    while (!stack.isEmpty()) {
		        int input = stack.pop();
		        result[a++] = input;
		       //bw.write(input+"\n");
		    }
		    
		    boolean isSucessful = true;
		    for (int i=0 ; i<n ; i++) {
		        //bw.write("result "+i+"번 째: "+result[i]+"\n");
		        if (result[i] != sortedInputs[i]) {
		            isSucessful = false;
		        }
		    }
		    
		    if (isSucessful) {
		        bw.write("Nice");
		    } else {
		        bw.write("Sad");
		    }
    		bw.close();
		    br.close();
		}
	}