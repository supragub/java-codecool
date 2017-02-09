package hu.suprasoft.matrixgenerator;

/**
 * @author VarGabor
 *
 */

public class MatrixGenerator {

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int[][] matrix = generateMatrix(x, y);
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int x, int y) {

		int[][] matrix = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrix[i][j] = i * j;
			}
		}

		return matrix;
	}
}
