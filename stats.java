class stats{
	
	public static void main(String[] args) {
		
	}

	public static int max(int[] a){
		int maximum = a[0];
		for (int i = 0; i<a.length; i++) {
			if (maximum < a[i]) {
				maximum = a[i];
			}
		}
		return maximum;
	} 

}