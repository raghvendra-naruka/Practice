package stringOperations;

public class StringPermutation {

	boolean permString(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		return sortString(str1).equals(sortString(str2));
	}

	String sortString(String str){
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		System.out.println("The sorted char array is: " + java.util.Arrays.toString(content));
		return new String(content);
	}
}
