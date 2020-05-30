package part1;


public class LinearSearch {
	public static void main(String[] args) {

		int Array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		
		int index = findValue(50, Array);
		
		System.out.println(
				"Target is " + 50 + " ...First available at " + index );
		
		int index2 = findValue(200, Array);
		
		System.out.println(
				"Target is " + 200 + " ...*Not available* =  " + index2 );

	}

	public static int findValue(int target, int[] Array) {

		for (int i = 0; i < Array.length; i++) {
			System.out.println("Item at location " + i + " = " + Array[i]);
			if (Array[i] == target) {

				return i;
			}

		}

		return -1;

	}

}
