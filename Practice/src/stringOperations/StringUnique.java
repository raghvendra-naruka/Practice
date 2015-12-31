package stringOperations;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringUnique {

	boolean stringUnique(String str){
		if(str.length() > 256)
			return false;
		boolean[] charSet = new boolean[256]; 
		for(int i=0; i<str.length(); i++){	//O(n) 
			int val = str.charAt(i);
			//System.out.println(val);
			//System.out.println(Arrays.toString(charSet));
			if(charSet[val])
				return false;
			charSet[val] = true;
		}
		return true;
	}

	/*
	void stringUniq(String name){
		int count = 0;
		char[] a = name.toCharArray();
		for(int i= 0; i<name.length(); i++){		//O(n^2)  
			for(int j=i+1; j<name.length(); j++){
				if(a[i] == a[j]){
					count++;
					System.out.println(a[i]+"\t" + a[j]);
				}

			}
		}
		if(count >0){
			System.out.println("not unique");
		}else{
			System.out.println("Unique");
		}
	}
	 */
}
