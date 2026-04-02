import java.io.*;
import java.util.*;

public class Main
{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



		while (true) {
			String inputs = br.readLine();

			if (inputs.equals("."))
				break;

			Stack<Character> stack = new Stack<Character>();
			boolean isBalanced = true;

			for (int i=0 ; i< inputs.length() ; i++) {
				char input = inputs.charAt(i);

				if (input == '(' || input == '[') {
					stack.push(input);
				}

				if (input == ')') {
					if (stack.isEmpty()) {
						isBalanced = false;
						break;
					}
					char element = stack.pop();
					if (element == '[') {
						isBalanced = false;
						break;
					}
				} else if (input == ']') {
					if (stack.isEmpty()) {
						isBalanced = false;
						break;
					}
					char element = stack.pop();
					if (element == '(') {
						isBalanced = false;
					}
				}
			}

			if (!stack.isEmpty()) {
				isBalanced = false;
			}

			if (isBalanced) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}

		bw.close();
		br.close();
	}
}
