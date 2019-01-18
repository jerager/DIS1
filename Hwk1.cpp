//import java.io.*;
#include <iostream>
using namespace std;
int main()  {


	        bool done = false;
	        char readch;
	        int stopgap;
	        int vowelcount = 0;
	        int conscount = 0;

		string stopgapS;
		cin >> stopgap;

	        while (!done) {
	            
		  cin >> readch;
	            if ((readch == 'a') || (readch == 'e') || (readch == 'i') ||
	                (readch == 'o') || (readch == 'u'))
	                vowelcount = vowelcount+1;
	            else conscount = conscount +1;
	            
	            if (readch == 's') done = true;
	            if (vowelcount - conscount > stopgap) done = true;
	 
	        }

	        cout << "Number of vowels :" << vowelcount;

		cout << "Number of Consonants :" << conscount;

}



