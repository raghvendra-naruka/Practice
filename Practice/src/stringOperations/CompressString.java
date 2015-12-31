package stringOperations;

public class CompressString {
	String compressString(String str){
		int length = str.length();
		String newStr = "";
		char s = str.charAt(0);
		int count = 0;
		for(int i=1; i<length; i++){
			if(s == str.charAt(i))
				count++;
			else{
				newStr += s +""+ count;
				s = str.charAt(i);
				count = 1;
			}
		}
		return newStr + s + count;
	}
}
