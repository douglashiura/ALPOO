package br.ies.aula.alpoo.EightGame;

import java.util.Random;

public class EightGame {
	private static int[][] table = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
	private static Random random;
	private int swap;
	
	private static void setUp() {
		//to setup random numbers in table
	}
	
	private int[] findSpace(int[][] array) {
		for(int line = 0; line < 3; line++) {
			for(int column = 0; column < 3; column++) {
				if(array[line][column] == 0) {
					System.out.println(line);
					System.out.println(column);
					int[] coordinates = {line, column};
					return coordinates;
				}
			}
		}
		return null;
	}
	
	public void moveUP() {
		int[] spaceCoordinates = findSpace(table);
		swap = table[spaceCoordinates[0]][spaceCoordinates[1]];
		System.out.println(swap);
		if(spaceCoordinates[1] > 3) {
			table[spaceCoordinates[0]][spaceCoordinates[1]] = swap;
			table[spaceCoordinates[0]][spaceCoordinates[1]] -= 3;
		}
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void moveDown() {
		
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
