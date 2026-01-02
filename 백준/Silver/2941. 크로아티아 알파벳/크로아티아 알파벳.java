import java.io.*;
import java.util.*;

public class Main
{
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
	    String inputs = br.readLine();
	    
	    int count = 0;
		
		for (int i=0 ; i<inputs.length() ; i++) { 
		   inputs.charAt(i);
		   
		   
		    if (i < inputs.length()-1 && inputs.charAt(i) == 'c' && (inputs.charAt(i+1) == '=' || inputs.charAt(i+1) == '-')) {
             
                i++;
		    }
            
		    
		    if (i < inputs.length()-2 && inputs.charAt(i) == 'd' && inputs.charAt(i+1) == 'z' && inputs.charAt(i+2) == '=') {
                i++;
                i++;
		    }
		    
		    if (i < inputs.length()-1 && inputs.charAt(i) == 'd' && inputs.charAt(i+1) == '-') {
                i++;
		    }
		    
            if (i < inputs.length()-1 && inputs.charAt(i) == 'd' && inputs.charAt(i+1) == '-') {
                i++;
		    }
		    
		    if (i < inputs.length()-1 && inputs.charAt(i) == 'l' && inputs.charAt(i+1) == 'j') {
                i++;
		    }
		    
	        if (i < inputs.length()-1 && inputs.charAt(i) == 'n' && inputs.charAt(i+1) == 'j') {
                i++;
		    }
		    
		    if (i < inputs.length()-1 && inputs.charAt(i) == 's' && inputs.charAt(i+1) == '=') {
                i++;
		    }
		    
		    if (i < inputs.length()-1 && inputs.charAt(i) == 'z' && inputs.charAt(i+1) == '=') {
                i++;
		    }
		    
		    count++;
		}
		
		bw.write(count+"");
		
		
	   
		bw.close();
		br.close();
	}
}
