class Strings {
	
	public static void main(String[] args) {
		//String str = new String("A string");
		//String s = "A string";

		//if (str.equals(s)) {
		//	System.out.println("A");
		//}else {
		//	System.out.println("B");
		//}

		//char c = 'r';

		//for (int i =0; i<str.length(); i++) {
		//	System.out.println(str.charAt(i));
		//}
		//for (int i = 0; i < str.length()-1; i++ ) {
		//	System.out.println(str.substring(i ,i+2));
		//}
		//if (contains("snailracecat", "cat")) {
		//	System.out.println("yes");
		//}else {
		//	System.out.println("no");
		//}
		//System.out.println(count("people", "e"));
		//if (isPalindrom("racecar")) {
		//	System.out.println("yes");
		//}else {
		//	System.out.println("false");
		//}
		//if (hasA("star")) {
		//	System.out.println("yes");
		//}else {
		//	System.out.println("no");
		//}	
		//if (hasA("Apple")) {
		//	System.out.println("yes");
		//}else {
		//	System.out.println("no");
		//}	
		String a = "abdest";
		if (isAbecedarian(a)) {
			System.out.println("yay");
		}else{
			System.out.println("noooooooooooooœ my cabbages");
		}
	}

	public static boolean isAbecedarian(String s){
		char lastLetter;
		if (s.isEmpty()) {
			return true;
		}
		lastLetter = s.charAt(0);
		for (int i = 0; i<s.length();i++ ) {
			System.out.println(s.charAt(i));
			if (s.charAt(i) >= lastLetter) {
				lastLetter = s.charAt(i);
			}else {
				return false;
			}
		}

		return true;
	}





	public static boolean hasA(String s){
		if(contains(s, "a")){
			return true;
		}
		return contains(s, "A"); 
	}



	public static int count(String s, String t){
		int times = 0;
		for (int i = 0; i<s.length()-t.length()+1; i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				times++;
			}
		}
		return times;
	}

	public static boolean contains(String s, String t){
		if(count(s, t) > 0){
			return true;
		}
		return false;
	}
	public static boolean isPalindrom(String s){
			for (int i = 0; i < s.length()-1; i++) {
				if (s.substring(i, i+1).equals(s.substring(s.length()-i-2, s.length()-i-1))) {
					
				}else {
					return false;
				}
			}		
			return true;	

	}



}