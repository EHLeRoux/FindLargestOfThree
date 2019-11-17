package work;

public class findLargestThreeNumbers {

	static int[] threeNumArray = new int[3];

	public static int[] findLargestThreeNum(int[] array) {
		threeNumArray[0] = 0;
		threeNumArray[1] = 0;
		threeNumArray[2] = 0;
		return max(array, 3);
	}

	public static int[] max(int[] array, int iterations) {

		int largest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == largest) {
				array[i] = Integer.MIN_VALUE;
				break;
			}
		}

		for (int j = 2; j >= 0; j--) {
			if (threeNumArray[j] == 0) {
				threeNumArray[j] = largest;
				break;
			}

		}

		iterations -= 1;

		if (iterations == 0) {
			return threeNumArray;
		}

		return max(array, iterations);
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// -1,-2,-3,-7,-17,-27,-18,-541,-8,-7,7
	public static void main(String[] args) {
		print(findLargestThreeNum(new int[] { -1, 1, -2 }));
	}
}
