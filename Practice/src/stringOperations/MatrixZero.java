package stringOperations;

public class MatrixZero {
	void matrixZero(int[][] matrix){
		int n = matrix.length;
		//int[][] result = new int[n][n]; 
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[n];
		
		System.out.println("\nGiven Matrix: ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j] + "\t");
			}System.out.print("\n");
		}
		System.out.println("\nMatrix after replacing zero's: ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
			if(row[i] || col[j])
				matrix[i][j] = 0;
			}
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j] + "\t");
			}System.out.print("\n");
		}
	}

}
