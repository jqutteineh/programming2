package part1;

public class BinarySearch {
	public static int findValue(int array[], int first, int last, int target) {
		while (last >= first) {
			int mid = (first + last) / 2;
			if (array[mid] == target) {
				return mid;
			}
			if (array[mid] > target) {
				return findValue(array, first, mid - 1, target);// search in left subarray
			} else {
				return findValue(array, mid + 1, last, target);// search in right subarray
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 60;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Item at location " + i + " = " + array[i]);
		}
		int last = array.length - 1;
		int result = findValue(array, 0, last, target);
		if (result == -1)
			System.out.println("Target is not found.");
		else
			System.out.println("Target is "+ target +" found at index: " + result);
	}
}
