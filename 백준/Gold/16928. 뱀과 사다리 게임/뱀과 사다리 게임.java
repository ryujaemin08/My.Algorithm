import java.io.*;
import java.util.*;

public class Main
{

	static int visited[] = new int[101];
	static int map[] = new int[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Arrays.fill(visited, -1);

		for (int i=0 ; i<n+m ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int input1 = Integer.parseInt(st1.nextToken());
			int input2 = Integer.parseInt(st1.nextToken());

			map[input1] = input2;
		}
        

		bw.write(bfs(1,100)+"");

		bw.close();
		br.close();
	}

	static int bfs (int start_idx, int distination_idx) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(start_idx);

		visited[start_idx] = 0;

		while (!queue.isEmpty()) {

			int now = queue.poll();

			if (now == distination_idx) {
				break;
			}
			
			for (int i=1 ; i<=6 ; i++) {
			    if (now +i <= 100) {

                    int next = now+i;

                    if (map[now+i] > 0) {
                        next = map[now+i];
                    }

                    if (visited[next] == -1) {
                        queue.add(next);
                        visited[next] = visited[now] + 1;
                    }
			    }
			}
		}
		return visited[distination_idx];
	}
}
