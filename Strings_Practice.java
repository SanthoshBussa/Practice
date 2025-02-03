//	Check if a string is a palindrome.

	public static boolean isPalindrome(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		if (str.equals(res))
			return true;
		else
			return false;
	}


//	Reverse words in a given string.
	
	public static String reverse(String str) {
		String[] words = str.split(" ");
		String res="";
		for(int i=words.length-1; i>=0; i--) {
			res+=words[i]+" ";
		}
		return res;
	}


