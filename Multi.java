class Multi {
	
	public static void main(String[] args) {
		int[][] a = {  { 1, 2, 3, 4, 5},
					   { 6, 7, 8, 9,10},
					   {11,12,13,14,15}  };
		print(a);
		System.out.println(sumRow(a, 0));
		System.out.println(sumCol(a, 0));
		System.out.println(sumTotal(a));
		reverseRow(a, 0);
		reverseCol(a, 0);
		int[][] b = {{4, 5},{7,8}};
		print(b);
		System.out.println(determinant2x2(b));
	}

	public static int determinant2x2(int[][] a){
		return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]);
	}

	public static int[] reverseCol(int[][] a, int c){
		int[] answer = new int[a.length];
		for (int i = 0; i<a.length; i++) {
			answer[i] = a[a.length - 1 -i][c];
			System.out.print(answer[i] + " ");			
		}
		System.out.println();
		return answer;
	}

	public static int[] reverseRow(int[][] a, int r){
		int[] answer = new int[a[r].length];
		for (int i =0 ; i<a[r].length;i++ ) {
			answer[i] = a[r][a[r].length - i - 1];
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		return answer;
	}

	public static int sumTotal(int[][] a){
		int answer = 0;
		for (int r = 0; r <  a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				answer += a[r][c];
			}
		}		
		return answer;
	}

	public static int sumCol(int[][] a, int c){
		int answer = 0;
		for (int i = 0; i<a.length;i++ ) {
			if (c < a[i].length) {
				answer += a[i][c];
			}
		}
		return answer;
	}

	public static int sumRow(int[][] a, int r){
		int answer =0;
		for (int i = 0;i<a[r].length ; i++ ) {
			answer += a[r][i];
		}
		return answer;
	}

	public static void print(int[][] a){
		for (int r = 0; r <  a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

}