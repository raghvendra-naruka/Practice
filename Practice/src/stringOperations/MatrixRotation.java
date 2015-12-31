package stringOperations;

public class MatrixRotation {
	void matrixRotation(int[][] matrix){
		int n = matrix.length;
		System.out.println("size: " + n);
		int[][] result = new int[n][n];

		System.out.println("Given Matrix: ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nRotated Matrix after 90 clockwise: ");
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				result[j][n-i-1] = matrix[i][j];
				//result[n-j-1][i] = matrix[i][j];// anti-clockwise  
			}
		} 

		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = result[i][j];
				System.out.print(matrix[i][j]+ "\t");
			}
			System.out.print("\n");
		} 


	}
}
