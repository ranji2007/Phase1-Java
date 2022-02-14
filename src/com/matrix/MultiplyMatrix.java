package com.matrix;

public class MultiplyMatrix {
	public static void main(String[] args) {
		int r1 = 3, c1 = 2;
		int r2 = 2, c2 = 3;
		
		int[][] firstMatrix = { { 2, 6 }, { -9, 0 }, { 0, 4 } };
		int[][] secondMatrix = { { 3, -2, 9 }, { 6, 0, 4 } } ;
		
		int[][] product = multiplyMatrices(firstMatrix, secondMatrix, r1, c1, c2);
		//method to to matrix multiplication
		displayProduct(product); //display matrix
	}

	public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];//resultant matrix
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		return product;
	}

	public static void displayProduct(int[][] product) {
		System.out.println("Product of two matrices is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}

}
