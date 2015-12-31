package stringOperations;

public class stringReplace {
	void stringRep(char[] str, int length){
	
		  int spaceCount = 0, newLength = 0, i = 0;

	        for(i = 0; i < length; i++) {
	            if (str[i] == ' ') 
	                spaceCount++;
	        }

	        newLength = length + (spaceCount * 2);
	        str[newLength] = '\0';
	        for(i = length - 1; i >= 0; i--) {
	            if (str[i] == ' ') {
	                str[newLength - 1] = '0';
	                str[newLength - 2] = '2';
	                str[newLength - 3] = '%';
	                newLength = newLength - 3;
	            }
	            else {
	                str[newLength - 1] = str[i];
	                newLength = newLength - 1;
	            }
	        }
	        System.out.println(str);
		
	}
	}
		/*	//char[] string = str.toCharArray();
		int count = 0, len = 0;
		int length = string.length;
		for(int i=0; i<length; i++){
			if(string[i] == ' ')
				count++;
		}
		len = length + count * 2;
		string[len] = '\0';
		for(int i=length-1; i>=0; i--){
			if(string[i] == ' '){
				string[len-1] = '0';
				string[len-1] = '2';
				string[len-1] = '%';
				len = len - 3;
			}else{
				string[len-1] = string[i];
				len = len - 1;
			}
		}
		System.out.println(string);
	}*/
//}


/*
 
 public void replaceSpaces(char[] str, int length) {
        int spaceCount = 0, newLength = 0, i = 0;

        for(i = 0; i < length; i++) {
            if (str[i] == ' ') 
                spaceCount++;
        }

        newLength = length + (spaceCount * 2);
        str[newLength] = '\0';
        for(i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength = newLength - 3;
            }
            else {
                str[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        System.out.println(str);
    }
 
*/