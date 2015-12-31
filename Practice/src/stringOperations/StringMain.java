package stringOperations;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "raghvend";
		//String str = "Hey I am Good";
		//System.out.println(stringOperations(name));

		//String Unique in O(n)
		StringUnique su = new StringUnique();
		System.out.println(su.stringUnique(name));

		/*//String Unique in O(n^2)
		stringOperations su = new stringOperations();
		su.stringUniq(name);
		 */

		/*//String Reverse
		StringRev st = new StringRev();
		st.revString(name);
		 */

		/*		//Strings Permutation
		String name1 = "god";
		String name2 = "dog";
		StringPermutation sp = new StringPermutation();
		System.out.println("Are the two strings permutable: 1)" + name1+ " and 2)" +name2 + "\nAns: " + sp.permString(name1, name2));
		 */
		/*//String replace space with %20
		char[] str = {'t', 'h', 'e', ' ', 'd', 'o', 'g', ' ', ' ', ' ', ' ', ' ', ' '};
		int len = 7;
		stringReplace sr = new stringReplace();
		sr.stringRep(str, len);*/

		/*//Compress String
		String str = "abbcccdddd";
 		CompressString cs = new CompressString();
 		System.out.println(cs.compressString(str));
		 */

		/*//Rotate Matrix by 90
		int image[][] = {{00,01,02,03}, {10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
		MatrixRotation img = new MatrixRotation();
		img.matrixRotation(image);*/

		/*		int[][] matrix = 
			{ 
				{1, 0, 1, 1, 0},
				{0, 1, 1, 1, 0},
				{1, 1, 1, 1, 1},
				{1, 0, 1, 1, 1},
				{1, 1, 1, 1, 1}
			};
		MatrixZero mz = new MatrixZero();
		mz.matrixZero(matrix);		
		 */	

		/*SubstringRotation sr = new SubstringRotation();
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(sr.substringRotation(s1, s2));*/
		
		
	}	
}
