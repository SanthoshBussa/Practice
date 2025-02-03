// Find the second largest element in an array.

	public static int secMax(int[] arr) {
		if (arr.length < 2)
			return -1;
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < arr.length; i++) {
			int n1 = arr[i];
			if (n1 > max) {
				secMax = max;
				max = n1;
			} else if (max == secMax || i > secMax) {
				if (n1 != max)
					secMax = n1;
			}
		}
		return secMax;
	}


// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

	public static void checkTarget(int arr[], int target) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == target) {
					System.out.println(i + " + " + j + " = " + sum);
				}
			}
		}
	}

// Move all zeros to the end of an array while maintaining the order of non-zero elements.

	public static int[] reArrange(int arr[]) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		while (index < arr.length) {
			arr[index++] = 0;
		}
		return arr;
	}
