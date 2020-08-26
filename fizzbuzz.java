public class fizzbuzz{
	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i = 0; i < numArray.length ; i++ )	System.out.print(numArray[i]+" ");
		System.out.println("\n");
		for (int i = 0; i < numArray.length  ; i++)
			if (numArray[i]%3==0 && numArray[i]%5==0)	System.out.println("FIZZ_BUZZ");
			else if (numArray[i]%3==0)	System.out.println("FIZZ");
			else if (numArray[i]%5==0)	System.out.println("BUZZ");
			else System.out.println(numArray[i]);
	}
}