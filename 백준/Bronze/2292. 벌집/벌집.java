/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int range = 1;
		int roomRange = 1;
		int count = 1;
		
		
	    int n = Integer.parseInt(br.readLine());
	    while(roomRange < n) { 
	        roomRange += 6 * range++;
		    count++;
	    }
	    bw.write(count+"");
	
	bw.close();
	br.close();
}
}