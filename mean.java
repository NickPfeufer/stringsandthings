import java.util.Random;

class mean {
	private static Random r = new Random(5345);

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.println("The average of the array is ");
		System.out.println(meanarray(randomArray)+ ".");

		System.out.println("The average from index 40 to index 45 is ");
		System.out.println(meanOfRange(randomArray, 40, 45) + ".");
	}

	public static double meanarray(int[] a){
		return meanOfRange(a, 0, a.length -1);
	}

	public static double meanOfRange(int[] a, int start, double end){
		double x = 0;
		for (int i = start; i <= end; i++) {
			if (i < a.length) {
				x += a[i];
			}
		}

		x /= (end - start + 1);
		return x;		
	}

	public static int[] makeRandom(int size, int range){
		int[] a = new int[size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range + 1);
		}

		return a;
	}


}