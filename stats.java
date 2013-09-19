import java.util.Arrays;

class stats{
	
	public static void main(String[] args) {
		int[] a = {5,2,5,8,12,253,0,-2,-6,-3};
		int[] m = {5, 5, 5, 5, 5};
		int[] o = {4,3,2,5,1};
		System.out.println(max(a));
		System.out.println(min(a));
		System.out.println(mean(m));
		System.out.println(median(a));
		System.out.println(median(o));
		System.out.println(quatile1(o));
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

	public static int min(int[] a){
		int minimum = a[0];
		for (int i = 0; i<a.length; i++) {
			if (minimum > a[i]) {
				minimum = a[i];
			}
		}
		return minimum;		
	}

	public static double mean(int[] a){
		double mean = 0.0;
		for (int i = 0; i<a.length; i++) {
			mean += a[i];
		}
		mean /= a.length;
		return mean;
	}

	public static int median(int[] a){
		int[] x = new int[a.length];
		for (int i = 0; i<a.length; i++) {
			x[i] = a[i];
		}
		Arrays.sort(x);
		if (x.length%2 == 0) {
			return (x[x.length/2] + x[x.length/2-1])/2;
		}else{
			return x[(x.length-1)/2];
		}

	} 

	public static int quatile1(int[] a){
		int[] x = new int[a.length];
		int median;
		for (int i = 0; i<a.length; i++) {
			x[i] = a[i];
		}
		Arrays.sort(x);
		if (x.length%2 == 0) {
			median = x.length/2;
		}else{
			median = (x.length-1)/2;
		}
		int[] quatile = new int[median+1];
		for (int i = 0; i<quatile.length; i++) {
			quatile[i] = x[i];
		}
		return median(quatile);

	}

}