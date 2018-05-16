public class array_practice {
	public static void main(String[] args) {

		int[] value = {1, 2, 3, 4};
		System.out.println(value[2]);

		// 2d array means values need to be expressed with two numbers
		// length must be specified. rows do not have to equal columns
		int[][] grid = {
		// type must be specified
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		System.out.println(grid[2][2]);

		// for loops begin with the independent variable, the condition on the independent variable
		// that ends loop, and how the independent variable changes with each loop

		// first iterates through all the rows, then all columns, and prints every comboniation of row and column
		for(int row=0; row<grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				System.out.println(grid[row][col] + "\t");
			}

			System.out.println();
		}



		// arrays do not have to be filled. size must be specified at start
		String[][] texts = new String[2][3];
		texts[0][0] = "Hello there";
		System.out.println(texts[0][0]);
	}
}