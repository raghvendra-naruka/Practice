package stringOperations;

public class SubstringRotation {

	boolean substringRotation(String s1, String s2){
		if(s1.length() == s2.length() && s1.length() > 0){
			String s1s1 = s1 + s1;
			//return isSubstring(s1s1, s2);
			return s1s1.contains(s2);
		}
		return false;
	}
}
