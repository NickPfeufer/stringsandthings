class stats{
	
	public static void main(String[] args) {
		int[] a = {5,2,5,8,12,253,0,-2,-6,-3};
		System.out.println(max(a));
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