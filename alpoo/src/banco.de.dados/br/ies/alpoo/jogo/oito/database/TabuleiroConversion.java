package br.ies.alpoo.jogo.oito.database;

public class TabuleiroConversion {
	public String[][] stringToArray(String string) {
		String s= string;
	    s=s.replace("{","");//replacing all [ to ""
	    s=s.substring(0,s.length()-2);//ignoring last two ]]
	    String s1[]=s.split("},");//separating all by "],"

	    String my_matrics[][] = new String[s1.length][s1.length];//declaring two dimensional matrix for input

	    for(int i=0;i<s1.length;i++){
	        s1[i]=s1[i].trim();//ignoring all extra space if the string s1[i] has
	        String single_int[]=s1[i].split(",");//separating integers by ", "

	        for(int j=0;j<single_int.length;j++){
	            my_matrics[i][j]=single_int[j];//adding single values
	        }
	    }
	    return my_matrics;
	}
	
	public static Integer[][] convertString2DToInt(String[][] array){

	    Integer [][] numbers = new Integer [array.length][];
	    for(int row = 0; row < array.length; row++)
	    {
	        numbers[row] = new Integer [array[row].length];                //line 48
	        for(int col = 0; col < array[row].length; col++)
	        {
	            numbers[row][col] = Integer.parseInt(array[row][col]);
	        }
	    }
	    return numbers;
	}
	
	public String[][] convertInt2DToString(Integer[][] tabuleiro) {
		String[][] board = new String[3][3];

		for(int i=0 ; i<3;i++){
			for(int j=0 ; j<3; j++){
				board[i][j] = tabuleiro[i][j].toString();
			}
		}
		return board;
	}
}
