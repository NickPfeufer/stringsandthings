public class Arrays {
	
	public static void main(String[] args) {
		int[] data2 = {1,2,3,4,5,6,7,8,9,10,11};
		//int[] data = new int[3];
		int[] data = new int[10];
		int[] allfive = {5,5,5,5,5};

		for (int i = 0; i < data.length; i++) {
			data[i] = 10-i;
		//	System.out.println(data[i] + " ");
		}
		System.out.println("data1: ");
		printarray(data);
		System.out.println("data2: ");
		printarray(data2);
		System.out.println("double data1: ");
		doubleallthearray(data);
		printarray(data);
		System.out.println("---------");
		printarray(allfive);
		evenoddall(allfive);
		System.out.println("---------");
		System.out.println("Decending: ");
		twolargest(data);
		System.out.println("Increasing: ");
		twolargest(data2);
		System.out.println("---------");
		closesttozero(data);
		System.out.println("---------");
		int[] data3 = smasharray(data, data2);
		System.out.println("smashed data1, data2");
		printarray(data3);
		System.out.println("----------");
		System.out.println("and that sorted is: ");
		printarray(sort(data3));

	}

	public static void doubleallthearray(int[] a){
		for (int i = 0; i < a.length; i++) {
			a[i] *= 2;
		};
	}
	public static void printarray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}		
	}
	public static void evenoddall(int[] a){
		int answer1 = 0;
		int answer2 = 0;

		for (int i = 1; i < a.length; i+=2) {
			answer1 += a[i];
		};
		System.out.println("Sum of odd " + answer1);
		
		for (int i = 0; i < a.length ; i+=2) {
			answer2 += a[i];
		};
		System.out.println("Sum of even " + answer2);
		
		int answer = answer1 + answer2;
		System.out.println("Sum of both " + answer);
	}
	public static void twolargest(int[] a){
		int first = a[0];
		int second = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > first) {
				second = first;
				first = a[i];
			};
		};
		if (second == 0) {
			second = a[1];
			for (int i = 1; i < a.length ; i++) {
				if (a[i] > second) {
					second = a[i];
				};				
			};
		};
		System.out.println("Largest number: " + first);
		System.out.println("Second Largest: " + second);

	}
	public static void closesttozero(int[] a){	
		int closest = a[0];
		int x;
		int location = 0;
		for (int i = 0; i < a.length; i++) {
			x = a[i];
			if (x < 0) {
				x *= -1;
			};
			if (closest < 0) {
				if (x < -closest){
					closest = a[i];
					location = i;
				}		
			}else if (x < closest){
				closest = a[i];
				location = i;
			}			
		}
		System.out.println("The closest value to zero is: " + closest);
		System.out.println("It is at index: "+location);
	}
	public static int[] smasharray(int[] a, int[] b){
		int length = a.length + b.length;
		int[] x = new int[length];
		for (int i = 0; i < a.length; i++) {
			x[i] = a[i];
		};
		for (int i = 0; i < b.length; i++) {
			x[i+a.length] = b[i];
		}
		return x;
	}
	public static int[] sort(int[] a){
		int[] x = new int[a.length];
		for (int i = 0; i<a.length; i++) {
			x[i] = a[i];

		}

		int flipflop;
		int iteration;
		for (int i = 0; i<x.length; i++) {
			iteration = -1;
			for (int j = i; j < x.length; j++) {
				if (x[i] < x[j]) {
					iteration = j;
				}
			}
			if (iteration > -1) {
				flipflop = x[i];
				x[i] = x[iteration];
				x[iteration] = flipflop;				
			}
			
		}
		return x;



	}


}