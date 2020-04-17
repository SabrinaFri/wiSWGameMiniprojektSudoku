package wiSWGameMiniprojektSudoku.SudokuView;



import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import wiSWGameMiniprojektSudoku.SudokuModel.SudokuModel;

public class SudokuView{
	private SudokuModel model; 
	private Stage stage;
	private Scene scene;
	
	private VBox sudokuViewB;
	private HBox ButtonBox;
	private GridPane GameBoard;
	private GridPane BoardRegion1;
	private GridPane BoardRegion2;
	private GridPane BoardRegion3;
	private GridPane BoardRegion4;
	private GridPane BoardRegion5;
	private GridPane BoardRegion6;
	private GridPane BoardRegion7;
	private GridPane BoardRegion8;
	private GridPane BoardRegion9;
	private Cell numbers[][];
	private int BoardNumbers [][];
	private Button check;
	private Label l;
	static final int SIZE_BOARD = 9;
	
	public SudokuView(Stage stage, SudokuModel model) {
		this.stage = stage;
		this.model = model;
		
stage.setTitle("Sudoku Game");
		
		GameBoard = new GridPane(); 
		BoardRegion1 = new GridPane();
		BoardRegion2 = new GridPane();
		BoardRegion3 = new GridPane();
		BoardRegion4 = new GridPane();
		BoardRegion5 = new GridPane();
		BoardRegion6 = new GridPane();
		BoardRegion7 = new GridPane();
		BoardRegion8 = new GridPane();
		BoardRegion9 = new GridPane();

		numbers = new Cell[SIZE_BOARD][SIZE_BOARD];
		BoardNumbers = new int[SIZE_BOARD][SIZE_BOARD];
		BoardNumbers = model.getCreateGameBoard();
		check = new Button("Spiel korrigieren");
		l = new Label("Nachdem Sie alle Zahlen eingefüllt haben, können Sie mit dem Button -Spiel korrigieren- ihre eingaben kontrollieren.");
		l.setMaxWidth(350);
		l.setWrapText(true);

		
	
		for(int i = 0; i < SIZE_BOARD; i++) {
			for (int j = 0; j < SIZE_BOARD; j++)
			numbers[i][j] = new Cell();
		}
		
		
		for(int i = 0; i < SIZE_BOARD; i++) {
			for (int j = 0; j < SIZE_BOARD; j++) {
				if(BoardNumbers[i][j] != 0) {
					numbers[i][j].setText(String.valueOf(BoardNumbers[i][j]));
				}else {
					numbers[i][j].setEditable();
				}
			}
		}
		
		
		BoardRegion1.add(numbers[0][0],1,1);
		BoardRegion1.add(numbers[0][1],2,1);
		BoardRegion1.add(numbers[0][2],3,1);
		BoardRegion1.add(numbers[1][0],1,2);
		BoardRegion1.add(numbers[1][1],2,2);
		BoardRegion1.add(numbers[1][2],3,2);
		BoardRegion1.add(numbers[2][0],1,3);
		BoardRegion1.add(numbers[2][1],2,3);
		BoardRegion1.add(numbers[2][2],3,3);
		
		
		BoardRegion2.add(numbers[0][3],1,1);
		BoardRegion2.add(numbers[0][4],2,1);
		BoardRegion2.add(numbers[0][5],3,1);
		BoardRegion2.add(numbers[1][3],1,2);
		BoardRegion2.add(numbers[1][4],2,2);
		BoardRegion2.add(numbers[1][5],3,2);
		BoardRegion2.add(numbers[2][3],1,3);
		BoardRegion2.add(numbers[2][4],2,3);
		BoardRegion2.add(numbers[2][5],3,3);
		
		
		BoardRegion3.add(numbers[0][6],1,1);
		BoardRegion3.add(numbers[0][7],2,1);
		BoardRegion3.add(numbers[0][8],3,1);
		BoardRegion3.add(numbers[1][6],1,2);
		BoardRegion3.add(numbers[1][7],2,2);
		BoardRegion3.add(numbers[1][8],3,2);
		BoardRegion3.add(numbers[2][6],1,3);
		BoardRegion3.add(numbers[2][7],2,3);
		BoardRegion3.add(numbers[2][8],3,3);
		
		BoardRegion4.add(numbers[3][0],1,1);
		BoardRegion4.add(numbers[3][1],2,1);
		BoardRegion4.add(numbers[3][2],3,1);
		BoardRegion4.add(numbers[4][0],1,2);
		BoardRegion4.add(numbers[4][1],2,2);
		BoardRegion4.add(numbers[4][2],3,2);
		BoardRegion4.add(numbers[5][0],1,3);
		BoardRegion4.add(numbers[5][1],2,3);
		BoardRegion4.add(numbers[5][2],3,3);
		
		BoardRegion5.add(numbers[3][3],1,1);
		BoardRegion5.add(numbers[3][4],2,1);
		BoardRegion5.add(numbers[3][5],3,1);
		BoardRegion5.add(numbers[4][3],1,2);
		BoardRegion5.add(numbers[4][4],2,2);
		BoardRegion5.add(numbers[4][5],3,2);
		BoardRegion5.add(numbers[5][3],1,3);
		BoardRegion5.add(numbers[5][4],2,3);
		BoardRegion5.add(numbers[5][5],3,3);
		
		BoardRegion6.add(numbers[3][6],1,1);
		BoardRegion6.add(numbers[3][7],2,1);
		BoardRegion6.add(numbers[3][8],3,1);
		BoardRegion6.add(numbers[4][6],1,2);
		BoardRegion6.add(numbers[4][7],2,2);
		BoardRegion6.add(numbers[4][8],3,2);
		BoardRegion6.add(numbers[5][6],1,3);
		BoardRegion6.add(numbers[5][7],2,3);
		BoardRegion6.add(numbers[5][8],3,3);

		BoardRegion7.add(numbers[6][0],1,1);
		BoardRegion7.add(numbers[6][1],2,1);
		BoardRegion7.add(numbers[6][2],3,1);
		BoardRegion7.add(numbers[7][0],1,2);
		BoardRegion7.add(numbers[7][1],2,2);
		BoardRegion7.add(numbers[7][2],3,2);
		BoardRegion7.add(numbers[8][0],1,3);
		BoardRegion7.add(numbers[8][1],2,3);
		BoardRegion7.add(numbers[8][2],3,3);
		
		BoardRegion8.add(numbers[6][3],1,1);
		BoardRegion8.add(numbers[6][4],2,1);
		BoardRegion8.add(numbers[6][5],3,1);
		BoardRegion8.add(numbers[7][3],1,2);
		BoardRegion8.add(numbers[7][4],2,2);
		BoardRegion8.add(numbers[7][5],3,2);
		BoardRegion8.add(numbers[8][3],1,3);
		BoardRegion8.add(numbers[8][4],2,3);
		BoardRegion8.add(numbers[8][5],3,3);
		
		BoardRegion9.add(numbers[6][6],1,1);
		BoardRegion9.add(numbers[6][7],2,1);
		BoardRegion9.add(numbers[6][8],3,1);
		BoardRegion9.add(numbers[7][6],1,2);
		BoardRegion9.add(numbers[7][7],2,2);
		BoardRegion9.add(numbers[7][8],3,2);
		BoardRegion9.add(numbers[8][6],1,3);
		BoardRegion9.add(numbers[8][7],2,3);
		BoardRegion9.add(numbers[8][8],3,3);
		
		
		GameBoard.add(BoardRegion1,1,1);
		GameBoard.add(BoardRegion2,2,1);
		GameBoard.add(BoardRegion3,3,1);
		GameBoard.add(BoardRegion4,1,2);
		GameBoard.add(BoardRegion5,2,2);
		GameBoard.add(BoardRegion6,3,2);
		GameBoard.add(BoardRegion7,1,3);
		GameBoard.add(BoardRegion8,2,3);
		GameBoard.add(BoardRegion9,3,3);
		
			     
	   
	    GameBoard.setPadding(new Insets(5));
	    BoardRegion1.setPadding(new Insets(2));
	    BoardRegion2.setPadding(new Insets(2));
	    BoardRegion3.setPadding(new Insets(2));
	    BoardRegion4.setPadding(new Insets(2));
	    BoardRegion5.setPadding(new Insets(2));
	    BoardRegion6.setPadding(new Insets(2));
	    BoardRegion7.setPadding(new Insets(2));
	    BoardRegion8.setPadding(new Insets(2));
	    BoardRegion9.setPadding(new Insets(2));
     
	   
	    GameBoard.setPadding(new Insets(5));

		
		GameBoard.getStyleClass().add("GameBoard");
		ButtonBox = new HBox();
		ButtonBox.getChildren().addAll(check,l);
		ButtonBox.setSpacing(10);

		sudokuViewB = new VBox();
		sudokuViewB.getChildren().add(ButtonBox);
		sudokuViewB.getChildren().add(GameBoard);
		

				
		scene = new Scene(sudokuViewB);
		scene.getStylesheets().add(
				getClass().getResource("sudoku.css").toExternalForm());
		stage.setScene(scene);
	}
	
	
	public Cell getNumberCell(int i, int j) {
		return numbers[i][j];
	}
	

	public Button getCheckButton() {
		return this.check;
	}
	

	
	public void setCorrectFormat(int i, int j) {
		numbers[i][j].setEditableCorrect();
	}
	
	public void setInorrectFormat(int i, int j) {
		numbers[i][j].setEditableInorrect();
	}
	
	public void setEditableFormat(int i, int j) {
		numbers[i][j].setEditable();
	}
	
	public int getBoardNumbers(int i, int j){
		return BoardNumbers[i][j];
	}
	
	
	public void start() {
		stage.show();
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}


}
