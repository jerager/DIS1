import java.io.*;
public class Hwk1 {

	
	    public static void main(String args[]) throws IOException {


	        boolean done = false;
	        char readch;
	        int stopgap;
	        int vowelcount = 0;
	        int conscount = 0;

	        BufferedReader keyboard = new BufferedReader(new 
	InputStreamReader(System.in));
	        String stopgapS = keyboard.readLine();
	        stopgap = Integer.parseInt(stopgapS);

	        while (!done) {
	            
	            readch = (char) keyboard.read();
	            if ((readch == 'a') || (readch == 'e') || (readch == 'i') ||
	                (readch == 'o') || (readch == 'u'))
	                vowelcount = vowelcount+1;
	            else conscount = conscount +1;
	            
	            if (readch == 's') done = true;
	            if (vowelcount - conscount > stopgap) done = true;
	 
	        }

	        System.out.println("Number of vowels :"+vowelcount);
	        System.out.println("Number of Consonants :"+conscount);  }
	    
}



