package separateNumbers;

//This Java program accepts 10 integers and stores them in an
//array and then first prints the negative integers and
//then the positive integers in the way they are present in
//the array.

public class SepNum
{
	private static void rearrangeArray(int[] a, int length){

		int i;
		for(i=0; i<length; i++)
			if(a[i]<0)
				System.out.println(a[i]);

		for(i=0; i<length; i++)
			if(a[i]==0)
				System.out.println(a[i]);

		for(i=0; i<length; i++)
			if(a[i]>0)
				System.out.println(a[i]);
	}

	private static void printArray(int[] a, int length){ 
		for(int i=0; i<length; i++)
			System.out.println(a[i]);
	}

	public static void main(String Srgs[])
	{
		int a[]= {1, -2, -4, -8, 5, -6, 7, 0, -3, 9, -10, -12, -11, 20};
		int n = a.length;
		System.out.println("Given numbers");
		printArray(a, n);
		System.out.println("Now the array after separation is:- ");
		rearrangeArray(a, n);



	}
}
