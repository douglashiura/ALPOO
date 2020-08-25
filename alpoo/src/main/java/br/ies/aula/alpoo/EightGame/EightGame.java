package br.ies.aula.alpoo.EightGame;

import java.util.Random;

public class EightGame {
	private static int[][] table = {{1, 2, 3}, 
									{7, 4, 6}, 
									{8, 5, 0}};
	private static Random random;
	private int swap;
	
	private static void setUp() {
		//to setup random numbers in table
	}
	
	private int[] findSpace(int[][] array) {
		for(int line = 0; line < 3; line++) {
			for(int column = 0; column < 3; column++) {
				if(array[line][column] == 0) {
					int[] coordinates = {line, column};
					return coordinates;
				}
			}
		}
		return null;
	}
	
	public void moveUP() {
		int[] spaceCoordinates = findSpace(table);
		int axisX = spaceCoordinates[0];
		int axisY = spaceCoordinates[1];
		
		int space = table[axisX][axisY];
		
		if(axisX > 0) {
			swap = table[axisX - 1][axisY];
			table[axisX - 1][axisY] = space;
			table[axisX][axisY] = swap;
		}
	}
	
	public void moveRight() {
		int[] spaceCoordinates = findSpace(table);
		int axisX = spaceCoordinates[0];
		int axisY = spaceCoordinates[1];
		
		int space = table[axisX][axisY];
		
		if(axisY < 2) {
			swap = table[axisX][axisY + 1];
			table[axisX][axisY + 1] = space;
			table[axisX][axisY] = swap;
		}
	}
	
	public void moveLeft() {
		int[] spaceCoordinates = findSpace(table);
		int axisX = spaceCoordinates[0];
		int axisY = spaceCoordinates[1];
		
		int space = table[axisX][axisY];
		
		if(axisY > 0) {
			swap = table[axisX][axisY - 1];
			table[axisX][axisY - 1] = space;
			table[axisX][axisY] = swap;
		}
	}
	
	public void moveDown() {
		int[] spaceCoordinates = findSpace(table);
		int axisX = spaceCoordinates[0];
		int axisY = spaceCoordinates[1];
		
		int space = table[axisX][axisY];
		
		if(axisX < 2) {
			swap = table[axisX + 1][axisY];
			table[axisX + 1][axisY] = space;
			table[axisX][axisY] = swap;
		}
	}
	
	public void status() {
		for(int line = 0; line < 3; line++) {
			System.out.print("|");
			for(int column = 0; column < 3; column++) {
				System.out.print(" "+ table[line][column]);
			}
			System.out.println(" |");
		}
	}
	
	static void shuffle(int array[], long seed) {
        int index;
        // Shuffle array
        for (int i= array.length; i>1; i--){
            index = (int) Math.abs( seed % i );
            //swap
            int tmp = array[i-1];
            array[i-1] = array[index];
            array[index] = tmp;
        }
    }
}
