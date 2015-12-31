package stringOperations;

public class StringRev {

	void revString(String str){
		if(str == null){
			System.out.println("Null String");
		}else{
		 char[] a = str.toCharArray();
		 for(int i=str.length()-1; i>=0; i--){
			 System.out.print(a[i]);
		 }
		}
	}
}
