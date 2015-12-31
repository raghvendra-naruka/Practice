package separateNumbers;

public class SeparateNo {
	public static void main(String[] args){
		int[] a = { 1, -2, -4, -8, 5, -6, 7, 0, -3, 9, -10, -11, -12, 20 };
		System.out.println("Given Array: ");
		printNo(a);
		separateNo(a);
		System.out.println("\nArray after separation of numbers: ");
		printNo(a);
	}

	private static void printNo(int[] arr){
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	} 

	private static void separateNo(int[] arr){
		int n = arr.length;
		int i = -1, temp = 0;
		for (int j = 0; j < n; j++)
		{
			if (arr[j] < 0)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		for (int j = 0; j < n; j++)
		{
			if (arr[j] == 0)
			{
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	} 
}
