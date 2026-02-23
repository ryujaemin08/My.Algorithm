import java.io.*;
import java.util.*;

public class Main
{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            int max = 0;

            if (max < x) {
                max = x;
            }
            if (max < y) {
                max = y;
            }
            if (max < z) {
                max = z;
            }

            if (max >= x + y + z - max) {
                bw.write("Invalid\n");

            } else if (x == y && y == z && z == x) {
                bw.write("Equilateral\n");
            } else if (x == y || y ==z || z == x) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }

        }

        bw.close();
        br.close();
    }
}
