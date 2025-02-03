// find whether element x is present in the given array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.
	
	class Solution {
	    static int search(int arr[], int x) {
	        int res=0;
	        if(arr.length<1 ) res=-1;
	        for(int i=0; i<arr.length; i++){
	            if(arr[i]==x) {
	                res=i;
	                break;
	            }else res=-1;
	        }
	        return res;
	    }
	}


// find the minimum and maximum elements in the array. Returning a Pair that contains two elements the first one will be a minimum element and the second will be a maximum.

	class Pair<K, V> {
	    private final K key;
	    private final V value;
	
	    public Pair(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }
	    public K getKey() { return key; }
	    public V getValue() { return value; }
	}
	
	class Solution {
	    public Pair<Integer, Integer> getMinMax(int[] arr) {
	        int min=arr[0];
	        int max=arr[0];
	        for(int i : arr){
	           if(i<min) min=i;
	           if(i>max) max=i;
	        }
	        return new Pair<>(min, max);
	    }
	}


// Fetching Second largest element in an array.

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


// Moveing all zeros to the end of an array while maintaining the ascending order of non-zero elements.

	public static int[] reArrange(int arr[]) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}
		for (int i=0; i<index-1; i++) {
			for(int j=0; j<index-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
		}
		
		while (index < arr.length) {
			arr[index++] = 0;
		}
		return arr;
	}


// Left Rotation an array by k positions.

	public static int[] leftRotation(int[] arr, int k) {
		int res[] = new int[arr.length];
		int m = 0;
		for (int i = k; i < arr.length; i++) {
			res[m++] = arr[i];
		}
		for (int i = 0; i < k; i++) {
			res[m++] = arr[i];
		}
		return res;
	}


// Right Rotation an array by k positions.

	public static int[] rightRotation(int[] arr, int k) {
		int res[] = new int[arr.length];
		int m = 0;
		for (int i = arr.length - k; i < arr.length; i++) {
			res[m++] = arr[i];
		}
		for (int i = 0; i < arr.length - k; i++) {
			res[m++] = arr[i];
		}
		return res;
	}


// Finding the missing number in an array of size n containing numbers from 1 to n.

	public static int missingLetter(int arr[]) {
		int n = arr[arr.length - 1];
		int expectedSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		return expectedSum - sum;
	}
