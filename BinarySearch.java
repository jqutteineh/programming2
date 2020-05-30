package part1;

public class BinarySearch {
	public static int Binary_Search(int Array[], int first, int last, int target) {
		while (last >= first) {
			int mid = (first + last) / 2;
			if (Array[mid] == target) {
				return mid;
			}
			if (Array[mid] > target) {
				return Binary_Search(Array, first, mid - 1, target);// search in left subarray
			} else {
				return Binary_Search(Array, mid + 1, last, target);// search in right subarray
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int Array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 60;
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Item at location " + i + " = " + Array[i]);
		}
		int last = Array.length - 1;
		int result = Binary_Search(Array, 0, last, target);
		if (result == -1)
			System.out.println("Target is not found.");
		else
			System.out.println("Target is "+ target +" found at index: " + result);
	}
}
