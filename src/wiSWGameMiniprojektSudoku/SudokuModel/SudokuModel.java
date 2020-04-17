package wiSWGameMiniprojektSudoku.SudokuModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class SudokuModel {
	private int [][] gameBoard;
	private int [][] createGameBoard;
	private final int BOARD_SIZE = 9;
	private final String SUDOKU_FILE = "/wiSWGameMiniprojektSudoku/SudokuModel/Games/SudokuEinsteiger";
	private final String SUDOKU_FILE_Part2 = "-L.txt";
	private String packageFileData;
	
	
	public SudokuModel(){
		readPackageFile();	
		getCreateGameBoard();
	}
	
	public void GameBoard() {
		gameBoard = new int [BOARD_SIZE][BOARD_SIZE];
	}

	private void readPackageFile() {
		Random rand = new Random();
		int c = rand.nextInt(2)+1;
		InputStream inStream = this.getClass().getResourceAsStream(SUDOKU_FILE+"0"+c+SUDOKU_FILE_Part2);
		try(BufferedReader fileIn = new BufferedReader(new InputStreamReader(inStream))){
			gameBoard = new int [BOARD_SIZE][BOARD_SIZE];
			int i = 0;
			String line = fileIn.readLine();
			while (line != null) {
					String var[] = line.split(",");
				
					gameBoard[i][0] = Integer.parseInt(var[0]);
					gameBoard[i][1] = Integer.parseInt(var[1]);
					gameBoard[i][2] = Integer.parseInt(var[2]);
					gameBoard[i][3] = Integer.parseInt(var[3]);
					gameBoard[i][4] = Integer.parseInt(var[4]);
					gameBoard[i][5] = Integer.parseInt(var[5]);
					gameBoard[i][6] = Integer.parseInt(var[6]);
					gameBoard[i][7] = Integer.parseInt(var[7]);
					gameBoard[i][8] = Integer.parseInt(var[8]);
					
					i++;	
					line = fileIn.readLine();
			}
			}catch (IOException e)	{
				gameBoard = null;
			}
		
		for(int i= 0; i<9;i++) {
			for(int y = 0; y < 9;y++) {
				System.out.print(gameBoard[i][y]+",");
			}System.out.println("");
		}
		
		}
				
		public int[][] getCreateGameBoard() {
			createGameBoard = new int[BOARD_SIZE][BOARD_SIZE];
			Random rand = new Random();
			int r = 0;
			
			for(int i = 0; i < BOARD_SIZE; i++) {
				for (int j = 0; j < BOARD_SIZE; j++) {
					r = rand.nextInt(2);
					if(r == 1) {
						createGameBoard[i][j] = gameBoard[i][j];
					}
				}				
			}
			
			System.out.println("----createGameBoard----");
			for(int i= 0; i<9;i++) {
				for(int y = 0; y < 9;y++) {
					System.out.print(createGameBoard[i][y]+",");
				}System.out.println("");
			}
			return this.createGameBoard;
	}
		
		public String getFile() {
			return packageFileData;
		}
		
		public int [][] getGameBoard(){
			return gameBoard;
		}
		
		public void setGameBoard(int gameBoard[][]) {
			this.gameBoard = gameBoard;
		}
		
		public int getBoardSize() {
			return this.BOARD_SIZE;
		}
		
		public int getNumberBoard(int i, int j) {
			return gameBoard[i][j];
		}


}
