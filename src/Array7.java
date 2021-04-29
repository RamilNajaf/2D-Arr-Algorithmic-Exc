class Array7
{
	public static boolean check(int[][] array)
	{
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[0].length - 1; j++) {
				if (array[i][j] == array[i + 1][j + 1]) {
					return true;
				}
			}
	}
		return false;
	}

	public static void main(String[] args)
	{
		int[][] arr=
		{
				{ 1  ,  5   , 6},
				{ 2  ,  1   , 5},
				{ 3  ,  2   , 1},
				{ 4  ,  3   , 2},
		};

		if (check(arr)) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	
}
}
